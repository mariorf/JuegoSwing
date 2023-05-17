import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/*public class GestorEventos {
    private UI ui;
    SpriteDisplayTestigos spriteDisplayTestigos;
    SpriteDisplayJuez spriteDisplayJuez;
    private SpriteDisplayFiscalia spriteDisplayFiscalia;
    private Background background;
    private MilesEdgeworthSprites milesEdgeworthSprites;


    public void setGestorEventos(UI ui, SpriteDisplayTestigos spriteDisplayTestigos, SpriteDisplayJuez spriteDisplayJuez,
                                 SpriteDisplayFiscalia spriteDisplayFiscalia, Background background, MilesEdgeworthSprites milesEdgeworthSprites,
                                 JuezSprites juezSprites, int numeroTextoActual, JTextArea campoTextoEsc1, TextoEscenario1 textoEscenario1,
                                 ActaJuicio actaJuicio, AmaQuillerSprites amaQuillerSprites, SaveManager saveManager){

        if (numeroTextoActual <= textoEscenario1.getTamañoArray()) {


            //ESTA LINEA PONE EL DIALOGO DESPUES DE QUE EL CONTADOR SUME 1
            campoTextoEsc1.setText(textoEscenario1.arrayTexto.get(numeroTextoActual));


            //TODOS LOS CAMBIOS DE SPRITES Y LA MECANICA DE PRUEBAS
            if (numeroTextoActual == 0) {

                background.setBackground(background.backgroundCortePanoramica());

            }
            if (numeroTextoActual == 2) {

                spriteDisplayTestigos.setSpriteImage(null);
                background.setBackground(background.backgroundStandJuez());
                spriteDisplayJuez.setSpriteImage(juezSprites.juezSetIdle());
                actaJuicio.labelEscenaCrimen.setVisible(true);
                ui.setNombrePersonaje("Juez");
            }
            if (numeroTextoActual == 3) {

                ui.setNombrePersonaje("Miles E.");
                spriteDisplayTestigos.setSpriteImage(null);
                spriteDisplayJuez.setSpriteImage(null);
                spriteDisplayFiscalia.setSpriteImage(milesEdgeworthSprites.milesEdgeworthSetIdle());
                background.setBackground(background.backgroundStandFiscalia());
            }
            if (numeroTextoActual == 4) {

                ui.setNombrePersonaje("Defensa");
                spriteDisplayTestigos.setSpriteImage(amaQuillerSprites.amaQuillerSetLlorando());
                spriteDisplayJuez.setSpriteImage(null);
                spriteDisplayFiscalia.setSpriteImage(null);
                background.setBackground(background.backgroundStandTestigo());
            }
            if (numeroTextoActual == 5) {

                spriteDisplayTestigos.setSpriteImage(null);
                background.setBackground(background.backgroundStandJuez());
                spriteDisplayJuez.setSpriteImage(juezSprites.juezSetIdle());
                actaJuicio.labelEscenaCrimen.setVisible(true);
                ui.setNombrePersonaje("Juez");
            }
            if (numeroTextoActual > 6 && numeroTextoActual < 8) {

                ui.setNombrePersonaje("Tutorial");
                spriteDisplayTestigos.setSpriteImage(amaQuillerSprites.amaQuillerSetIdle());
                spriteDisplayJuez.setSpriteImage(null);
                spriteDisplayFiscalia.setSpriteImage(null);
                background.setBackground(background.backgroundStandTestigo());
            }
            if (numeroTextoActual == 9) {

                spriteDisplayTestigos.setSpriteImage(null);
                background.setBackground(background.backgroundStandJuez());
                spriteDisplayJuez.setSpriteImage(juezSprites.juezSetIdle());
                actaJuicio.labelEscenaCrimen.setVisible(true);
                ui.setNombrePersonaje("Juez");

                if (numeroTextoActual == 9 && e.getKeyChar() == 'z' || e.getKeyChar() == 'Z') {
                    numeroTextoActual = 9;
                    return;
                }

            }
            if (numeroTextoActual == 10) {

                ui.setNombrePersonaje("Defensa");
                spriteDisplayTestigos.setSpriteImage(amaQuillerSprites.amaQuillerSetLlorando());
                spriteDisplayJuez.setSpriteImage(null);
                spriteDisplayFiscalia.setSpriteImage(null);
                background.setBackground(background.backgroundStandTestigo());
            }

            if (numeroTextoActual > 10 && numeroTextoActual <= 14) {

                ui.setNombrePersonaje("Miles E.");
                spriteDisplayTestigos.setSpriteImage(null);
                spriteDisplayJuez.setSpriteImage(null);
                spriteDisplayFiscalia.setSpriteImage(milesEdgeworthSprites.milesEdgeworthSetPensando());
                background.setBackground(background.backgroundStandFiscalia());


                if (numeroTextoActual == 14 && e.getKeyChar() == 'z' || e.getKeyChar() == 'Z') {
                    numeroTextoActual = 11;
                    return;
                }
            }
            if (numeroTextoActual == 15) {

                ui.setNombrePersonaje("Defensa");
                spriteDisplayTestigos.setSpriteImage(amaQuillerSprites.amaQuillerSetLlorando());
                spriteDisplayJuez.setSpriteImage(null);
                spriteDisplayFiscalia.setSpriteImage(null);
                background.setBackground(background.backgroundStandTestigo());
            }
            if (numeroTextoActual == 16) {

                spriteDisplayTestigos.setSpriteImage(null);
                background.setBackground(background.backgroundStandJuez());
                spriteDisplayJuez.setSpriteImage(juezSprites.juezSetIdle());
                actaJuicio.labelEscenaCrimen.setVisible(true);
                ui.setNombrePersonaje("Juez");
            }
            if (numeroTextoActual > 16 && numeroTextoActual <= 18) {

                ui.setNombrePersonaje("Defensa");
                spriteDisplayTestigos.setSpriteImage(amaQuillerSprites.amaQuillerSetLlorando());
                spriteDisplayJuez.setSpriteImage(null);
                spriteDisplayFiscalia.setSpriteImage(null);
                background.setBackground(background.backgroundStandTestigo());
            }
            if (numeroTextoActual >= 19) {

                ui.setNombrePersonaje("Miles E.");
                spriteDisplayTestigos.setSpriteImage(null);
                spriteDisplayJuez.setSpriteImage(null);
                spriteDisplayFiscalia.setSpriteImage(milesEdgeworthSprites.milesEdgeworthSetSorprendido());
                background.setBackground(background.backgroundStandFiscalia());
            }
            if (numeroTextoActual > 19) {

                ui.setNombrePersonaje("Miles E.");
                spriteDisplayTestigos.setSpriteImage(null);
                spriteDisplayJuez.setSpriteImage(null);
                spriteDisplayFiscalia.setSpriteImage(milesEdgeworthSprites.milesEdgeworthSetCondescendiente());
                background.setBackground(background.backgroundStandFiscalia());
            }


            //CREAR EL GESTOR EVENTOS EN BASE A la UI
            //Guardado, escribe en un documento de texto externo la linea actual en la que te encuentras
            try {
                saveManager.guardar(numeroTextoActual);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            numeroTextoActual++;
        }
    }
}*/
