import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorSprites {

    JFrame frame = new JFrame();
    SpriteDisplayTestigos spriteDisplayTestigos;
    SpriteDisplayJuez spriteDisplayJuez;
    SpriteDisplayFiscalia spriteDisplayFiscalia;
    SpriteDisplayDefensa spriteDisplayDefensa;

    JohnSprites johnSprites;
    JuezSprites juezSprites;
    MilesEdgeworthSprites milesEdgeworthSprites;
    NoraMarblerSprites noraMarblerSprites;
    PhoenixSprites phoenixSprites;
    UI ui;
    Background background;


    public GestorSprites(SpriteDisplayFiscalia spriteDisplayFiscalia, SpriteDisplayJuez spriteDisplayJuez,
                         SpriteDisplayTestigos spriteDisplayTestigos, SpriteDisplayDefensa spriteDisplayDefensa, Background background, UI ui){


        this.spriteDisplayTestigos = spriteDisplayTestigos;
        this.spriteDisplayJuez = spriteDisplayJuez;
        this.spriteDisplayFiscalia=spriteDisplayFiscalia;
        this.spriteDisplayDefensa=spriteDisplayDefensa;
        this.ui=ui;
        this.background=background;
    }

    public void setSprite(String personaje, String path){



            if(personaje=="Juez"){

                spriteDisplayTestigos.setSpriteImage(null);
                spriteDisplayFiscalia.setSpriteImage(null);
                spriteDisplayDefensa.setSpriteImage(null);

                spriteDisplayJuez.setSpriteImage(path);
                background.setBackground(background.backgroundStandJuez());
                ui.setNombrePersonaje("Juez");
            }
            if(personaje=="Defensa"){

                spriteDisplayFiscalia.setSpriteImage(null);
                spriteDisplayJuez.setSpriteImage(null);
                spriteDisplayTestigos.setSpriteImage(null);

                background.setBackground(background.backgroundStandDefensa());
                ui.setNombrePersonaje("Defensa");


                if(path=="GolpeMesa"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN
                    spriteDisplayDefensa.setSpriteImage(null);

                    spriteDisplayDefensa.setSpriteImage("Sprites/PhoenixWright/Animaciones/GolpeMesa.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/PhoenixWright/Animaciones/GolpeMesaEstatico.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Apuntando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN
                    spriteDisplayDefensa.setSpriteImage(null);

                    spriteDisplayTestigos.setSpriteImage("Sprites/PhoenixWright/Animaciones/Apuntando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayTestigos.setSpriteImage("Sprites/PhoenixWright/Animaciones/ApuntarEstaticoBocaCerrada.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
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
            if(personaje=="Miles"){

                spriteDisplayJuez.setSpriteImage(null);
                spriteDisplayTestigos.setSpriteImage(null);
                spriteDisplayDefensa.setSpriteImage(null);

                spriteDisplayFiscalia.setSpriteImage(path);
                background.setBackground(background.backgroundStandFiscalia());
                ui.setNombrePersonaje("Miles");
            }
    }
}