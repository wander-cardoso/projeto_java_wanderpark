
package model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author formando
 */
public class RegistoPark {
    
    ArrayList<Veiculo> veiculos;
    private int vaga;
    private int localDataTimeEntrada;
    private int localDataTimeSaida;
    private double valorTotal;

    public RegistoPark(ArrayList<Veiculo> veiculos, int vaga, int localDataTimeEntrada, int localDataTimeSaida, double valorTotal) {
        this.veiculos = veiculos;
        this.vaga = vaga;
        this.localDataTimeEntrada = localDataTimeEntrada;
        this.localDataTimeSaida = localDataTimeSaida;
        this.valorTotal = valorTotal;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public int getVaga() {
        return vaga;
    }

    public void setVaga(int vaga) {
        this.vaga = vaga;
    }

    public int getLocalDataTimeEntrada() {
        return localDataTimeEntrada;
    }

    public void setLocalDataTimeEntrada(int localDataTimeEntrada) {
        this.localDataTimeEntrada = localDataTimeEntrada;
    }

    public int getLocalDataTimeSaida() {
        return localDataTimeSaida;
    }

    public void setLocalDataTimeSaida(int localDataTimeSaida) {
        this.localDataTimeSaida = localDataTimeSaida;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
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
        final RegistoPark other = (RegistoPark) obj;
        if (this.vaga != other.vaga) {
            return false;
        }
        if (this.localDataTimeEntrada != other.localDataTimeEntrada) {
            return false;
        }
        if (this.localDataTimeSaida != other.localDataTimeSaida) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorTotal) != Double.doubleToLongBits(other.valorTotal)) {
            return false;
        }
        return Objects.equals(this.veiculos, other.veiculos);
    }

    @Override
    public String toString() {
        return "RegistoPark{" + "veiculos=" + veiculos + ", vaga=" + vaga + ", localDataTimeEntrada=" + localDataTimeEntrada + ", localDataTimeSaida=" + localDataTimeSaida + ", valorTotal=" + valorTotal + '}';
    }
    
    
}
