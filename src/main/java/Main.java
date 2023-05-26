import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {

        new Thread(() -> {
            try {
                Escenario1 e1 = new Escenario1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (AWTException e) {
                throw new RuntimeException(e);
            } catch (UnsupportedAudioFileException e) {
                throw new RuntimeException(e);
            } catch (LineUnavailableException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
