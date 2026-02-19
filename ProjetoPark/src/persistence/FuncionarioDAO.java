package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class FuncionarioDAO {

    public int setDados(String sql) {
        
        
        try (Connection conn = DBWorker.getConnection();
             Statement st = conn.createStatement()) {

            return st.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
            return -1;
        }
    }

    public boolean setFuncionario(String nome, String username, String password) {

        String sql = "INSERT INTO funcionarios (name, username, password, status, tipo) "
                + "VALUES ('" + nome + "', '" + username + "', '" + password + "', 'ATIVO', 'FUNCIONARIO')";

        return setDados(sql) > 0;
    }
    
    public boolean updateFuncionario(int id, String nome, String username,
                                 String password, Status status, Tipo tipo)
     {
        String sql = "UPDATE funcionarios SET "
                + "name =     '" + nome + "'"
                + "username = '" + username + "'"
                + "password = '" + password + "'"
                + "status   = '" + status +   "'"
                + "tipo     = '" + tipo +     "'"
                +"WHERE id = " + id;
        
        return setDados(sql) > 0;
                
    }
}
