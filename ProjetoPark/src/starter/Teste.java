package starter;

import persistence.DBWorker;

import java.sql.SQLException;
import persistence.FuncionarioDAO;

public class Teste {
    
    public static void main(String[] args) throws SQLException {
        
        FuncionarioDAO qc = new FuncionarioDAO();
        
        try {
            qc.setFuncionario("wander", "wander", "wander1234");
        } catch (Exception ex) {
            ex.getMessage();
        } finally{
            DBWorker.getConnection().close();
        }
        

    }
}
