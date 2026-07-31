package Vehiculo;

public class Coche extends Vehiculo {

    private int numeroDePuertas;

    public Coche(String marca, String modelo, int velocidadMaxima, int numeroDePuertas) {
    super(marca, modelo, velocidadMaxima);
    this.numeroDePuertas = numeroDePuertas;
}

@Override
public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("Número de puertas: " + numeroDePuertas);
}


    
}
