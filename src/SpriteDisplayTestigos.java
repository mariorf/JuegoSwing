import javax.swing.*;


public class SpriteDisplayTestigos {

    Background background = new Background();

    private JLabel spriteLabel = new JLabel();

    public SpriteDisplayTestigos() {


        spriteLabel.setLocation(20,-58);
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
