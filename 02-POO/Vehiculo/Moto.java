package Vehiculo;

public class Moto extends Vehiculo {

    // Atributo propio de Moto
    private boolean tieneSidecar;

    // Constructor
    public Moto(String marca, String modelo, int velocidadMaxima, boolean tieneSidecar) {
        super(marca, modelo, velocidadMaxima);
        this.tieneSidecar = tieneSidecar;
    }

    // Sobrescribimos el método del padre
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tiene sidecar: " + tieneSidecar);
    }
}