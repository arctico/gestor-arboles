package prog_examen_1314;

/**
 * Clase NoFrutal
 * @author Felipe Arcos González
 */
public class NoFrutal extends Arbol {
    // Atributos de clase
    private double precio;
    
    // Constructor por defecto (sin parámetros)
    public NoFrutal() {
        
    }
    
    // Constructor con parámetros
    public NoFrutal(String nombre, double altura, double precio) {
        this.nombre = nombre;
        this.altura = altura;
        this.precio = precio;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /**
     * Muestra información sobre el árbol
     * @return nombre, altura y precio
     */
    public String mostrar() {
        return this.nombre + " - " + this.altura + "cm - " + this.precio + "eur \n";
    }
    
}
