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
        arrayTexto.add("Se abre la sesion en el juicio del Sr. John F. Kulprit.");

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
        arrayTexto.add("El juez te ha pedido el arma homicida, pulsa la tecla A y haz click derecho sobre el arma para seleccionarla, luego haz click izquierdo a la imagen en el siguiente" +
                "dialogo para presentarla.");

        //9
        arrayTexto.add("Y bien, defensa?");

        //10
        arrayTexto.add("La supuesta arma homicida es la pistola de la victima, se encontro disparada en la mano del acusado.");

        //11
        arrayTexto.add("Asi es, la teoria de la fiscalia es que el acusado fue a robar en la habitacion de la victima, pero se encontro que aun estaba" +
                " alli, asi que la victima");
        //12
        arrayTexto.add(" fue a detenerlo. Pero el Sheriff debio de haber dejado el arma cerca del acusado, asi que mientras escribia su reporte" +
                " le disparo a traicion por detras");

        //13
        arrayTexto.add("Luego, consciente de lo que hacia y aun esposado, acerco el cadaver y busco sus llaves para liberarse," +
                " pero las llaves que cogio eran las de su casa, no de las esposas");

        //14
        arrayTexto.add("(Estoy seguro de que hay una contradiccion en lo que acaba de decir... Deberia revisar la descripcion de las pruebas en el acta " +
                "del juicio...)");
        //15
        arrayTexto.add("Un momento.");

        //16
        arrayTexto.add("Tiene algo que objetar del alegato, defensa?");

        //17
        arrayTexto.add("Segun su relato el acusado se encontraba plenamente consciente para arrastrar el cuerpo y coger las llaves.");

        //18
        arrayTexto.add("Pero acorde al reporte policial de la escena del crimen el acusado se encontraba aturdido, recien despertado y no respondia a estimulos externos.");

        //19
        arrayTexto.add("...");

        //20
        arrayTexto.add("Esa situacion seria muy conveniente, sin embargo, las pruebas siguen siendo definitivas, el tenia la pistola con la bala disparada, estaba esposado y solo el" +
                " lo podria haber hecho.");

        //21
        arrayTexto.add("Aun asi, por si aun quedara algun atisbo de duda sobre la culpabilidad del acusado...");

        //22
        arrayTexto.add("Llamo al estrado al primer testigo.");

        //23
        arrayTexto.add("!");

        //24
        arrayTexto.add("(Un testigo? Solo podria tratarse de el...)");
    }

    public int getTamañoArray(){

        return arrayTexto.size();
    }
    private String arrayTexto(int i) {

        return arrayTexto(i);
    }
}