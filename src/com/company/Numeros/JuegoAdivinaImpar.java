package com.company.Numeros;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int vidas, int num) {
        super(vidas, num);
    }

    @Override
    public boolean validaNumero(int num) {
        if (num % 2 == 0) {
            System.out.println("Error");
            return false;
        } else {

            return true;
        }
    }
    public void muestraNombre(){
        System.out.println("Juego Adivina número impar");
    }
    public void muestraInfo() {
        System.out.println("Introduce numeros impares del uno al 10 hasta que aciertes o pierdas todas las vidas, si fallas te daran la pista de si es mayor o menor. Suerte!!");
        this.MuestraVidasRestantes();
    }
}

