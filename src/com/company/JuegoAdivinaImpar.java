package com.company;

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
}

