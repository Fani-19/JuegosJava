package com.company;

public class Aplicacion {

    public static void main(String[] args) {

    JuegoAdivinaNumero juego=new JuegoAdivinaNumero(3,6);
   JuegoAdivinaPar juego1 =new JuegoAdivinaPar(3,4);
   JuegoAdivinaImpar juego2=new JuegoAdivinaImpar(3,3);
   juego.juega();
   juego1.juega();
   juego2.juega();

    }
}

