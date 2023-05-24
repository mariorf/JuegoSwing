
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


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


    public GestorSprites(SpriteDisplayFiscalia spriteDisplayFiscalia, SpriteDisplayJuez spriteDisplayJuez,
                         SpriteDisplayTestigos spriteDisplayTestigos, SpriteDisplayDefensa spriteDisplayDefensa, Background background, UI ui){


        this.spriteDisplayTestigos = spriteDisplayTestigos;
        this.spriteDisplayJuez = spriteDisplayJuez;
        this.spriteDisplayFiscalia=spriteDisplayFiscalia;
        this.spriteDisplayDefensa=spriteDisplayDefensa;
        this.ui=ui;
        this.background=background;
        this.gestorMusica=gestorMusica;
    }
    public void setSprite(String personaje, String path) throws UnsupportedAudioFileException, LineUnavailableException, IOException  {

            if(personaje=="Juez"){

                setSpritesNull();
                background.setBackground(background.backgroundStandJuez());
                ui.setNombrePersonaje("Juez");

                if(path.equals("Asintiendo")){


                    setAnimacionJuez("Sprites/Sprites/JuezSprites/JuezAsintiendoNegando/JuezAsintiendo.gif",
                            "Sprites/Sprites/JuezSprites/JuezAsintiendoNegando/JuezIdle.gif", 700);
                }

                if(path.equals("Negando")){


                    setAnimacionJuez("Sprites/Sprites/JuezSprites/JuezAsintiendoNegando/JuezNegando.gif",
                            "Sprites/Sprites/JuezSprites/JuezAsintiendoNegando/JuezIdle.gif", 700);
                }

                if(path.equals("Hablando")){


                    setAnimacionJuez("Sprites/Sprites/JuezSprites/JuezHablando/JuezHablando.gif",
                            "Sprites/Sprites/JuezSprites/JuezHablando/JuezIdle.gif", 700);
                }

                if(path.equals("Serio")){


                    setAnimacionJuez("Sprites/Sprites/JuezSprites/JuezSerio/JuezSerio.gif",
                            "Sprites/Sprites/JuezSprites/JuezSerio/JuezSerioIdle.gif", 700);
                }

                if(path.equals("Sorprendido")){


                    setAnimacionJuez("Sprites/Sprites/JuezSprites/JuezSorprendido/JuezSorprendidoHablando.gif",
                            "Sprites/Sprites/JuezSprites/JuezSorprendido/JuezSorprendidoIdle.gif", 700);
                }

                if(path.equals("OjosCerrados")){


                    setSpritesNull();
                    spriteDisplayJuez.setSpriteImage("Sprites/Sprites/JuezSprites/JuezSerio/JuezSerioOjosCerrados.gif");
                }


            }


            if(personaje=="Phoenix"){


                background.setBackground(background.backgroundStandDefensa());
                ui.setNombrePersonaje("Phoneix W.");


                if(path.equals("IdleSinHablar")){

                    setSpritesNull();
                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixHablando/PhoenixHablandoIdle.gif");
                }

                if(path.equals("Hablando")){


                    setAnimacionPhoenix("Sprites/Sprites/PhoenixSprites/PhoenixHablando/PhoenixHablando.gif",
                            "Sprites/Sprites/PhoenixSprites/PhoenixHablando/PhoenixHablandoIdle.gif", 700);
                }

                if(path.equals("GolpeMesa")){

                    gestorMusica.setEfecto("GolpeMesa");

                    setAnimacionPhoenix("Sprites/Sprites/PhoenixSprites/PhoenixGolpeMesa/PhoenixGolpeMesa.gif",
                            "Sprites/Sprites/PhoenixSprites/PhoenixGolpeMesa/PhoenixGolpeMesaIdle.gif", 700);
                }

                if(path.equals("GolpeMesaHablando")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionPhoenix("Sprites/Sprites/PhoenixSprites/PhoenixGolpeMesa/PhoenixGolpeMesaHablando.gif",
                            "Sprites/Sprites/PhoenixSprites/PhoenixGolpeMesa/PhoenixGolpeMesaIdle.gif", 700);
                }

                if(path.equals("Apuntando")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionPhoenix("Sprites/Sprites/PhoenixSprites/PhoenixApuntando/PhoenixApuntando.gif",
                            "Sprites/Sprites/PhoenixSprites/PhoenixApuntando/PhoenixApuntandoEstatico.gif", 700);
                }

                if(path.equals("ApuntandoHablando")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionPhoenix("Sprites/Sprites/PhoenixSprites/PhoenixApuntando/PhoenixApuntandoHablando.gif",
                            "Sprites/Sprites/PhoenixSprites/PhoenixApuntando/PhoenixApuntandoEstatico.gif", 700);
                }

                if(path.equals("Asiente")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionPhoenix("Sprites/Sprites/PhoenixSprites/PhoenixAsienteONiega/PhoenixAsiente.gif",
                            "Sprites/Sprites/PhoenixSprites/PhoenixAsienteONiega/PhoenixAsienteNiegaIdle.gif", 700);
                }

                if(path.equals("Niega")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionPhoenix("Sprites/Sprites/PhoenixSprites/PhoenixAsienteONiega/PhoenixNiega.gif",
                            "Sprites/Sprites/PhoenixSprites/PhoenixAsienteONiega/PhoenixAsienteNiegaIdle.gif", 700);
                }

                if(path.equals("Derrotado")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionPhoenix("Sprites/Sprites/PhoenixSprites/PhoenixDerrotado/PhoenixDerrotado.gif",
                            "Sprites/Sprites/PhoenixSprites/PhoenixDerrotado/PhoenixDerrotadoIdle.gif", 700);
                }

                if(path.equals("Leyendo")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionPhoenix("Sprites/Sprites/PhoenixSprites/PhoenixLeyendo/PhoenixLeyendoHablando.gif",
                            "Sprites/Sprites/PhoenixSprites/PhoenixLeyendo/PhoenixLeyendoIdle.gif", 700);
                }

                if(path.equals("Pensando")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionPhoenix("Sprites/Sprites/PhoenixSprites/PhoenixPensando/PhoenixPensandoAnimado.gif",
                            "Sprites/Sprites/PhoenixSprites/PhoenixPensando/PhoenixPensandoIdle.gif", 700);
                }

                if(path.equals("PensandoHablando")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionPhoenix("Sprites/Sprites/PhoenixSprites/PhoenixPensando/PhoenixPensandoHablando.gif",
                            "Sprites/Sprites/PhoenixSprites/PhoenixPensando/PhoenixPensandoIdle.gif", 700);
                }

                if(path.equals("Rascando")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionPhoenix("Sprites/Sprites/PhoenixSprites/PhoenixRascandoCabeza/PhoenixRascandoCabezaHablando.gif",
                            "Sprites/Sprites/PhoenixSprites/PhoenixRascandoCabeza/PhoenixRascandoCabezaEstatico.gif", 700);
                }

                if(path.equals("Sudando")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionPhoenix("Sprites/Sprites/PhoenixSprites/PhoenixSudando/PhoenixSudandoHablando.gif",
                            "Sprites/Sprites/PhoenixSprites/PhoenixSudando/PhoenixSudandoEstatico.gif", 700);
                }

            }



            if(personaje=="Ama"){

                spriteDisplayJuez.setSpriteImage(null);
                spriteDisplayFiscalia.setSpriteImage(null);
                spriteDisplayDefensa.setSpriteImage(null);

                spriteDisplayTestigos.setSpriteImage(path);
                background.setBackground(background.backgroundStandTestigo());
                ui.setNombrePersonaje("Ama");
            }

            //ANIMACIONES MILES
            if(personaje=="Miles"){

                setSpritesNull();
                background.setBackground(background.backgroundStandFiscalia());
                ui.setNombrePersonaje("Miles");

                if(path.equals("Hablando")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionMiles("Sprites/Sprites/MilesSprites/MilesIdleHablando/MilesHablando.gif",
                            "Sprites/Sprites/MilesSprites/MilesIdleHablando/MilesHablandoIdle.gif", 700);
                }

                if(path.equals("Leyendo")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionMiles("Sprites/Sprites/MilesSprites/MilesPapel/MilesPapel.gif",
                            "Sprites/Sprites/MilesSprites/MilesPapel/MilesPapelEstatico.gif", 700);
                }

                if(path.equals("Pensando")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionMiles("Sprites/Sprites/MilesSprites/MilesPensando/MilesPensando.gif",
                            "Sprites/Sprites/MilesSprites/MilesPensando/MilesPensandoEstatico.gif", 700);
                }


                if(path.equals("Dedo")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionMiles("Sprites/Sprites/MilesSprites/MilesDedoCabeza/MilesDedo.gif",
                            "Sprites/Sprites/MilesSprites/MilesDedoCabeza/MilesDedoEstatico.gif", 700);
                }

                if(path.equals("Señalando")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionMiles("Sprites/Sprites/MilesSprites/MilesSeñalando/MilesSeñalando.gif",
                            "Sprites/Sprites/MilesSprites/MilesSeñalando/MilesSeñalandoEstatico.gif", 700);
                }

                if(path.equals("Golpe")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionMiles("Sprites/Sprites/MilesSprites/MilesGolpe/MilesGolpe.gif",
                            "Sprites/Sprites/MilesSprites/MilesGolpe/MilesGolpeEstatico.gif", 700);
                }

                if(path.equals("GolpeHablando")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionMiles("Sprites/Sprites/MilesSprites/MilesGolpe/MilesGolpeHablando.gif",
                            "Sprites/Sprites/MilesSprites/MilesGolpe/MilesGolpeEstatico.gif", 700);
                }

                if(path.equals("GolpeEnfadado")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionMiles("Sprites/Sprites/MilesSprites/MilesGolpeEnfadado/GolpeEnfadadoHablando.gif",
                            "Sprites/Sprites/MilesSprites/MilesGolpeEnfadado/GolpeEnfadadoEstatico.gif", 700);
                }

                if(path.equals("Derrotado")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setSpritesNull();
                    spriteDisplayFiscalia.setSpriteImage("Sprites/Sprites/MilesSprites/MilesDerrotado/MilesDerrotadoEstatico.gif");
                }

                if(path.equals("CondescendienteNegando")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionMiles("Sprites/Sprites/MilesSprites/MilesCondescendiente/MilesCondescendienteNegando.gif",
                            "Sprites/Sprites/MilesSprites/MilesCondescendiente/MilesCondescendienteEstatico.gif", 1500);
                }

                if(path.equals("CondescendienteHablando")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionMiles("Sprites/Sprites/MilesSprites/MilesCondescendiente/MilesCondescendienteHablando.gif",
                            "Sprites/Sprites/MilesSprites/MilesCondescendiente/MilesCondescendienteEstatico.gif", 700);
                }

                if(path.equals("Reverencia")){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    setAnimacionMiles("Sprites/Sprites/MilesSprites/MilesReverencia/MilesReverencia.gif",
                            "Sprites/Sprites/MilesSprites/MilesReverencia/MilesreverenciaEstatico.gif", 700);
                }
            }
    }

    public void setAnimacionJuez(String animacion, String animacionIdle, int milisegundosTimer){

        setSpritesNull();
        spriteDisplayJuez.setSpriteImage(animacion);
        Timer timer = new Timer(milisegundosTimer, e -> {

            spriteDisplayJuez.setSpriteImage(animacionIdle);
        });
        timer.start();
        timer.setRepeats(false);

    }

    public void setAnimacionPhoenix(String animacion, String animacionIdle, int milisegundosTimer){

        setSpritesNull();
        spriteDisplayDefensa.setSpriteImage(animacion);
        Timer timer = new Timer(milisegundosTimer, e -> {

            spriteDisplayDefensa.setSpriteImage(animacionIdle);
        });
        timer.start();
        timer.setRepeats(false);

    }

    public void setAnimacionMiles(String animacion, String animacionIdle, int milisegundosTimer){

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