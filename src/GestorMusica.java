import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class GestorMusica {

    File trialSong = new File("Musica/Trial.wav");

    AudioInputStream audioInputStreamMusica = AudioSystem.getAudioInputStream(trialSong);

    AudioInputStream audioInputStreamEfectos = AudioSystem.getAudioInputStream(trialSong);

    Clip clipMusica = AudioSystem.getClip();

    Clip clipEfectos = AudioSystem.getClip();

    public GestorMusica() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    }


    public void musicaNumero(int n) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        if(n<30 && clipMusica.isRunning()==false){

            audioInputStreamMusica= AudioSystem.getAudioInputStream(trialSong);
            clipMusica.open(audioInputStreamMusica);
            clipMusica.start();
        }
    }

    public void setEfecto(String efecto) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        if(efecto.equals("Objection")){
            audioInputStreamEfectos = AudioSystem.getAudioInputStream(new File("Musica/EfectosSonido/Objection_-Sound-Effect.wav"));
            clipEfectos.open(audioInputStreamEfectos);
            clipEfectos.start();
        }
    }
}
