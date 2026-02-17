package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class FuncionarioCRUD {

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
}
