import java.util.ArrayList;

public class Tienda {

    // La tienda tiene una lista donde guarda los productos
    private ArrayList<Producto> listaDeProductos;

    // Cuando se crea una tienda, la lista empieza vacía
    public Tienda() {
        listaDeProductos = new ArrayList<>();
    }

    // Recibo un producto y lo guardo en la lista
    public void añadirProducto(Producto productoQueRecibo) {
        listaDeProductos.add(productoQueRecibo);
    }

    // Recorro la lista y muestro cada producto
    public void mostrarProductos() {
        for (Producto productoDeLaLista : listaDeProductos) {
            productoDeLaLista.mostrarInfo();
        }
    }

    public void buscarProducto(String nombreBuscado) {
        for (Producto productoDeLaLista : listaDeProductos) {
            if (productoDeLaLista.getNombre().equals(nombreBuscado)) {
                productoDeLaLista.mostrarInfo();
            }
        }
    }

    public void eliminarProducto(String nombreEliminado) {
        for (Producto productoDeLaLista : listaDeProductos) {
            if (productoDeLaLista.getNombre().equals(nombreEliminado)) {
                listaDeProductos.remove(productoDeLaLista);
            }
        }
    }
}