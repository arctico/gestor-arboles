package prog_examen_1314;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Examen de Programación Final Curso 13/14. 3ª Evaluación. Realizado a modo de práctica.
 * Es un gestor simple en el que se pueden insertar varios tipos de árboles, buscarlos y listarlos.
 * Clase Main. Muestra el menú y las opciones para operar con la información de los árboles
 * @author Felipe Arcos González
 */
public class Main {
    // ArrayLists que contienen los objetos insertados
    static ArrayList<Frutal> listaFrutales = new ArrayList<>();
    static ArrayList<NoFrutal> listaNoFrutales = new ArrayList<>();

    /**
    * Método principal, muestra el menú y trata las opciones que elija el usuario
    */
    public static void main(String[] args) {
        String opcion = "";
        String menu = "1 - Insertar árbol frutal\n"
                + "2 - Insertar árbol no frutal\n"
                + "3 - Buscar árbol frutal\n"
                + "4 - Buscar árbol no frutal\n"
                + "5 - Listar árboles\n"
                + "\nIntroduzca una opción:";
        
        while (opcion != null) {
            // Petición y entrada de la opción por parte del usuario
            opcion = JOptionPane.showInputDialog(null, menu, "Menú principal", JOptionPane.QUESTION_MESSAGE);
            
            if (opcion != null){
                // Tratamiento de la opción elegida
                switch (opcion) {
                    case "1": // Inserta un árbol frutal
                        try {
                            insertarArbolFrutal();
                        } catch (NumberFormatException nfe) { // Se produce al introducir un tipo de dato no válido
                            JOptionPane.showMessageDialog(null, "Los datos introducidos no son correctos. Inténtalo de nuevo");
                        }   
                    break;

                    case "2": // Inserta un árbol no frutal
                        try {
                            insertarArbolNoFrutal();
                        } catch (NumberFormatException nfe) { // Se produce al introducir un tipo de dato no válido
                            JOptionPane.showMessageDialog(null, "Los datos introducidos no son correctos. Inténtalo de nuevo");
                        }   
                    break;

                    case "3": // Busca un árbol frutal
                        String nombreFrutal = JOptionPane.showInputDialog(null, "Nombre del árbol a buscar:", null, JOptionPane.QUESTION_MESSAGE);
                        Frutal frutal = buscarArbolFrutal(nombreFrutal);
                        // Si se ha encontrado, se muestra
                        if (frutal != null) {
                            JOptionPane.showMessageDialog(null, "Árbol frutal encontrado: \n" + frutal.mostrar());
                        } else {
                            JOptionPane.showMessageDialog(null, "Árbol frutal no encontrado");
                        }
                        
                    break;

                    case "4": // Busca un árbol no frutal
                        String nombreNoFrutal = JOptionPane.showInputDialog(null, "Nombre del árbol a buscar:", null, JOptionPane.QUESTION_MESSAGE);
                        NoFrutal noFrutal = buscarArbolNoFrutal(nombreNoFrutal);
                        // Si se ha encontrado, se muestra
                        if (noFrutal != null) {
                            JOptionPane.showMessageDialog(null, "Árbol no frutal encontrado: \n" + noFrutal.mostrar());
                        } else {
                            JOptionPane.showMessageDialog(null, "Árbol no frutal no encontrado");
                        }
                    break;
                        
                    case "5": // Lista todos los árboles
                        listarArboles();
                    break;

                    default:
                        JOptionPane.showMessageDialog(null, "Introduzca una opción correcta");
                }
            }    
        }
    }
    
    /**
     * Inserta un árbol frutal. Pide los datos del árbol, crea el objeto y lo guarda en un ArrayList
     * @throws NumberFormatException 
     */
    public static void insertarArbolFrutal() throws NumberFormatException {
        // Petición de los datos del árbol
        String nombreArbol = JOptionPane.showInputDialog(null, "Nombre del árbol:", null, JOptionPane.QUESTION_MESSAGE);
        double alturaArbol = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura (en cm):", null, JOptionPane.QUESTION_MESSAGE));
        double pesoFruto = Double.parseDouble(JOptionPane.showInputDialog(null, "Peso del fruto (en g):", null, JOptionPane.QUESTION_MESSAGE));
        int seco = JOptionPane.showConfirmDialog(null, "¿Es un fruto seco?", null, JOptionPane.YES_NO_OPTION);

        // El JOptionPane devuelve 0 cuando se elige "Sí" y 1 cuando se elige "No", de ahí esta sentencia
        boolean secoFruto = seco == 0; 
        String mesReco = JOptionPane.showInputDialog(null, "Mes de recolección:", null, JOptionPane.QUESTION_MESSAGE);
        
        // Creación del fruto
        Fruto fruto = new Fruto(pesoFruto, secoFruto);
        
        // Creación del árbol frutal
        Frutal frutal = new Frutal(nombreArbol, alturaArbol, fruto, mesReco);
        
        // Se añade al ArrayList de árboles frutales
        listaFrutales.add(frutal);
    }
    
    /**
     * Inserta un árbol no frutal. Pide los datos del árbol, crea el objeto y lo guarda en un ArrayList
     * @throws NumberFormatException 
     */
    public static void insertarArbolNoFrutal() throws NumberFormatException {
        // Petición de los datos del árbol
        String nombreArbol = JOptionPane.showInputDialog(null, "Nombre del árbol:", null, JOptionPane.QUESTION_MESSAGE);
        double alturaArbol = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura (en cm):", null, JOptionPane.QUESTION_MESSAGE));
        double precioArbol = Double.parseDouble(JOptionPane.showInputDialog(null, "Precio (en euros):", null, JOptionPane.QUESTION_MESSAGE));        
        
        // Creación del árbol no frutal
        NoFrutal nofrutal = new NoFrutal(nombreArbol, alturaArbol, precioArbol);
        
        // Se añade al ArrayList de árboles no frutales
        listaNoFrutales.add(nofrutal);
    }
    
    /**
     * Recorre el ArrayList de árboles frutales buscando coincidencias
     * @param nombre
     * @return el objeto Frutal
     */
    public static Frutal buscarArbolFrutal(String nombre) {
        Frutal frutal = null;
        for (Frutal listaFrutale : listaFrutales) {
            String aux = listaFrutale.getNombre(); // Se obtiene el nombre del árbol
            // Si coincide, se guarda
            if (aux.equals(nombre)) {
                frutal = listaFrutale;
            }
        }
        // Se retorna el árbol, haya coincidencias o no (si no existía, se retorna null
        return frutal;        
    }
    
    /**
     * Recorre el ArrayList de árboles no frutales buscando coincidencias
     * @param nombre
     * @return el objeto NoFrutal
     */
    public static NoFrutal buscarArbolNoFrutal(String nombre) {
        NoFrutal noFrutal = null;
        for (NoFrutal listaNoFrutale : listaNoFrutales) {
            String aux = listaNoFrutale.getNombre(); // Se obtiene el nombre del árbol
            // Si coincide, se guarda
            if (aux.equals(nombre)) {
                noFrutal = listaNoFrutale;
            }
        }
        // Se retorna el árbol, haya coincidencias o no (si no existía, se retorna null
        return noFrutal;
    }
    
    /**
     * 
     */
    public static void listarArboles() {
        String frutales = "";
        String nofrutales = "";
        
        // Se recorre la lista de árboles frutales y se guarda en una variable
        for (Frutal listaFrutale : listaFrutales) {
            frutales += listaFrutale.mostrar();
        }
        
        // Se recorre la lista de árboles no frutales y se guarda en una variable
        for (NoFrutal listaNoFrutale : listaNoFrutales) {
            nofrutales += listaNoFrutale.mostrar();
        }
        
        // Se imprimen todos los árboles
        JOptionPane.showMessageDialog(null, "Árboles frutales: \n" + frutales + "\n\nÁrboles no frutales: \n" + nofrutales);
    }
    
}
