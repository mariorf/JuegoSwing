import javax.swing.*;

public class SpriteDisplayDefensa {

    private JLabel spriteLabel = new JLabel();

    public SpriteDisplayDefensa() {

        spriteLabel.setLocation(20,-35);
        spriteLabel.setSize(1000,1100);
    }

    public void setSpriteImage(String imagePath) {
        ImageIcon spriteIcon = new ImageIcon(imagePath);
        spriteLabel.setIcon(spriteIcon);
    }

    public JLabel getSpriteLabel() {
        return spriteLabel;
    }
}
