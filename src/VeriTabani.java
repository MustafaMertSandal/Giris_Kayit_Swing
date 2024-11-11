import java.sql.*;

public class VeriTabani {
    private static final String URL = "jdbc:postgresql://localhost:5432/giriskayit";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";
    private Connection conn;

    public VeriTabani(){
        try {
            this.conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Bağlantı başarılı!");
            createTable();
        } catch (SQLException e) {
            System.out.println("Bağlantı hatası: " + e.getMessage());
        }
    }

    private void createTable(){
        String SQL = "CREATE TABLE IF NOT EXISTS members (" +
                "id SERIAL PRIMARY KEY, " +
                "name VARCHAR(100) NOT NULL, " +
                "nickname VARCHAR(100) NOT NULL UNIQUE, " +
                "email VARCHAR(100) NOT NULL UNIQUE, " +
                "password VARCHAR(100) NOT NULL, " +
                "phone VARCHAR(12) NOT NULL, " +
                "photo BYTEA" +
                ")";

        try {
            Statement stmt = conn.createStatement();
            stmt.execute(SQL);
            System.out.println("Tablo başarıyla oluşturuldu veya zaten mevcut.");

        } catch (SQLException e) {
            System.out.println("Tablo oluşturulurken hata oluştu: " + e.getMessage());
        }
    }

    public void addMember(Member member){
        String SQL = "INSERT INTO members (name, nickname, email, password, phone, photo) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, member.getName());
            pstmt.setString(2, member.getNickName());
            pstmt.setString(3, member.getEmail());
            pstmt.setString(4, member.getPassword());
            pstmt.setString(5, member.getPhone());
            pstmt.setBytes(6, member.getPhoto());
            pstmt.executeUpdate();

            System.out.println("Veri eklendi!");

        } catch (SQLException e) {
            System.out.println("Veri ekleme hatası: " + e.getMessage());
        }
    }
}
