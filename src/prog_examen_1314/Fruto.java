package prog_examen_1314;

/**
 * Clase Fruto
 * @author Felipe Arcos González
 */
public class Fruto {
    // Atributos de clase
    private double pesoAprox;
    private boolean seco;
    
    // Constructor por defecto (sin parámetros)
    public Fruto() {
        
    }
    
    // Constructor con parámetros
    public Fruto(double pesoAprox, boolean seco) {
        this.pesoAprox = pesoAprox;
        this.seco = seco;
    }

    /**
     * @return the pesoAprox
     */
    public double getPesoAprox() {
        return pesoAprox;
    }

    /**
     * @param pesoAprox the pesoAprox to set
     */
    public void setPesoAprox(double pesoAprox) {
        this.pesoAprox = pesoAprox;
    }

    /**
     * @return the seco
     */
    public boolean isSeco() {
        return seco;
    }

    /**
     * @param seco the seco to set
     */
    public void setSeco(boolean seco) {
        this.seco = seco;
    }
    
    /**
     * Muestra información sobre el fruto
     * @return el peso del fruto, si es seco o no
     */
    public String mostrar() {
        return this.pesoAprox + "g - " + this.seco;
    }
}
