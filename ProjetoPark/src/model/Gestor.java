package model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author formando
 */
public class Gestor extends Funcionario{

    
    ArrayList<Funcionario> funcionarios;
    
    public Gestor(String name, String username, String password) {
        super(name, username, password);
    }

    public Gestor(ArrayList<Funcionario> funcionarios, String name, String username, String password) {
        super(name, username, password);
        this.funcionarios = funcionarios;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gestor other = (Gestor) obj;
        return Objects.equals(this.funcionarios, other.funcionarios);
    }

    @Override
    public String toString() {
        return "Gestor{" + "funcionarios=" + funcionarios + '}';
    }
    
    
    
    
    
}
