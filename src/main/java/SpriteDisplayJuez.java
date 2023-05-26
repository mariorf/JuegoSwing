import javax.swing.*;

public class SpriteDisplayJuez {

    private JLabel spriteLabel = new JLabel();

    public SpriteDisplayJuez() {


        spriteLabel.setLocation(20,-130);
        spriteLabel.setSize(850,1100);
    }

    public void setSpriteImage(String imagePath) {
        ImageIcon spriteIcon = new ImageIcon(imagePath);
        spriteLabel.setIcon(spriteIcon);
    }

    public JLabel getSpriteLabel() {
        return spriteLabel;
    }
}
