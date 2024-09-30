import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateRecords {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Student";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            String sql = "UPDATE Registration SET program = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, "Data Science");
            pstmt.setInt(2, 100);
            pstmt.executeUpdate();

            pstmt.setString(1, "Software Engineering");
            pstmt.setInt(2, 101);
            pstmt.executeUpdate();

            System.out.println("Records updated successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
