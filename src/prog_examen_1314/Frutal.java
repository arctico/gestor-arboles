package prog_examen_1314;

/**
 * Clase Frutal
 * @author Felipe Arcos González
 */
public class Frutal extends Arbol {
    // Atributos de clase
    private Fruto fruto;
    private String mesRecoleccion;
    
    // Constructor por defecto (sin parámetros)
    public Frutal() {
        
    }
    
    // Constructor con parámetros
    public Frutal(String nombre, double altura, Fruto fruto, String mesRecoleccion) {
        this.nombre = nombre;
        this.altura = altura;
        this.fruto = fruto;
        this.mesRecoleccion = mesRecoleccion;
    }

    /**
     * @return the fruto
     */
    public Fruto getFruto() {
        return fruto;
    }

    /**
     * @param fruto the fruto to set
     */
    public void setFruto(Fruto fruto) {
        this.fruto = fruto;
    }

    /**
     * @return the mesRecoleccion
     */
    public String getMesRecoleccion() {
        return mesRecoleccion;
    }

    /**
     * @param mesRecoleccion the mesRecoleccion to set
     */
    public void setMesRecoleccion(String mesRecoleccion) {
        this.mesRecoleccion = mesRecoleccion;
    }
    
    /**
     * Muestra información sobre el árbol
     * @return nombre, altura, datos del fruto, mes de recolección
     */
    public String mostrar() {
        return this.nombre + " - " + this.altura + "cm - " + fruto.mostrar() + " - " + this.mesRecoleccion + "\n";
    }
    
    
}
