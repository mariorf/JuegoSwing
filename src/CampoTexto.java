import javax.swing.*;
import java.awt.*;

public class CampoTexto{

    JTextArea areaTexto = new JTextArea("Pulsa Z para empezar el juego");

    JTextArea nombrePersonajeTexto = new JTextArea();
    Font font1 = new Font("Ace Attorney", Font.PLAIN, 50);

    Color colorBlanco = new Color(255, 255, 255);


    //Esto pone el nombre del personaje y el area de texto de dialogo
    public CampoTexto(){
        areaTexto.setEditable(false);
        areaTexto.setBounds(30,535,930,210);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setFont(font1);
        areaTexto.setForeground(colorBlanco);
        areaTexto.setOpaque(false);

        nombrePersonajeTexto.setEditable(false);
        nombrePersonajeTexto.setBounds(100,100,100,100);
    }

    public JTextArea getAreaTexto(){

        return areaTexto;
    }

}
