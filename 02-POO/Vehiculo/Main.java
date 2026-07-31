package Vehiculo;

public class Main {

    public static void main(String[] args) {

        Coche coche = new Coche("Seat", "Ibiza", 180, 5);
        Moto moto = new Moto("Yamaha", "MT-07", 214, false);

        System.out.println("=== COCHE ===");
        coche.mostrarInfo();

        System.out.println();

        System.out.println("=== MOTO ===");
        moto.mostrarInfo();
    }
}