import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorSprites {

    JFrame frame = new JFrame();
    SpriteDisplayTestigos spriteDisplayTestigos;
    SpriteDisplayJuez spriteDisplayJuez;
    SpriteDisplayFiscalia spriteDisplayFiscalia;

    JohnSprites johnSprites;
    JuezSprites juezSprites;
    MilesEdgeworthSprites milesEdgeworthSprites;
    NoraMarblerSprites noraMarblerSprites;
    UI ui;


    Background background;

    public GestorSprites(SpriteDisplayFiscalia spriteDisplayFiscalia, SpriteDisplayJuez spriteDisplayJuez,
                         SpriteDisplayTestigos spriteDisplayTestigos, Background background, UI ui){


        this.spriteDisplayTestigos = spriteDisplayTestigos;
        this.spriteDisplayJuez = spriteDisplayJuez;
        this.spriteDisplayFiscalia=spriteDisplayFiscalia;
        this.ui=ui;
        this.background=background;
    }

    public void setSprite(String personaje, String path){

        


            if(personaje=="Juez"){

                spriteDisplayTestigos.setSpriteImage(null);
                spriteDisplayFiscalia.setSpriteImage(null);

                spriteDisplayJuez.setSpriteImage(path);
                background.setBackground("Sprites/Backgrounds/standJuez.jpg");
                ui.setNombrePersonaje("Juez");
            }
            if(personaje=="Defensa"){

                spriteDisplayFiscalia.setSpriteImage(null);
                spriteDisplayJuez.setSpriteImage(null);
                background.setBackground("Sprites/Backgrounds/standTestigo.png");
                ui.setNombrePersonaje("Defensa");

                spriteDisplayTestigos.setSpriteImage("Sprites/PhoenixWright/gifmaker_me.gif");
                Timer timer = new Timer(700, e -> {

                    spriteDisplayTestigos.setSpriteImage("Sprites/PhoenixWright/Frame_0045.gif");
                });
                timer.setRepeats(false);
                timer.start();
            }
            if(personaje=="Ama"){

                spriteDisplayJuez.setSpriteImage(null);
                spriteDisplayFiscalia.setSpriteImage(null);

                spriteDisplayTestigos.setSpriteImage(path);
                background.setBackground("Sprites/Backgrounds/standTestigo.png");
                ui.setNombrePersonaje("Ama");
            }
            if(personaje=="Miles"){

                spriteDisplayJuez.setSpriteImage(null);
                spriteDisplayTestigos.setSpriteImage(null);

                spriteDisplayFiscalia.setSpriteImage(path);
                background.setBackground("Sprites/Backgrounds/standFiscalia.png");
                ui.setNombrePersonaje("Miles");
            }
    }
}