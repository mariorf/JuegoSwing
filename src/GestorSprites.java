import javax.swing.*;

public class GestorSprites {

    JFrame frame = new JFrame();
    SpriteDisplayTestigos spriteDisplayTestigos;
    SpriteDisplayJuez spriteDisplayJuez;
    SpriteDisplayFiscalia spriteDisplayFiscalia;

    AmaQuillerSprites amaQuillerSprites;
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
                spriteDisplayTestigos.setSpriteImage("Sprites/PhoenixWright/Frame_0045.gif");
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