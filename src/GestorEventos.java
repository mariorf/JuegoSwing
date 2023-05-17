import javax.swing.*;
import java.awt.*;

public class GestorEventos {
    private UI ui;
    SpriteDisplayTestigos spriteDisplayTestigos;
    SpriteDisplayJuez spriteDisplayJuez;
    private SpriteDisplayFiscalia spriteDisplayFiscalia;
    private Background background;
    private MilesEdgeworthSprites milesEdgeworthSprites;

    public GestorEventos(UI ui, SpriteDisplayTestigos spriteDisplayTestigos, SpriteDisplayJuez spriteDisplayJuez,
                         SpriteDisplayFiscalia spriteDisplayFiscalia, Background background, MilesEdgeworthSprites milesEdgeworthSprites, JuezSprites juezSprites) {

        System.out.println("Dentro");
        ui.setNombrePersonaje("Miles E.");
        spriteDisplayTestigos.setSpriteImage(null);
        spriteDisplayJuez.setSpriteImage(null);
        spriteDisplayFiscalia.setSpriteImage(milesEdgeworthSprites.milesEdgeworthSetPensando());
        background.setBackground(background.backgroundStandFiscalia());
    }
}
