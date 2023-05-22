import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Escenario1 extends JFrame {

    boolean repetir = false;

    int numeroTextoActual = 0;

    JLayeredPane contentPane = new JLayeredPane();

    JTextArea campoTextoEsc1 = new JTextArea();


    public Escenario1() throws InterruptedException, IOException, AWTException {

        //Creacion de los objetos para llamar a los sprites de los personajes
        JohnSprites johnSprites = new JohnSprites();
        PhoenixSprites phoenixSprites = new PhoenixSprites();
        JuezSprites juezSprites = new JuezSprites();
        MilesEdgeworthSprites milesEdgeworthSprites = new MilesEdgeworthSprites();
        NoraMarblerSprites noraMarblerSprites = new NoraMarblerSprites();


        //Crear los objetos
        CampoTexto campoTexto = new CampoTexto();
        TextoEscenario1 textoEscenario1 = new TextoEscenario1();
        JButton botonPasarTexto = new JButton();
        SpriteDisplayTestigos spriteDisplayTestigos = new SpriteDisplayTestigos();
        SpriteDisplayJuez spriteDisplayJuez = new SpriteDisplayJuez();
        SpriteDisplayFiscalia spriteDisplayFiscalia = new SpriteDisplayFiscalia();
        UI ui = new UI();
        ActaJuicio actaJuicio = new ActaJuicio(ui);
        Background background = new Background();
        SaveManager saveManager = new SaveManager();
        Robot robot = new Robot();
        GestorSprites gestorSprites = new GestorSprites(spriteDisplayFiscalia, spriteDisplayJuez, spriteDisplayTestigos, background, ui);


        //Poner los valores necesarios para la ventana
        contentPane = getLayeredPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 800);
        setLocationRelativeTo(null);
        ui.setUI();

        //Llamada a los metodos de las clases para asignar valores
        campoTextoEsc1 = campoTexto.getAreaTexto();


        //Cargado, coge la linea en la que te encontrabas segun el guardado anterior y la carga de nuevo
        //Tambien carga las pruebas si cumples las condiciones necesarias
        try {
            numeroTextoActual = saveManager.cargar();
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }


        //EL ORDEN DE ESTO ES BASICAMENTE EL ORDEN DE LAS CAPAS
        contentPane.setLayout(null);
        contentPane.add(campoTextoEsc1);
        contentPane.add(ui.getLabelUiPruebaSeleccionada());
        contentPane.add(ui.getNombrePersonajeTextArea());
        contentPane.add(ui.getTextBoxLabel());
        contentPane.add(botonPasarTexto);
        contentPane.add(spriteDisplayFiscalia.getSpriteLabel());
        contentPane.add(spriteDisplayJuez.getSpriteLabel());
        contentPane.add(spriteDisplayTestigos.getSpriteLabel());
        contentPane.add(background.getBackBroundLabel());
        setVisible(true);



        //CREAR CLASE GESTOR EVENTOS(constructor con todas  las clases que necesite)
        //Eventos
        botonPasarTexto.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(numeroTextoActual);

                //PONER PRUEBAS SEGUN POSICION EN DIALOGO
                if (numeroTextoActual > 0) {
                    actaJuicio.labelEscenaCrimen.setVisible(true);
                }
                if (numeroTextoActual >= 8) {
                    actaJuicio.labelArma.setVisible(true);
                }

                //Para pasar las lineas de dialogo
                if (e.getKeyChar() == 'z' || e.getKeyChar() == 'Z') {



                    if (numeroTextoActual <= textoEscenario1.getTamañoArray()) {

                        //ESTA LINEA PONE EL DIALOGO DESPUES DE QUE EL CONTADOR SUME 1
                        campoTextoEsc1.setText(textoEscenario1.arrayTexto.get(numeroTextoActual));

                        //TODOS LOS CAMBIOS DE SPRITES Y LA MECANICA DE PRUEBAS
                        if (numeroTextoActual == 0) {

                            gestorSprites.setSprite("Defensa", "GolpeMesa");
                        }
                        if (numeroTextoActual == 2) {

                            actaJuicio.labelEscenaCrimen.setVisible(true);
                        }
                        if (numeroTextoActual == 3) {

                            gestorSprites.setSprite("Miles", milesEdgeworthSprites.milesEdgeworthSetIdle());
                        }
                        if (numeroTextoActual == 4) {

                            gestorSprites.setSprite("Defensa", johnSprites.johnSetLlorando());
                        }
                        if (numeroTextoActual == 5) {

                            gestorSprites.setSprite("Juez", juezSprites.juezSetIdle());
                            actaJuicio.labelEscenaCrimen.setVisible(true);
                        }
                        if (numeroTextoActual >= 6 && numeroTextoActual < 8) {


                            gestorSprites.setSprite("Defensa", johnSprites.johnSetLlorando());
                            ui.setNombrePersonaje("Tutorial");
                        }
                        if (numeroTextoActual == 9) {


                            gestorSprites.setSprite("Juez", juezSprites.juezSetIdle());

                            if (numeroTextoActual == 9 && e.getKeyChar() == 'z' || e.getKeyChar() == 'Z') {
                                numeroTextoActual = 9;
                                return;
                            }
                        }
                        if (numeroTextoActual == 10) {


                            gestorSprites.setSprite("Ama",johnSprites.johnSetLlorando());
                        }

                        if (numeroTextoActual > 10 && numeroTextoActual <= 14) {

                            gestorSprites.setSprite("Miles", milesEdgeworthSprites.milesEdgeworthSetPensando());

                            if (numeroTextoActual == 14 && e.getKeyChar() == 'z' || e.getKeyChar() == 'Z') {
                                numeroTextoActual = 11;
                                return;
                            }
                        }
                        if (numeroTextoActual == 15) {

                            gestorSprites.setSprite("Defensa", johnSprites.johnSetLlorando());
                        }
                        if (numeroTextoActual == 16) {

                            gestorSprites.setSprite("Juez", juezSprites.juezSetIdle());
                        }
                        if (numeroTextoActual > 16 && numeroTextoActual <= 18) {

                            gestorSprites.setSprite("Defensa", johnSprites.johnSetLlorando());
                        }
                        if (numeroTextoActual >= 19) {

                            gestorSprites.setSprite("Miles", milesEdgeworthSprites.milesEdgeworthSetSorprendido());
                        }
                        if (numeroTextoActual > 19) {

                            gestorSprites.setSprite("Miles", milesEdgeworthSprites.milesEdgeworthSetCondescendiente());
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

                if (e.getKeyChar() == 'A' || e.getKeyChar() == 'a') {
                    new Thread(() -> {
                        actaJuicio.setVisible(true);
                    }).start();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        //LISTENER DE LOS CLICKS A LAS PRUEBAS SELECCIONADAS
        ui.getLabelUiPruebaSeleccionada().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if(numeroTextoActual == 9 && actaJuicio.armaSeleccionada==true){

                    numeroTextoActual = 10;
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.keyRelease(KeyEvent.VK_Z);
                }

                if (numeroTextoActual == 14 && actaJuicio.escenaCrimenSeleccionada == true) {

                    numeroTextoActual = 15;
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.keyRelease(KeyEvent.VK_Z);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        });
    }
}
