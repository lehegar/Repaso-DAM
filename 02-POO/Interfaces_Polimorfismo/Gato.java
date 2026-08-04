package Interfaces_Polimorfismo;
public class Gato implements Sonido {
    @Override
    public void hacerSonido() {
        System.out.println("¡Miau!");
    }
}