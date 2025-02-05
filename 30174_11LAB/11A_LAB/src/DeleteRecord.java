import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Student";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            String sql = "DELETE FROM Registration WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 101);
            pstmt.executeUpdate();

            System.out.println("Record deleted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
