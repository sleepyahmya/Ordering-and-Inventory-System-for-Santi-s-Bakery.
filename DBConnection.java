
package orderingsystemforsanti;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/childcasemanagement_db",
                    "root",
                    ""
            );
            System.out.println("✅ Database connected!");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "❌ DB Connection Error: " + e.getMessage());
            return null;
        }
    }
}