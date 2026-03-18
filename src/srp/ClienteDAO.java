package srp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    public static List<Cliente> resgatarTodos() throws SQLException {
        List<Cliente> clientes = new ArrayList<Cliente>();
        Connection connection = FabricaDB.getConnection();

        PreparedStatement stmt = connection.prepareStatement("select*from clientes");
        ResultSet rs = stmt.getResultSet();
        while(rs.next()){
            //Mapeando o resultado do obj
            map(rs, clientes);
        }
        return clientes;
    }

    private static void map(ResultSet rs, List<Cliente> clientes) throws SQLException {
        Cliente c = new Cliente();
        c.setId(rs.getInt("id"));
        c.setNome(rs.getString("nome"));
        clientes.add(c);
    }
}
