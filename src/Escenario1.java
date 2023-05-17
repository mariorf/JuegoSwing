import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Escenario1 extends JFrame {

    boolean repetir = false;

    int numeroTextoActual=0;

    JLayeredPane contentPane = new JLayeredPane();

    JTextArea campoTextoEsc1 = new JTextArea();


    public Escenario1() throws InterruptedException, IOException {

        //Creacion de los objetos para llamar a los sprites de los personajes
        AmaQuillerSprites amaQuillerSprites = new AmaQuillerSprites();
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
        ActaJuicio actaJuicio = new ActaJuicio();
        Background background = new Background();
        UI ui = new UI();
        SaveManager saveManager = new SaveManager();





        //Poner los valores necesarios para la ventana
        contentPane = getLayeredPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000,800);
        setLocationRelativeTo(null);
        ui.setUI();

        //Llamada a los metodos de las clases para asignar valores
        campoTextoEsc1 = campoTexto.getAreaTexto();

        //Cargado, coge la linea en la que te encontrabas segun el guardado anterior y la carga de nuevo
        //Tambien carga las pruebas si cumples las condiciones necesarias
        try {
            numeroTextoActual= saveManager.cargar();
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        System.out.println("asd");

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



        //Eventos
        botonPasarTexto.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(numeroTextoActual);

                //PONER PRUEBAS SEGUN POSICION EN DIALOGO
                if(numeroTextoActual>0){
                    actaJuicio.labelEscenaCrimen.setVisible(true);
                }
                if(numeroTextoActual>=8){
                    actaJuicio.labelArma.setVisible(true);
                }

                //Para pasar las lineas de dialogo
                if (e.getKeyChar()=='z' || e.getKeyChar()=='Z') {

                    if (numeroTextoActual <= textoEscenario1.getTamañoArray()) {


                        //ESTA LINEA PONE EL DIALOGO DESPUES DE QUE EL CONTADOR SUME 1
                        campoTextoEsc1.setText(textoEscenario1.arrayTexto.get(numeroTextoActual));


                        //TODOS LOS CAMBIOS DE SPRITES Y LA MECANICA DE PRUEBAS
                        if(numeroTextoActual == 0){

                            background.setBackground(background.backgroundCortePanoramica());

                        }
                        if(numeroTextoActual == 2){

                            spriteDisplayTestigos.setSpriteImage(null);
                            background.setBackground(background.backgroundStandJuez());
                            spriteDisplayJuez.setSpriteImage(juezSprites.juezSetIdle());
                            actaJuicio.labelEscenaCrimen.setVisible(true);
                            ui.setNombrePersonaje("Juez");
                        }
                        if(numeroTextoActual==3){

                            ui.setNombrePersonaje("Miles E.");
                            spriteDisplayTestigos.setSpriteImage(null);
                            spriteDisplayJuez.setSpriteImage(null);
                            spriteDisplayFiscalia.setSpriteImage(milesEdgeworthSprites.milesEdgeworthSetIdle());
                            background.setBackground(background.backgroundStandFiscalia());
                        }
                        if(numeroTextoActual==4){

                            ui.setNombrePersonaje("Defensa");
                            spriteDisplayTestigos.setSpriteImage(amaQuillerSprites.amaQuillerSetLlorando());
                            spriteDisplayJuez.setSpriteImage(null);
                            spriteDisplayFiscalia.setSpriteImage(null);
                            background.setBackground(background.backgroundStandTestigo());
                        }
                        if(numeroTextoActual==5){

                            spriteDisplayTestigos.setSpriteImage(null);
                            background.setBackground(background.backgroundStandJuez());
                            spriteDisplayJuez.setSpriteImage(juezSprites.juezSetIdle());
                            actaJuicio.labelEscenaCrimen.setVisible(true);
                            ui.setNombrePersonaje("Juez");
                        }
                        if(numeroTextoActual>6 && numeroTextoActual<8){

                            ui.setNombrePersonaje("Tutorial");
                            spriteDisplayTestigos.setSpriteImage(amaQuillerSprites.amaQuillerSetIdle());
                            spriteDisplayJuez.setSpriteImage(null);
                            spriteDisplayFiscalia.setSpriteImage(null);
                            background.setBackground(background.backgroundStandTestigo());
                        }
                        if(numeroTextoActual==9){

                            spriteDisplayTestigos.setSpriteImage(null);
                            background.setBackground(background.backgroundStandJuez());
                            spriteDisplayJuez.setSpriteImage(juezSprites.juezSetIdle());
                            actaJuicio.labelEscenaCrimen.setVisible(true);
                            ui.setNombrePersonaje("Juez");

                            if(actaJuicio.armaSeleccionada!=true){
                                return;
                            }

                            if(actaJuicio.armaSeleccionada==true){

                            }

                        }
                        if(numeroTextoActual==10){

                            ui.setNombrePersonaje("Defensa");
                            spriteDisplayTestigos.setSpriteImage(amaQuillerSprites.amaQuillerSetLlorando());
                            spriteDisplayJuez.setSpriteImage(null);
                            spriteDisplayFiscalia.setSpriteImage(null);
                            background.setBackground(background.backgroundStandTestigo());
                        }

                        if(numeroTextoActual>10 && numeroTextoActual<=14){

                            ui.setNombrePersonaje("Miles E.");
                            spriteDisplayTestigos.setSpriteImage(null);
                            spriteDisplayJuez.setSpriteImage(null);
                            spriteDisplayFiscalia.setSpriteImage(milesEdgeworthSprites.milesEdgeworthSetPensando());
                            background.setBackground(background.backgroundStandFiscalia());


                            if(numeroTextoActual==14&&e.getKeyChar()=='z'||e.getKeyChar()=='Z'){
                                numeroTextoActual=11;
                                return;
                            }
                        }
                        if(numeroTextoActual==15){

                            ui.setNombrePersonaje("Defensa");
                            spriteDisplayTestigos.setSpriteImage(amaQuillerSprites.amaQuillerSetLlorando());
                            spriteDisplayJuez.setSpriteImage(null);
                            spriteDisplayFiscalia.setSpriteImage(null);
                            background.setBackground(background.backgroundStandTestigo());
                        }
                        if(numeroTextoActual==16){

                            spriteDisplayTestigos.setSpriteImage(null);
                            background.setBackground(background.backgroundStandJuez());
                            spriteDisplayJuez.setSpriteImage(juezSprites.juezSetIdle());
                            actaJuicio.labelEscenaCrimen.setVisible(true);
                            ui.setNombrePersonaje("Juez");
                        }
                        if(numeroTextoActual>16 && numeroTextoActual<=18){

                            ui.setNombrePersonaje("Defensa");
                            spriteDisplayTestigos.setSpriteImage(amaQuillerSprites.amaQuillerSetLlorando());
                            spriteDisplayJuez.setSpriteImage(null);
                            spriteDisplayFiscalia.setSpriteImage(null);
                            background.setBackground(background.backgroundStandTestigo());
                        }
                        if(numeroTextoActual>=19){

                            ui.setNombrePersonaje("Miles E.");
                            spriteDisplayTestigos.setSpriteImage(null);
                            spriteDisplayJuez.setSpriteImage(null);
                            spriteDisplayFiscalia.setSpriteImage(milesEdgeworthSprites.milesEdgeworthSetSorprendido());
                            background.setBackground(background.backgroundStandFiscalia());
                        }
                        if(numeroTextoActual>19){

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

                if (e.getKeyChar()=='p'||e.getKeyChar()=='P'){

                    if(actaJuicio.pruebaSeleccionada.equals("EscenaCrimen")){

                        actaJuicio.armaSeleccionada=false;
                        actaJuicio.escenaCrimenSeleccionada=true;
                        ui.setImagenPrueba("ActaJuicio/escenarioCrimenMiniatura.jpg");

                    }


                    if(actaJuicio.pruebaSeleccionada.equals("Arma")){

                        ui.setImagenPrueba("ActaJuicio/armaMiniatura.png");
                        actaJuicio.armaSeleccionada=true;
                        actaJuicio.escenaCrimenSeleccionada=false;
                    }
                }

                if (e.getKeyChar()=='A' || e.getKeyChar()=='a'){
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

        ui.getLabelUiPruebaSeleccionada().addMouseListener(new MouseListener() {
                                                               @Override
                                                               public void mouseClicked(MouseEvent e) {

                                                                   if(numeroTextoActual==14&&actaJuicio.escenaCrimenSeleccionada==true){

                                                                       System.out.println("asdasd");
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

        }
        );

    }
}
