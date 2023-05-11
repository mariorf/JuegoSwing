import javax.swing.*;

public class SpriteDisplay {

    private JLabel spriteLabel = new JLabel();

    public SpriteDisplay(int width, int height) {


        spriteLabel.setLocation(150,-230);
        spriteLabel.setSize(width, height);
    }

    public void setSpriteImage(String imagePath) {
        ImageIcon spriteIcon = new ImageIcon(imagePath);
        spriteLabel.setIcon(spriteIcon);
    }

    public JLabel getSpriteLabel() {
        return spriteLabel;
    }
}
