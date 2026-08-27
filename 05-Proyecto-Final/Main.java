import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/FREE",
                "system",
                "Oracle123!"
            );
            conn.setAutoCommit(false);
            System.out.println("Conexión exitosa!");

            ProductoDAO dao = new ProductoDAO(conn);
            int opcion = 0;

            do {
                System.out.println("\n----- MENÚ -----");
                System.out.println("1. Ver todos los productos");
                System.out.println("2. Añadir producto");
                System.out.println("3. Actualizar precio");
                System.out.println("4. Eliminar producto");
                System.out.println("5. Salir");

                try {
                    opcion = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Introduce un número válido.");
                    continue;
                }

                switch (opcion) {
                    case 1:
                        dao.mostrarTodos();
                        break;
                    case 2:
                        System.out.println("Nombre:");
                        String nombre = scanner.nextLine();
                        System.out.println("Precio:");
                        double precio = Double.parseDouble(scanner.nextLine());
                        System.out.println("Stock:");
                        int stock = Integer.parseInt(scanner.nextLine());
                        dao.añadir(nombre, precio, stock);
                        break;
                    case 3:
                        System.out.println("ID del producto:");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nuevo precio:");
                        double nuevoPrecio = Double.parseDouble(scanner.nextLine());
                        dao.actualizarPrecio(id, nuevoPrecio);
                        break;
                    case 4:
                        System.out.println("ID del producto a eliminar:");
                        int idEliminar = Integer.parseInt(scanner.nextLine());
                        dao.eliminar(idEliminar);
                        break;
                    case 5:
                        System.out.println("Hasta luego!");
                        break;
                }

            } while (opcion != 5);

            conn.close();

        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());
        }

        scanner.close();
    }
}