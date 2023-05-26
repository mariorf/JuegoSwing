import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class GestorMusica {

    File trialSong = new File("Musica/Trial.wav");

    File crossExaminationSong = new File("Musica/CrossExamination.wav");

    File objectionSong = new File("Musica/Objection.wav");


    AudioInputStream audioInputStreamMusica = AudioSystem.getAudioInputStream(trialSong);

    AudioInputStream audioInputStreamEfectos = AudioSystem.getAudioInputStream(trialSong);

    Clip clipMusica = AudioSystem.getClip();

    Clip clipEfectos = AudioSystem.getClip();

    String nombreClip ="";


    public GestorMusica() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    }


    public void musicaNumero(int n) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        System.out.println(nombreClip);

        //AQUI PARA PONER TRIAL
        if (n < 11){


            if(!nombreClip.equals("Trial")){
                clipMusica.stop();
                clipMusica.close();
            }

            nombreClip = "Trial";

            if(clipMusica.isRunning()==false){
                audioInputStreamMusica = AudioSystem.getAudioInputStream(trialSong);
                clipMusica.open(audioInputStreamMusica);
                clipMusica.loop(Clip.LOOP_CONTINUOUSLY);
                clipMusica.start();
            }
        }

        //AQUI PARA PONER CROSS MODERATO
        if ((n >= 11) && (n <= 14)) {


            if(!nombreClip.equals("CrossModerato")){
                clipMusica.stop();
                clipMusica.close();
            }

            nombreClip="CrossModerato";

            if(clipMusica.isRunning()==false){
                audioInputStreamMusica = AudioSystem.getAudioInputStream(crossExaminationSong);
                clipMusica.open(audioInputStreamMusica);
                clipMusica.loop(Clip.LOOP_CONTINUOUSLY);
                clipMusica.start();
            }
        }

        //AQUI PARA PONER OBJECTION
        if (n >= 15) {
            System.out.println(nombreClip);

            if(!nombreClip.equals("Objection")){
                clipMusica.stop();
                clipMusica.close();
            }

            nombreClip="Objection";

            if(clipMusica.isRunning()==false){
                audioInputStreamMusica = AudioSystem.getAudioInputStream(objectionSong);
                clipMusica.open(audioInputStreamMusica);
                clipMusica.loop(Clip.LOOP_CONTINUOUSLY);
                clipMusica.start();
            }
        }

    }

    public void setEfecto(String efecto) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        if(efecto.equals("Objection")){
            audioInputStreamEfectos = AudioSystem.getAudioInputStream(new File("Musica/EfectosSonido/Objection_-Sound-Effect.wav"));
            clipEfectos.open(audioInputStreamEfectos);

            clipEfectos.start();
        }

        if(efecto.equals("GolpeMesa")){

                audioInputStreamEfectos = AudioSystem.getAudioInputStream(new File("Musica/EfectosSonido/GolpeMesa.wav"));
                clipEfectos.open(audioInputStreamEfectos);
            clipEfectos.addLineListener(new LineListener() {
                @Override
                public void update(LineEvent event) {
                    if (event.getType() == LineEvent.Type.STOP) {
                        // El clip ha terminado de reproducirse
                        clipEfectos.close(); // Cerrar el clip después de reproducirse completamente
                    }
                }
            });
            clipEfectos.start();
        }
    }

}
