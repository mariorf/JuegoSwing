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
        arrayTexto.add("Bien, empezaremos con un breve resumen del caso, abogado defensor \n Cual fue el arma homicida?");

        //6
        arrayTexto.add("En el tribunal lo mas importante es poder respaldar tus alegatos con pruebas solidas, para objetar a la fiscalia tendras tambien que presentar" +
                "pruebas y demostrar su error.");
        //7
        arrayTexto.add("Las pruebas se te iran dando durante el transcurso del juicio, puedes " +
                "verlas en todo momento pulsando la tecla A. ");
        //8
        arrayTexto.add("El juez te ha pedido el arma homicida, pulsa la tecla A y haz click derecho sobre el arma para seleccionarla, entonces pulsa" +
                " P para presentarla en el siguiente dialogo y pulsa Z dos veces.");
        //9
        arrayTexto.add("Y bien, defensa?");

        //10
        arrayTexto.add("La supuesta arma homicida es la pistola de la victima, se encontro disparada en la mano del acusado.");

        //11
        arrayTexto.add("Asi es, la teoria de la fiscalia es que el acusado fue a robar en la habitacion del Sheriff, pero se encontro que aun estaba" +
                " alli, asi que como Sheriff que es");
        //12
        arrayTexto.add(" fue a detenerlo. Pero el Sheriff debio de haber dejado el arma cerca del acusado, asi que mientras la victima escribia su reporte" +
                " le disparo a traicion por detras");

        //13
        arrayTexto.add("Poco despues, plenamente consciente de lo que habia hecho y aun esposado, acerco el cadaver y busco sus llaves para intentar liberarse," +
                " pero, ninguna de las llaves funciono.");

        //14
        arrayTexto.add("(Estoy seguro de que hay una contradiccion en lo que acaba de decir el fiscal, deberia revisar la descripcion de las pruebas en el acta" +
                "del juicio...)");
        //15
        arrayTexto.add("La teoria de la fiscalia claramente contradice los hechos, su senoria.");

        //16
        arrayTexto.add("Contradice las pruebas? Podria explicarnos a que se refiere?");

        //17
        arrayTexto.add("Claro que si. Segun su relato el acusado deberia haber estado plenamente consciente para arrastrar el cuerpo.");

        //18
        arrayTexto.add("Pero acorde al reporte policial de la escena del crimen el acusado se encontraba atontado, como recien despertado.");
    }

    public int getTamañoArray(){

        return arrayTexto.size();
    }
    private String arrayTexto(int i) {

        return arrayTexto(i);
    }
}