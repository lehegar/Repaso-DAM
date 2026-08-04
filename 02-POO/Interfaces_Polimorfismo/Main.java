package Interfaces_Polimorfismo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

     ArrayList<Sonido> sonidos = new ArrayList<>();

     Perro perro1 = new Perro();
     sonidos.add(perro1);

     Gato gato1 = new Gato();
     sonidos.add(gato1);

     Pato pato1 = new Pato();
     sonidos.add(pato1);
     

     for (Sonido animal : sonidos) {
        animal.hacerSonido();
     }

    }
}