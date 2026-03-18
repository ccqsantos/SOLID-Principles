package srp;

import java.sql.*;
import java.util.*;

public class ListaCliente {
    public void listarCliente() throws SQLException {
        List<Cliente> clientes = ClienteDAO.resgatarTodos();
        Connection connection = FabricaDB.getConnection();

        for(Cliente c : clientes){
            System.out.println(c);
        }
    }
}
