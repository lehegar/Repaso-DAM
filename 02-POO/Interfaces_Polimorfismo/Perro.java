package Interfaces_Polimorfismo;
public class Perro implements Sonido {
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau!");
    }
}