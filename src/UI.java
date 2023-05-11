import javax.swing.*;

public class UI {

    private JLabel textBoxLabel = new JLabel();

    public void setUI(){

        textBoxLabel.setBounds(0,-200,1000,960);
        ImageIcon textBoxIcon = new ImageIcon("Sprites/textbox/textboximage.png");
        textBoxLabel.setIcon(textBoxIcon);
    }


    public JLabel getTextBoxLabel(){

        return textBoxLabel;
    }
}
