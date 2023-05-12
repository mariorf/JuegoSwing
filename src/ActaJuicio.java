import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ActaJuicio extends JFrame {

    ControladorEvidencia controladorEvidencia = new ControladorEvidencia();

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

        labelEscenaCrimen.setIcon(escenarioCrimenMiniatura);
        labelEscenaCrimen.setSize(100,100);
        labelEscenaCrimen.setLocation(0,50);

        labelArma.setIcon(armaMiniatura);
        labelArma.setSize(100,100);
        labelArma.setLocation(200,50);

        labelEscenaCrimen.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(Thread.currentThread().getName());
               //Crea una nueva ventana con la prueba y una descripción
                pruebaAmpliada.setVisible(true);
                pruebaAmpliada.setPruebaAmpliada("ActaJuicio/escenarioCrimen.jpg", "Escena crimen", "El cadaver se encontro cerca del acusado, muerto de un disparo a la cabeza por detras. El acusado " +
                        "estaba esposado a la pata de la cama y tenia en su bolsillo" +
                        " las llaves de la victima, en el dibujo de la escena se muestran en el piso, aunque se encontraron en su bolsillo. El arma se encontraba en las manos del acusado con una bala disparada" +
                        " cuando se le detuvo. El arma homicida pertenecia a la victima. \n\n" +
                        "Se encontro sangre en la mesa, en la pared de enfrente de la mesa y brotando de la cabeza de la victima");
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

        contentPane.add(labelEscenaCrimen);
        contentPane.add(nombrePruebaField);
    }


}

class PruebaAmpliada extends JFrame{

    JLabel labelPresentar = new JLabel();

    JLabel labelImagen = new JLabel();

    Font font1 = new Font("Ace Attorney", Font.PLAIN, 22);

    //Construye la imagen de la prueba que ya existe en miniatura, pero esta vez la hace mas grande y en otra ventana
    void setPruebaAmpliada(String path, String nombrePrueba, String descripcion){

        ImageIcon imagenAmpliada = new ImageIcon(path);
        Container contentPane = new Container();
        JTextArea descripcionPrueba = new JTextArea();


        descripcionPrueba.setFont(font1);
        descripcionPrueba.setOpaque(false);

        contentPane=getContentPane();
        setTitle(nombrePrueba);
        setSize(799,800);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);


        //Tamaño y localización de la descripción
        descripcionPrueba.setSize(799, 211);
        descripcionPrueba.setLocation(0,589);

        //Texto de la textBox
        descripcionPrueba.setEditable(false);
        descripcionPrueba.setText(descripcion);

        //Para que el texto no se salga de los limites
        descripcionPrueba.setLineWrap(true);
        descripcionPrueba.setWrapStyleWord(true);


        labelImagen.setIcon(imagenAmpliada);
        labelImagen.setSize(799,589);


        contentPane.add(descripcionPrueba);
        contentPane.add(labelImagen);
    }
}
