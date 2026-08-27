import java.sql.*;
import java.util.ArrayList;

public class ProductoDAO {

    private Connection conn;

    public ProductoDAO(Connection conn) {
        this.conn = conn;
    }

    // Ver todos los productos
    public void mostrarTodos() throws SQLException {
        String sql = "SELECT * FROM productos";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " | " + rs.getString("nombre") + " | " + rs.getDouble("precio") + "€ | Stock: " + rs.getInt("stock"));
        }
    }

    // Añadir producto
    public void añadir(String nombre, double precio, int stock) throws SQLException {
        String sql = "INSERT INTO productos VALUES (seq_productos.NEXTVAL, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nombre);
        ps.setDouble(2, precio);
        ps.setInt(3, stock);
        ps.executeUpdate();
        conn.commit();
        System.out.println("Producto añadido.");
    }

    // Actualizar precio
    public void actualizarPrecio(int id, double nuevoPrecio) throws SQLException {
        String sql = "UPDATE productos SET precio = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setDouble(1, nuevoPrecio);
        ps.setInt(2, id);
        ps.executeUpdate();
        conn.commit();
        System.out.println("Precio actualizado.");
    }

    // Eliminar producto
    public void eliminar(int id) throws SQLException {
        String sql = "DELETE FROM productos WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        conn.commit();
        System.out.println("Producto eliminado.");
    }
}