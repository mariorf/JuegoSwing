import javax.swing.*;

public class GestorEventos {

    CampoTexto campoTexto = new CampoTexto();
    JTextArea campoTextoEsc1 = new JTextArea();

    Background background = new Background();

    SpriteDisplayTestigos spriteDisplayTestigos = new SpriteDisplayTestigos();

    SpriteDisplayJuez spriteDisplayJuez = new SpriteDisplayJuez();

    SpriteDisplayFiscalia spriteDisplayFiscalia = new SpriteDisplayFiscalia();

    JuezSprites juezSprites = new JuezSprites();

    MilesEdgeworthSprites milesEdgeworthSprites = new MilesEdgeworthSprites();

    AmaQuillerSprites amaQuillerSprites = new AmaQuillerSprites();

    UI ui = new UI();

    TextoEscenario1 textoEscenario1 = new TextoEscenario1();


    public void crearGuión(int numeroTextoActual){


        campoTextoEsc1 = campoTexto.getAreaTexto();

        campoTextoEsc1.setText(textoEscenario1.arrayTexto.get(numeroTextoActual));

        if(numeroTextoActual == 0){

            background.setBackground(background.backgroundCortePanoramica());

        }
        if(numeroTextoActual == 2){

            spriteDisplayTestigos.setSpriteImage(null);
            background.setBackground(background.backgroundStandJuez());
            spriteDisplayJuez.setSpriteImage(juezSprites.juezSetIdle());
            ui.setNombrePersonaje("Juez");
        }
        if(numeroTextoActual==3){

            ui.setNombrePersonaje("Miles E.");
            spriteDisplayTestigos.setSpriteImage(null);
            spriteDisplayJuez.setSpriteImage(null);
            spriteDisplayFiscalia.setSpriteImage(milesEdgeworthSprites.milesEdgeworthSetPensando());
            background.setBackground(background.backgroundStandFiscalia());
        }
    }

}


