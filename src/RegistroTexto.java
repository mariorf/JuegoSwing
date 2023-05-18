import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RegistroTexto {

    File registroTextoFile = new File("RegistroTexto");

    FileWriter writer = new FileWriter(registroTextoFile);

    JLabel bannerLabelDer = new JLabel();

    JLabel bannerLabelIzq = new JLabel();

    ImageIcon bannerIcon = new ImageIcon("BannerRegistro/bannerLateralRegistro.png");

    JTextArea textoAreaRegistro = new JTextArea();

    JLayeredPane contentPane = new JLayeredPane();

    TextoEscenario1 textoEscenario1 = new TextoEscenario1();

    JPanel panel = new JPanel();

    public RegistroTexto (JFrame frame, TextoEscenario1 textoRegistro, int numeroActual) throws IOException {

        for (String s : textoRegistro.arrayTexto){

            writer.write("> "+s);
            writer.write("\n\n");
        }
        writer.close();


        textoEscenario1 = textoRegistro;
        contentPane=frame.getLayeredPane();


        textoAreaRegistro.setBounds(300,0,400,600);
        bannerLabelIzq.setBounds(0,0,400,800);
        bannerLabelDer.setBounds(700,0,400,800);


        bannerLabelIzq.setIcon(bannerIcon);
        bannerLabelDer.setIcon(bannerIcon);

        panel.add(textoAreaRegistro);
        panel.add(bannerLabelIzq);
        panel.add(bannerLabelDer);
        contentPane.add(panel);
    }
}
