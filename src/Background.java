import javax.swing.*;

public class Background {
    private JLabel backgroundLabel = new JLabel();

    public void setBackground(String path){

        backgroundLabel.setBounds(0,-200,1000,1150);
        ImageIcon textBoxIcon = new ImageIcon(path);
        backgroundLabel.setIcon(textBoxIcon);
    }

    public String backgroundCortePanoramica(){

        return "Sprites/Backgrounds/cortePanoramica.png";
    }

    public String backgroundStandFiscalia(){

        return "Sprites/Backgrounds/standFiscalia.png";
    }

    public String backgroundStandTestigo(){

        return "Sprites/Backgrounds/standTestigo.png";
    }

    public String backgroundStandJuez(){

        return "Sprites/Backgrounds/standJuez.jpg";
    }

    public JLabel getBackBroundLabel(){

        return backgroundLabel;
    }
}
