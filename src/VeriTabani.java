import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VeriTabani {
    private static final String URL = "jdbc:postgresql://localhost:5432/giriskayit";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    public VeriTabani(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Bağlantı başarılı!");
        } catch (SQLException e) {
            System.out.println("Bağlantı hatası: " + e.getMessage());
        }
    }

}
