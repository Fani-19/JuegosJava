package com.company;

import com.company.Interface.Jugable;
import com.company.Numeros.JuegoAdivinaImpar;
import com.company.Numeros.JuegoAdivinaNumero;
import com.company.Numeros.JuegoAdivinaPar;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String seguir;
        do {
            Jugable juego = eligeJuego();
            juego.muestraNombre();
            juego.muestraInfo();
            juego.juega();
            System.out.println("Seguir juegando? s/n \n");
            seguir = leer.nextLine();

        } while (seguir.equals("s"));
    }
    public static Jugable eligeJuego() {
        JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3, 6);
        JuegoAdivinaPar juego1 = new JuegoAdivinaPar(3, 4);
        JuegoAdivinaImpar juego2 = new JuegoAdivinaImpar(3, 3);
        Jugable[] juegos = new Jugable[3];
        juegos[0] = juego;
        juegos[1] = juego1;
        juegos[2] = juego2;
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println( "Juegos disponibles\n" +
                    "***0. Juego adivina número \n" +
                    "***1. Juego adivina número \n" +
                    "***2. Juego adivina número \n");
            opcion = leer.nextInt();
            leer.nextLine();

        } while (!(opcion <= 2) &&  (opcion >= 0));
        return juegos[opcion];
    }
}

