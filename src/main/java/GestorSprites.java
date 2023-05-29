import com.fasterxml.jackson.databind.ObjectMapper;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;


public class GestorSprites {

    JFrame frame = new JFrame();
    SpriteDisplayTestigos spriteDisplayTestigos;
    SpriteDisplayJuez spriteDisplayJuez;
    SpriteDisplayFiscalia spriteDisplayFiscalia;
    SpriteDisplayDefensa spriteDisplayDefensa;

    JuezSprites juezSprites;
    MilesEdgeworthSprites milesEdgeworthSprites;
    NoraMarblerSprites noraMarblerSprites;
    PhoenixSprites phoenixSprites;
    UI ui;
    GestorMusica gestorMusica;
    Background background;




    public static class Estado {
        public String nombre;
        public String spritea;
        public String spriteb;
        public int tiempo;
        public String efectoSonido;

    }

    public static  class Personaje {
        public String nombre;
        public List<Estado> estados;
    }

    public static class Personajes {
        public List<Personaje> personajes;
    }


    public GestorSprites(SpriteDisplayFiscalia spriteDisplayFiscalia, SpriteDisplayJuez spriteDisplayJuez,
                         SpriteDisplayTestigos spriteDisplayTestigos, SpriteDisplayDefensa spriteDisplayDefensa, Background background, UI ui,
                         GestorMusica gestorMusica){


        this.spriteDisplayTestigos = spriteDisplayTestigos;
        this.spriteDisplayJuez = spriteDisplayJuez;
        this.spriteDisplayFiscalia=spriteDisplayFiscalia;
        this.spriteDisplayDefensa=spriteDisplayDefensa;
        this.ui=ui;
        this.background=background;
        this.gestorMusica=gestorMusica;
    }


    static Map sprites;

    static {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            sprites = objectMapper.readValue(new File("sprites.json"), Map.class);
        } catch (IOException e) {
        }
    }

    public void setSprite(String personaje, String estado) {

        if (personaje.equals("Juez")) {

            setSpritesNull();
            background.setBackground(background.backgroundStandJuez());
            ui.setNombrePersonaje("Juez");

            if (estado.equals("OjosCerrados")) {
                setSpritesNull();
                spriteDisplayJuez.setSpriteImage("Sprites/Sprites/JuezSprites/JuezSerio/JuezSerioOjosCerrados.gif");
            } else {
                setSpritesNull();
                System.out.println((String) ((Map) ((Map) sprites.get(personaje)).get(estado)).get("efectoSonido"));

                setAnimacionJuez((String) ((Map) ((Map) sprites.get(personaje)).get(estado)).get("a"),
                        (String) ((Map) ((Map) sprites.get(personaje)).get(estado)).get("b"),
                        (int) ((Map) ((Map) sprites.get(personaje)).get(estado)).get("time"),
                    (String) ((Map) ((Map) sprites.get(personaje)).get(estado)).get("efectoSonido"));
            }
        }

        if (personaje.equals("Phoenix")) {

            setSpritesNull();
            background.setBackground(background.backgroundStandDefensa());
            ui.setNombrePersonaje("Phoenix");

            if (estado.equals("IdleSinHablar")) {
                setSpritesNull();
                spriteDisplayJuez.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixHablando/PhoenixHablandoIdle.gif");
            } else {
                setSpritesNull();
                System.out.println((String) ((Map) ((Map) sprites.get(personaje)).get(estado)).get("efectoSonido"));

                setAnimacionPhoenix((String) ((Map) ((Map) sprites.get(personaje)).get(estado)).get("a"),
                        (String) ((Map) ((Map) sprites.get(personaje)).get(estado)).get("b"),
                        (int) ((Map) ((Map) sprites.get(personaje)).get(estado)).get("time"),
                        (String) ((Map) ((Map) sprites.get(personaje)).get(estado)).get("efectoSonido"));
            }
        }

        if (personaje.equals("Miles")) {

            setSpritesNull();
            background.setBackground(background.backgroundStandDefensa());
            ui.setNombrePersonaje("Phoenix");

            if (estado.equals("Derrotado")) {

                setSpritesNull();
                spriteDisplayFiscalia.setSpriteImage("Sprites/Sprites/MilesSprites/MilesDerrotado/MilesDerrotadoEstatico.gif");
            } else {
                setSpritesNull();
                System.out.println((String) ((Map) ((Map) sprites.get(personaje)).get(estado)).get("efectoSonido"));

                setAnimacionMiles((String) ((Map) ((Map) sprites.get(personaje)).get(estado)).get("a"),
                        (String) ((Map) ((Map) sprites.get(personaje)).get(estado)).get("b"),
                        (int) ((Map) ((Map) sprites.get(personaje)).get(estado)).get("time"),
                        (String) ((Map) ((Map) sprites.get(personaje)).get(estado)).get("efectoSonido"));
            }
        }
    }


    public void setAnimacionJuez(String animacion, String animacionIdle, int milisegundosTimer, String efectoSonido){

        setSpritesNull();

        try {
            gestorMusica.setEfecto(efectoSonido);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        spriteDisplayJuez.setSpriteImage(animacion);
        Timer timer = new Timer(milisegundosTimer, e -> {

            spriteDisplayJuez.setSpriteImage(animacionIdle);
        });
        timer.start();
        timer.setRepeats(false);
    }

    public void setAnimacionPhoenix(String animacion, String animacionIdle, int milisegundosTimer, String efectoSonido){

        setSpritesNull();
        spriteDisplayDefensa.setSpriteImage(animacion);
        Timer timer = new Timer(milisegundosTimer, e -> {

            spriteDisplayDefensa.setSpriteImage(animacionIdle);
        });
        timer.start();
        timer.setRepeats(false);

    }

    public void setAnimacionMiles(String animacion, String animacionIdle, int milisegundosTimer, String efectoSonido){

        setSpritesNull();
        spriteDisplayFiscalia.setSpriteImage(animacion);
        Timer timer = new Timer(milisegundosTimer, e -> {

            spriteDisplayFiscalia.setSpriteImage(animacionIdle);
        });
        timer.start();
        timer.setRepeats(false);

    }

    public void setSpritesNull(){

        spriteDisplayJuez.setSpriteImage(null);
        spriteDisplayDefensa.setSpriteImage(null);
        spriteDisplayTestigos.setSpriteImage(null);
        spriteDisplayFiscalia.setSpriteImage(null);
    }
}