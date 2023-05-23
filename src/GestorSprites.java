import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorSprites {

    JFrame frame = new JFrame();
    SpriteDisplayTestigos spriteDisplayTestigos;
    SpriteDisplayJuez spriteDisplayJuez;
    SpriteDisplayFiscalia spriteDisplayFiscalia;
    SpriteDisplayDefensa spriteDisplayDefensa;

    JohnSprites johnSprites;
    JuezSprites juezSprites;
    MilesEdgeworthSprites milesEdgeworthSprites;
    NoraMarblerSprites noraMarblerSprites;
    PhoenixSprites phoenixSprites;
    UI ui;
    Background background;


    public GestorSprites(SpriteDisplayFiscalia spriteDisplayFiscalia, SpriteDisplayJuez spriteDisplayJuez,
                         SpriteDisplayTestigos spriteDisplayTestigos, SpriteDisplayDefensa spriteDisplayDefensa, Background background, UI ui){


        this.spriteDisplayTestigos = spriteDisplayTestigos;
        this.spriteDisplayJuez = spriteDisplayJuez;
        this.spriteDisplayFiscalia=spriteDisplayFiscalia;
        this.spriteDisplayDefensa=spriteDisplayDefensa;
        this.ui=ui;
        this.background=background;
    }

    public void setSprite(String personaje, String path){



            if(personaje=="Juez"){

                setSpritesNull();

                background.setBackground(background.backgroundStandJuez());
                ui.setNombrePersonaje("Juez");

                if(path=="Asintiendo"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN
                    spriteDisplayJuez.setSpriteImage(null);

                    spriteDisplayJuez.setSpriteImage("Sprites/Sprites/JuezSprites/JuezAsintiendoNegando/JuezAsintiendo.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayJuez.setSpriteImage("Sprites/Sprites/JuezSprites/JuezAsintiendoNegando/JuezIdle.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Negando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN
                    spriteDisplayJuez.setSpriteImage(null);

                    spriteDisplayJuez.setSpriteImage("Sprites/Sprites/JuezSprites/JuezAsintiendoNegando/JuezNegando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayJuez.setSpriteImage("Sprites/Sprites/JuezSprites/JuezAsintiendoNegando/JuezIdle.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Hablando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN
                    spriteDisplayJuez.setSpriteImage(null);

                    spriteDisplayJuez.setSpriteImage("Sprites/Sprites/JuezSprites/JuezHablando/JuezHablando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayJuez.setSpriteImage("Sprites/Sprites/JuezSprites/JuezHablando/JuezIdle.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Serio"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN
                    spriteDisplayJuez.setSpriteImage(null);

                    spriteDisplayJuez.setSpriteImage("Sprites/Sprites/JuezSprites/JuezSerio/JuezSerio.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayJuez.setSpriteImage("Sprites/Sprites/JuezSprites/JuezSerio/JuezSerioIdle.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Sorprendido"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN
                    spriteDisplayJuez.setSpriteImage(null);

                    spriteDisplayJuez.setSpriteImage("Sprites/Sprites/JuezSprites/JuezSorprendido/JuezSorprendidoHablando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayJuez.setSpriteImage("Sprites/Sprites/JuezSprites/JuezSorprendido/JuezSorprendidoIdle.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="OjosCerrados"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN
                    spriteDisplayJuez.setSpriteImage(null);

                    spriteDisplayJuez.setSpriteImage("Sprites/Sprites/JuezSprites/JuezSerio/JuezSerioOjosCerrados.gif");
                }


            }


            if(personaje=="Phoenix"){

                setSpritesNull();

                background.setBackground(background.backgroundStandDefensa());
                ui.setNombrePersonaje("Phoneix W.");


                if(path=="Hablando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN
                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixHablando/PhoenixHablando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixHablando/PhoenixHablandoIdle.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="GolpeMesa"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixGolpeMesa/PhoenixGolpeMesa.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixGolpeMesa/PhoenixGolpeMesaIdle.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="GolpeMesaHablando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixGolpeMesa/PhoenixGolpeMesaHablando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixGolpeMesa/PhoenixGolpeMesaIdle.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Apuntando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixApuntando/PhoenixApuntando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixApuntando/PhoenixApuntandoEstatico.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="ApuntandoHablando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixApuntando/PhoenixApuntandoHablando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixApuntando/PhoenixApuntandoEstatico.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Asiente"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixAsienteONiega/PhoenixAsiente.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixAsienteONiega/PhoenixAsienteNiegaIdle.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Niega"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixAsienteONiega/PhoenixNiega.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixAsienteONiega/PhoenixAsienteNiegaIdle.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Derrotado"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixDerrotado/PhoenixDerrotado.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixDerrotado/PhoenixDerrotadoIdle.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Leyendo"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixLeyendo/PhoenixLeyendoHablando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixLeyendo/PhoenixLeyendoIdle.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Pensando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixPensando/PhoenixPensandoAnimado.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixPensando/PhoenixPensandoIdle.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="PensandoHablando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixPensando/PhoenixPensandoHablando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixPensando/PhoenixPensandoIdle.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Rascando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixRascandoCabeza/PhoenixRascandoCabezaHablando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixRascandoCabeza/PhoenixRascandoCabezaEstatico.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Sudando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixSudando/PhoenixSudandoHablando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/PhoenixSprites/PhoenixSudando/PhoenixSudandoEstatico.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

            }



            if(personaje=="Ama"){

                spriteDisplayJuez.setSpriteImage(null);
                spriteDisplayFiscalia.setSpriteImage(null);
                spriteDisplayDefensa.setSpriteImage(null);

                spriteDisplayTestigos.setSpriteImage(path);
                background.setBackground(background.backgroundStandTestigo());
                ui.setNombrePersonaje("Ama");
            }

            //ANIMACIONES MILES
            if(personaje=="Miles"){

                setSpritesNull();

                spriteDisplayFiscalia.setSpriteImage(path);
                background.setBackground(background.backgroundStandFiscalia());
                ui.setNombrePersonaje("Miles");

                if(path=="Hablando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN
                    setSpritesNull();

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesIdleHablando/MilesHablando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesIdleHablando/MilesHablandoIdle.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Leyendo"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesPapel/MilesPapel.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesPapel/MilesPapelEstatico.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Pensando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesPensando/MilesPensando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesPensando/MilesPensandoEstatico.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }


                if(path=="Dedo"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesDedoCabeza/MilesDedo.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesDedoCabeza/MilesDedoEstatico.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Señalando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesSeñalando/MilesSeñalando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesSeñalando/MilesSeñalandoEstatico.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Golpe"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesGolpe/MilesGolpe.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesGolpe/MilesGolpeEstatico.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="GolpeHablando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesGolpe/MilesGolpeHablando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesGolpe/MilesGolpeEstatico.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="GolpeEnfadado"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesGolpeEnfadado/GolpeEnfadadoHablando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesGolpeEnfadado/GolpeEnfadadoEstatico.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Derrotado"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN
                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesDerrotado/MilesDerrotadoEstatico.gif");
                }

                if(path=="CondescendienteNegando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesCondescendiente/MilesCondescendienteNegando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesCondescendiente/MilesCondescendienteEstatico.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="CondescendienteHablando"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesCondescendiente/MilesCondescendienteHablando.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesCondescendiente/MilesCondescendienteEstatico.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }

                if(path=="Reverencia"){

                    //ESTA LINEA SIRVE PARA LIMPIAR EL ESTADO ANTERIOR DE LA IMAGEN

                    spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesReverencia/MilesReverencia.gif");
                    Timer timer = new Timer(700, e -> {

                        spriteDisplayDefensa.setSpriteImage("Sprites/Sprites/MilesSprites/MilesReverencia/MilesreverenciaEstatico.gif");
                    });
                    timer.start();
                    timer.setRepeats(false);
                }
            }
    }

    public void setSpritesNull(){

        spriteDisplayJuez.setSpriteImage(null);
        spriteDisplayDefensa.setSpriteImage(null);
        spriteDisplayTestigos.setSpriteImage(null);
        spriteDisplayFiscalia.setSpriteImage(null);
    }
}