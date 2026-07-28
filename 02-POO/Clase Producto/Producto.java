public class Producto {

    // ATRIBUTOS
    private String nombre;
    private double precio;
    private int stock;

    // CONSTRUCTOR
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // GETTERS Y SETTERS

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

   public void setPrecio(double precio) {
    if (precio < 0) {
        System.out.println("El precio no puede ser negativo");
        return;
    }
    this.precio = precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // MÉTODO
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
}