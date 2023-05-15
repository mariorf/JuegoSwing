import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveManager {

    File saveFile = new File("save.txt");
    Scanner lectorSaveFile;
    int numeroGuardado;

    public SaveManager() throws IOException {
        lectorSaveFile = new Scanner(saveFile);
    }

    public void guardar(int numeroTextoActual) throws IOException {

        try (FileWriter writer = new FileWriter(saveFile)) {
            writer.write(String.valueOf(numeroTextoActual));
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public int cargar() throws FileNotFoundException {
        Scanner scanner = new Scanner(saveFile);
        String nextToken = scanner.next();
        System.out.println(nextToken);
        scanner.close();
        return Integer.parseInt(nextToken);
    }


}
