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
                "phone VARCHAR(12), " +
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
            System.out.println("Member eklendi: Nickname = " + member.getNickName());

        } catch (SQLException e) {
            System.out.println("Member ekleme hatası: " + e.getMessage());
        }
    }

    public Member getMemberWithNickName(String nickName){
        String SQL = "SELECT * FROM members WHERE nickname = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, nickName);

            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                return new Member(rs.getString("name"), rs.getString("nickname"), rs.getString("email"),
                        rs.getString("password"), rs.getString("phone"), rs.getBytes("photo"));
            }
        }catch (SQLException e){
            System.out.println("Member okuma hatası: " + e.getMessage());
        }
        return null;
    }

    public Member getMemberWithMail(String mail){
        String SQL = "SELECT * FROM members WHERE email = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, mail);

            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                return new Member(rs.getString("name"), rs.getString("nickname"), rs.getString("email"),
                        rs.getString("password"), rs.getString("phone"), rs.getBytes("photo"));
            }
        }catch (SQLException e){
            System.out.println("Member okuma hatası: " + e.getMessage());
        }
        return null;
    }

    public Member getMember(String mailNickname){
        String SQLmail = "SELECT * FROM members WHERE email = ?";
        String SQLnickname = "SELECT * FROM members WHERE nickname = ?";
        try {
            PreparedStatement pstmtMail = conn.prepareStatement(SQLmail);
            pstmtMail.setString(1, mailNickname);

            ResultSet rsMail = pstmtMail.executeQuery();
            if(rsMail.next()){
                return new Member(rsMail.getString("name"), rsMail.getString("nickname"), rsMail.getString("email"),
                        rsMail.getString("password"), rsMail.getString("phone"), rsMail.getBytes("photo"));
            }else{
                PreparedStatement pstmtNickname = conn.prepareStatement(SQLnickname);
                pstmtNickname.setString(1, mailNickname);

                ResultSet rsNickname = pstmtNickname.executeQuery();
                if(rsNickname.next()){
                    return new Member(rsNickname.getString("name"), rsNickname.getString("nickname"), rsNickname.getString("email"),
                            rsNickname.getString("password"), rsNickname.getString("phone"), rsNickname.getBytes("photo"));
                }
            }

        }catch (SQLException e){
            System.out.println("Member okuma hatası: " + e.getMessage());
        }
        return null;
    }
}
