package com.company.Numeros;

import com.company.Numeros.JuegoAdivinaNumero;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int vidas, int num) {
        super(vidas, num);
    }

    @Override
    public boolean validaNumero(int num) {
        if(num%2==0){
            return true;
        }else{
            System.out.println("Error");
            return false;
        }
    }
    public void muestraNombre(){
        System.out.println("Juego Adivina número par");
    }
    public void muestraInfo() {
        System.out.println("Introduce numeros pares del uno al 10 hasta que aciertes o pierdas todas las vidas, si fallas te daran la pista de si es mayor o menor. Suerte!!");
        this.MuestraVidasRestantes();
    }
}
