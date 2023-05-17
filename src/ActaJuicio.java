import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActaJuicio extends JFrame {

    //BOOLEANS DE PRUEBAS SELECCIONADAS
    boolean escenaCrimenSeleccionada = false;
    boolean armaSeleccionada = false;

    String pruebaSeleccionada = "Vacio";

    Container contentPane = new Container();

    PruebaAmpliada pruebaAmpliada = new PruebaAmpliada();

    //Imagenes tamaño normal de las pruebas
    JLabel labelEscenaCrimen = new JLabel();

    JLabel labelArma = new JLabel();

    JButton botonPresentar = new JButton();

    JTextArea nombrePruebaField = new JTextArea();


    //Imagenes en miniatura de las pruebas
    ImageIcon escenarioCrimenMiniatura = new ImageIcon("ActaJuicio/escenarioCrimenMiniatura.jpg");

    ImageIcon armaMiniatura = new ImageIcon("ActaJuicio/armaMiniatura.png");


    Color colorNegro = new Color(0, 0, 0);

    Color colorGris = new Color(115, 23, 23);

    Color colorVerde = new Color(66, 255, 17);


    public ActaJuicio(){

        contentPane=getContentPane();
        setTitle("Acta del juicio");
        setSize(600,300);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        nombrePruebaField.setSize(600,50);
        nombrePruebaField.setLocation(0,0);
        nombrePruebaField.setEditable(false);

        nombrePruebaField.setForeground(colorVerde);
        nombrePruebaField.setBackground(colorNegro);


        //MINIATURA ESCENA CRIMEN
        labelEscenaCrimen.setIcon(escenarioCrimenMiniatura);
        labelEscenaCrimen.setSize(100,100);
        labelEscenaCrimen.setLocation(0,50);

        //MINIATURA ARMA
        labelArma.setVisible(false);
        labelArma.setIcon(armaMiniatura);
        labelArma.setSize(100,100);
        labelArma.setLocation(100,50);

        //MOUSE LISTENER ESCENA CRIMEN
        labelEscenaCrimen.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

               //Crea una nueva ventana con la prueba y una descripción
                if(SwingUtilities.isLeftMouseButton(e)) {
                    pruebaAmpliada.setVisible(true);
                    pruebaAmpliada.setPruebaAmpliada("ActaJuicio/escenarioCrimen.jpg", "Escena crimen", "El cadaver se encontro cerca del acusado, muerto de un disparo a la cabeza por detras. El acusado " +
                            "estaba esposado a la pata de la cama y no respondia a estimulos externos, tenia en su bolsillo" +
                            " las llaves de la victima, en el dibujo de la escena se muestran en el piso, aunque se encontraron en su bolsillo. El arma se encontraba en las manos del acusado con una bala disparada" +
                            " cuando se le detuvo. El arma homicida pertenecia a la victima. \n\n" +
                            "Se encontro sangre en la mesa, en la pared de enfrente de la mesa y brotando de la cabeza de la victima. El casero llamo a la policia justo despues del disparo " +
                            "y llego en 5 minutos.");
                }

                if(SwingUtilities.isRightMouseButton(e)){
                    pruebaSeleccionada="EscenaCrimen";
                    System.out.println(pruebaSeleccionada);
                    dispose();
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
                nombrePruebaField.setText("Escena del crimen");
            }

            @Override
            public void mouseExited(MouseEvent e) {

                nombrePruebaField.setText(null);
            }
        });

        //LABEL ARMA
        labelArma.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if(SwingUtilities.isLeftMouseButton(e)){
                    pruebaAmpliada.setVisible(true);
                    pruebaAmpliada.setPruebaAmpliada("ActaJuicio/escenarioCrimen.jpg", "Escena crimen", "Arma encontrada en el escenario del crimen," +
                            " esta estaba en la mano del acusado y se disparo una bala.");
                }

                if(SwingUtilities.isRightMouseButton(e)){

                    pruebaSeleccionada="Arma";
                    System.out.println(pruebaSeleccionada);
                    dispose();
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

                nombrePruebaField.setText("Arma");
            }

            @Override
            public void mouseExited(MouseEvent e) {

                nombrePruebaField.setText(null);
            }
        });

        contentPane.add(labelArma);
        contentPane.add(labelEscenaCrimen);
        contentPane.add(nombrePruebaField);
    }

    String getPruebaSeleccionada(){
        return pruebaSeleccionada;
    }

}

class PruebaAmpliada extends JFrame{

    JLabel labelPresentar = new JLabel();

    JLabel labelImagen = new JLabel();

    Font font1 = new Font("Ace Attorney", Font.PLAIN, 22);

    //Construye la imagen de la prueba que ya existe en miniatura, pero esta vez la hace mas grande y en otra ventana
    void setPruebaAmpliada(String path, String nombrePrueba, String descripcion) {

        ImageIcon imagenAmpliada = new ImageIcon(path);
        Container contentPane = new Container();
        JTextArea descripcionPrueba = new JTextArea();


        descripcionPrueba.setFont(font1);
        descripcionPrueba.setOpaque(false);

        contentPane = getContentPane();
        setTitle(nombrePrueba);
        setSize(799, 800);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);


        //Tamaño y localización de la descripción
        descripcionPrueba.setSize(799, 211);
        descripcionPrueba.setLocation(0, 589);

        //Texto de la textBox
        descripcionPrueba.setEditable(false);
        descripcionPrueba.setText(descripcion);

        //Para que el texto no se salga de los limites
        descripcionPrueba.setLineWrap(true);
        descripcionPrueba.setWrapStyleWord(true);


        labelImagen.setIcon(imagenAmpliada);
        labelImagen.setSize(799, 589);


        contentPane.add(descripcionPrueba);
        contentPane.add(labelImagen);
    }
}
