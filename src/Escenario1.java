import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class Escenario1 extends JFrame {

    int numeroTextoActual=0;

    JLayeredPane contentPane = new JLayeredPane();

    JTextArea campoTextoEsc1 = new JTextArea();


    public Escenario1() throws InterruptedException, IOException {

        //Creacion de los objetos para llamar a los sprites de los personajes
        AmaQuiller amaQuiller = new AmaQuiller();



        //Crear los objetos
        CampoTexto campoTexto = new CampoTexto();
        TextoEscenario1 textoEscenario1 = new TextoEscenario1();
        JButton botonPasarTexto = new JButton();
        Font font1 = new Font("Carnevalee Freakshow", Font.PLAIN, 20);
        SpriteDisplay spriteDisplay = new SpriteDisplay(850,1100);
        ActaJuicio actaJuicio = new ActaJuicio();
        Background background = new Background();
        UI ui = new UI();



        //Poner los valores necesarios para la ventana
        contentPane = getLayeredPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000,800);
        setLocationRelativeTo(null);
        ui.setUI();

        //Llamada a los metodos de las clases para asignar valores
        campoTextoEsc1 = campoTexto.getAreaTexto();


        //Juego en si
        int controladorDeTexto=0;



        //Añadir items a los contenedores



        //EL ORDEN DE ESTO ES BASICAMENTE EL ORDEN DE LAS CAPAS
        contentPane.setLayout(null);
        contentPane.add(campoTextoEsc1);
        contentPane.add(ui.getNombrePersonajeTextArea());
        contentPane.add(ui.getTextBoxLabel());
        contentPane.add(botonPasarTexto);
        contentPane.add(spriteDisplay.getSpriteLabel());
        contentPane.add(background.getBackBroundLabel());
        setVisible(true);



        //Eventos
        botonPasarTexto.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

                //Para pasar las lineas de dialogo

                if (e.getKeyChar()=='z' || e.getKeyChar()=='Z') {

                    System.out.println(Thread.activeCount());

                    //Texto introduccion
                    if (numeroTextoActual <= textoEscenario1.getTamañoArray()) {

                        campoTextoEsc1.setText(textoEscenario1.arrayTexto.get(numeroTextoActual));
                        spriteDisplay.setSpriteImage(amaQuiller.amaQuillerSetIdle());

                        if(numeroTextoActual == 0){

                            background.setBackground(background.backgroundStandTestigo());
                        }
                        if(numeroTextoActual == 2){

                            ui.setNombrePersonaje("Juez");
                        }
                        numeroTextoActual++;
                    }
                }

                if (e.getKeyChar()=='r' || e.getKeyChar()=='R'){

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
    }
}
