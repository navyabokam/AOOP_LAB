import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayRecords {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Student";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM Registration";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String program = rs.getString("program");

                System.out.println("ID: " + id + ", Name: " + name + ", Address: " + address + ", Program: " + program);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
