import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    public String username="root";
    public String pass="";
    public String dbUrl="jdbc:mysql://localhost:3306/obs";

    public Connection dbConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,username,pass);
    }

    public void errorMessage(SQLException exception){
        System.out.println("Hata mesajı: "+exception.getMessage());
        System.out.println("Hata kodu: "+exception.getErrorCode());
    }

    public void Deneme(){

    }

}

