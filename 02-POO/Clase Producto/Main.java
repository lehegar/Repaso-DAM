public class Main {

    public static void main(String[] args) {

        Producto producto1 = new Producto("Coca-Cola", 2.0, 34);
        producto1.mostrarInfo();

        Producto producto2 = new Producto("Fanta", 3.0, 84);
        producto2.mostrarInfo();
        producto2.setPrecio(5.0);
        producto2.mostrarInfo();

        Tienda tienda1 = new Tienda();
        Producto cocaCola = new Producto("Coca-Cola", 3, 5);
        Producto sieteup = new Producto("7up", 1, 50);
        tienda1.añadirProducto(cocaCola);
        tienda1.añadirProducto(sieteup);

        tienda1.mostrarProductos();

        tienda1.buscarProducto("7up");

        tienda1.eliminarProducto("Coca-Cola");

        tienda1.mostrarProductos();
    }
}