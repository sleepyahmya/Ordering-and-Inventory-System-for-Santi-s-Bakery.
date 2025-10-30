
package orderingsystemforsanti;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

public class UserDAO {

    // ✅ Database connection setup
    private static final String URL = "jdbc:mysql://localhost:3306/bakerydb";
    private static final String USER = "root";       // default XAMPP MySQL user
    private static final String PASSWORD = "";       // leave empty if no password in XAMPP

    // ✅ Create a connection
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // ✅ Validate login credentials
    public static boolean validateLogin(String username, String password, String role) {
        boolean isValid = false;

        String sql = "SELECT * FROM users WHERE username = ? AND password = ? AND role = ?";

        try (Connection con = getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, role);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                isValid = true; // found matching user
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isValid;
    }
}