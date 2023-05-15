import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class TextoEscenario1 {

    ArrayList<String> arrayTexto = new ArrayList<>();

    public TextoEscenario1 (){

        //0
        arrayTexto.add("Eres el abogado defensor de un bandido acusado de asesinato, es tu deber junto con la fiscalia el descubirir que es lo que paso el dia del accidente.");

        //1
        arrayTexto.add("20 de Marzo de 1876, Tribunal de Justicia de Texas.");

        //2
        arrayTexto.add("Se abre la sesion en el juicio del Sr. Ama Quiller.");

        //3
        arrayTexto.add("La fiscalia esta lista, su senoria.");

        //4
        arrayTexto.add("La defensa esta lista.");

        //5
        arrayTexto.add("La fiscalia esta lista, su senoria.");

        //6
        arrayTexto.add("Se abre la sesion en el juicio del Sr. Ama Quiller.");

    }

    public int getTamañoArray(){

        return arrayTexto.size();
    }
    private String arrayTexto(int i) {

        return arrayTexto(i);
    }
}