public class Main {

    public static void main(String[] args) {

        Producto producto1 = new Producto("Coca-Cola", 2.0, 34);
        producto1.mostrarInfo();

        Producto producto2 = new Producto("Fanta", 3.0, 84);
        producto2.mostrarInfo();
        producto2.setPrecio(5.0);
        producto2.mostrarInfo();
    }
}