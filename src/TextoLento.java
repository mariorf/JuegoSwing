/*public class TextoLento {

    interface Callback {

        void call(String s);
    }

    void devolverLetraALetra(Callback callback, String s){

        callback.call(s);
    }

    TextoLento textoLento = new TextoLento();

    public void escribirLento(String texto) throws InterruptedException {



        String textoGuardar = "";

        char[] textoArray = texto.toCharArray();

        for (char c : textoArray) {

            String charString = Character.toString(c);
            textoGuardar = charString + textoGuardar;
            Thread.sleep(100);
        }
    }
}*/
