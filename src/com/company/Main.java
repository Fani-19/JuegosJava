package com.company;

public class Main {

    public static void main(String[] args) {

        Juego juego = new Juego(5);
        Juego juego1 = new Juego(5);
        juego.quitaVida();
        juego.MuestraVidasRestantes();
        juego.reiniciaPartida();
        juego.MuestraVidasRestantes();
        juego.actualizaRecord();
        juego1.actualizaRecord();

    }
}

