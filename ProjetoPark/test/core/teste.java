package core;

import persistence.DBWorker;

import java.sql.SQLException;
import persistence.FuncionarioCRUD;

public class teste {
    
    public static void main(String[] args) throws SQLException {
        FuncionarioCRUD qc = new FuncionarioCRUD();
        
        try {
            qc.setFuncionario("wander", "wander", "wander1234");
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            DBWorker.Desconnection();
        }
        

    }
}
