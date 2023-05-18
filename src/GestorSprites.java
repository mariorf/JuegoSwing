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

    public void setSprite(){

            spriteDisplayFiscalia.setSpriteImage("Sprites/AmaQuiller/Idle.gif");
            background.setBackground("Sprites/Backgrounds/standFiscalia.png");

    }

}