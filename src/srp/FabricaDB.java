package srp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class FabricaDB {
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql:localhost:3306/db"
                , "admin"
                , "123");

    }
}
