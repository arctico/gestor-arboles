package prog_examen_1314;

/**
 * Clase Árbol
 * @author Felipe Arcos González
 */
public abstract class Arbol {
    // Atributos de la clase
    protected String nombre;
    protected double altura;
    
    // Constructor por defecto (sin parámetros)
    public Arbol() {
        
    }
    
    // Constructor con parámetros
    public Arbol(String nombre, double altura) {
        this.nombre = nombre;
        this.altura = altura;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
        
}
