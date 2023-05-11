import javax.swing.*;
import java.awt.*;

public class UI {

    private JLabel textBoxLabel = new JLabel();

    private JTextArea nombrePersonajeTextArea = new JTextArea();

    Color colorBlanco = new Color(255, 255, 255);

    Font aceAttorneyFont = new Font("Ace Attorney", Font.PLAIN, 42);


    public void setUI(){

        //Setting de la text area del nombre
        nombrePersonajeTextArea.setBounds(25,480,200,40);
        nombrePersonajeTextArea.setText("Narrador");

        nombrePersonajeTextArea.setEditable(false);
        nombrePersonajeTextArea.setOpaque(false);
        nombrePersonajeTextArea.setForeground(colorBlanco);
        nombrePersonajeTextArea.setFont(aceAttorneyFont);

        //Setting de la imagen de la textbox
        textBoxLabel.setBounds(0,-200,1000,960);
        ImageIcon textBoxIcon = new ImageIcon("Sprites/textbox/textboximage.png");
        textBoxLabel.setIcon(textBoxIcon);
    }

    public void setNombrePersonaje(String nombre){

        nombrePersonajeTextArea.setText(nombre);
    }

    public JTextArea getNombrePersonajeTextArea(){

        return nombrePersonajeTextArea;
    }

    public JLabel getTextBoxLabel(){

        return textBoxLabel;
    }
}
