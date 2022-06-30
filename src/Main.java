import java.sql.Connection;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {
        Connection connection=null;
        DbHelper helper=new DbHelper();
        try{
            connection=helper.dbConnection();
            System.out.println("veri tabanı bağlandı");
        }catch (SQLException exception){
            helper.errorMessage(exception);
        }
        finally {
            connection.close();
            System.out.println("veri bağlantısı kapatıldı");
        }

    }
}
