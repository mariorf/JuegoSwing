import javax.swing.*;

public class SpriteDisplayFiscalia {

    private JLabel spriteLabel = new JLabel();

    public SpriteDisplayFiscalia() {


        spriteLabel.setLocation(-100,-100);
        spriteLabel.setSize(1000,1200);
    }

    public void setSpriteImage(String imagePath) {
        ImageIcon spriteIcon = new ImageIcon(imagePath);
        spriteLabel.setIcon(spriteIcon);
    }

    public JLabel getSpriteLabel() {
        return spriteLabel;
    }
}
