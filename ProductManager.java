
package orderingsystemforsanti;

import java.sql.*;
import java.util.*;

public class ProductManager {
    
    private Connection conn;

    public ProductManager() {
        // Setup your DB connection here
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakerydb", "username", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Product> getProductsByCategory(String category) {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM products WHERE category = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, category);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setCategory(rs.getString("category"));
                p.setPrice(rs.getDouble("price"));
                p.setStock(rs.getInt("stock"));
                p.setImagePath(rs.getString("image_path"));
                products.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }

    public void updateProduct(Product p) {
    String sql = "UPDATE products SET price = ?, stock = ? WHERE id = ?";

    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setDouble(1, p.getPrice());
        stmt.setInt(2, p.getStock());
        stmt.setInt(3, p.getId());
        stmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}

