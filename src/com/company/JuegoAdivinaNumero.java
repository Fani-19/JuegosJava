package com.company;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego implements Jugable {
    private int numAdivinar;

    public JuegoAdivinaNumero(int vidas, int num) {
        super(vidas);
        this.numAdivinar = num;
    }


    public void juega() {
        this.reiniciaPartida();
        int num;
        Scanner leer = new Scanner(System.in);
        boolean seguir = true;
        do {
            System.out.println("Adivina el número entre 0 y 10");
            num = leer.nextInt();
            leer.nextLine();
            if(validaNumero(num)) {
                if (numAdivinar == num) {
                    System.out.println("Acertaste!!");
                    actualizaRecord();
                    seguir = false;
                } else {
                    if (quitaVida()) {
                        if (num > numAdivinar) {
                            System.out.println("El número es menor, vuelve a intentarlo!!");
                        } else {

                            System.out.println("El números es mayor, vuelve a intentarlo!!");
                        }
                    } else {
                        seguir = false;
                    }
                }
            }
        } while (seguir);

    }

    @Override
    public void muestraNombre() {
        System.out.println("Juego Adivina número");
    }

    @Override
    public void muestraInfo() {
        System.out.println("Introduce numeros del uno al 10 hasta que aciertes o pierdas todas las vidas, si fallas te daran la pista de si es mayor o menor. Suerte!!");
        this.MuestraVidasRestantes();
    }

    public boolean validaNumero(int num){
        return true;
}
}
