import java.io.IOException;

class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

        new Thread(() -> {

            try {
                Escenario1 e1 = new Escenario1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
