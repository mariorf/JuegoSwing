import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Escenario1 extends JFrame {
    int numeroTextoActual = 0;

    JLayeredPane contentPane = new JLayeredPane();

    JTextArea campoTextoEsc1 = new JTextArea();


    public Escenario1() throws InterruptedException, IOException, AWTException, UnsupportedAudioFileException, LineUnavailableException {

        //Creacion de los objetos para llamar a los sprites de los personajes
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
        SpriteDisplayDefensa spriteDisplayDefensa = new SpriteDisplayDefensa();
        UI ui = new UI();
        ActaJuicio actaJuicio = new ActaJuicio(ui);
        Background background = new Background();
        SaveManager saveManager = new SaveManager();
        Robot robot = new Robot();
        GestorSprites gestorSprites = new GestorSprites(spriteDisplayFiscalia, spriteDisplayJuez, spriteDisplayTestigos, spriteDisplayDefensa, background, ui);
        GestorMusica gestorMusica = new GestorMusica();

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
        contentPane.add(spriteDisplayDefensa.getSpriteLabel());
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

                    //PONE LA MUSICA SEGUN EN EL NUMERO TEXTO ACTUAL COMO
                    //PARAMETRO EN EL METODO
                    try {
                        gestorMusica.musicaNumero(numeroTextoActual);
                    } catch (UnsupportedAudioFileException ex) {
                        throw new RuntimeException(ex);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } catch (LineUnavailableException ex) {
                        throw new RuntimeException(ex);
                    }

                    if (numeroTextoActual <= textoEscenario1.getTamañoArray()) {

                        //ESTA LINEA PONE EL DIALOGO DESPUES DE QUE EL CONTADOR SUME 1
                        campoTextoEsc1.setText(textoEscenario1.arrayTexto.get(numeroTextoActual));

                        //TODOS LOS CAMBIOS DE SPRITES Y LA MECANICA DE PRUEBAS
                        if (numeroTextoActual == 0) {

                            background.setBackground(background.backgroundCortePanoramica());
                        }
                        if (numeroTextoActual == 2) {

                            gestorSprites.setSprite("Juez", "Hablando");
                            actaJuicio.labelEscenaCrimen.setVisible(true);
                        }
                        if (numeroTextoActual == 3) {

                            gestorSprites.setSprite("Miles", "Hablando");
                        }
                        if (numeroTextoActual == 4) {

                            gestorSprites.setSprite("Phoenix", "Hablando");
                        }
                        if (numeroTextoActual == 5) {

                            gestorSprites.setSprite("Juez", "Hablando");
                        }
                        if (numeroTextoActual >= 6 && numeroTextoActual < 8) {

                            gestorSprites.setSprite("Phoenix", "IdleSinHablar");
                            ui.setNombrePersonaje("Tutorial");
                        }
                        if (numeroTextoActual == 9) {

                            gestorSprites.setSprite("Juez", "Hablando");

                            if (numeroTextoActual == 9 && e.getKeyChar() == 'z' || e.getKeyChar() == 'Z') {
                                numeroTextoActual = 9;
                                return;
                            }
                        }
                        if (numeroTextoActual == 10) {


                            gestorSprites.setSprite("Phoenix","Leyendo");
                        }

                        if (numeroTextoActual > 10 && numeroTextoActual <= 14) {


                            gestorSprites.setSprite("Miles", "Leyendo");

                            if (numeroTextoActual == 14 && e.getKeyChar() == 'z' || e.getKeyChar() == 'Z') {
                                numeroTextoActual = 11;
                                return;
                            }
                        }
                        if (numeroTextoActual == 15) {

                            gestorSprites.setSprite("Phoenix", "Apuntando");
                        }
                        if (numeroTextoActual == 16) {


                            gestorSprites.setSprite("Juez", "Hablando");
                        }
                        if (numeroTextoActual == 17) {


                            gestorSprites.setSprite("Phoenix", "GolpeMesa");
                        }

                        if (numeroTextoActual == 18) {


                            gestorSprites.setSprite("Phoenix", "Apuntando");
                        }
                        if (numeroTextoActual == 19) {


                            gestorSprites.setSprite("Miles", "CondescendienteNegando");
                        }
                        if (numeroTextoActual >= 20 && numeroTextoActual<=21) {


                            gestorSprites.setSprite("Miles", "CondescendienteHablando");
                        }
                        if (numeroTextoActual==22) {


                            gestorSprites.setSprite("Miles", "Golpe");
                        }
                        if(numeroTextoActual==23) {


                            gestorSprites.setSprite("Phoenix", "IdleSinHablar");
                        }
                        if(numeroTextoActual==24) {


                            gestorSprites.setSprite("Phoenix", "Pensando");
                        }


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

    public void setEfecto(String s) throws UnsupportedAudioFileException, LineUnavailableException, IOException {

        try {
            GestorMusica gestorMusica = new GestorMusica();
            gestorMusica.setEfecto(s);
        } catch (UnsupportedAudioFileException ex) {
            throw new RuntimeException(ex);
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
