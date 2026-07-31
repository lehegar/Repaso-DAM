package Vehiculo;

public class Vehiculo {
    // ATRIBUTOS
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    // CONSTRUCTOR
    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }


    // MÉTODO
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Máxima: " + velocidadMaxima);
    }
}
