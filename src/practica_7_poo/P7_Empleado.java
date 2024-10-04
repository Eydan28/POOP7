/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_7_poo;

/**
 * Clase que representa a un empleado con atributos como nombre, número de empleado y sueldo.
 * Proporciona métodos para gestionar y modificar el sueldo del empleado.
 * 
 * 
 */
public class P7_Empleado extends Object {
    // Atributos
    private String nombre;
    private int numEmpleado;
    private float sueldo;
    
    /**
     * Constructor vacío que crea un objeto de tipo Empleado sin inicializar sus atributos.
     */
    public P7_Empleado() {
        
    }
    
    /**
     * Constructor que inicializa un objeto de tipo Empleado con los atributos proporcionados.
     * 
     * @param nombre      El nombre del empleado.
     * @param numEmpleado El número de identificación del empleado.
     * @param sueldo      El sueldo del empleado.
     */
    public P7_Empleado(String nombre, int numEmpleado, float sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    /**
     * Obtiene el nombre del empleado.
     * 
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * 
     * @param nombre El nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de empleado.
     * 
     * @return El número de empleado.
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Establece el número de empleado.
     * 
     * @param numEmpleado El nuevo número de empleado.
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    /**
     * Obtiene el sueldo del empleado.
     * 
     * @return El sueldo del empleado.
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * Establece el sueldo del empleado.
     * 
     * @param sueldo El nuevo sueldo del empleado.
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Método que aumenta el sueldo del empleado en función de un porcentaje proporcionado.
     * 
     * @param porcentaje El porcentaje por el cual se aumentará el sueldo.
     */
    public void aumentarSueldo(int porcentaje) {
        sueldo += ((sueldo * porcentaje) / 100);
    }

    /**
     * Devuelve una representación en forma de cadena del objeto Empleado, 
     * que incluye el nombre, número de empleado y sueldo.
     * 
     * @return Una cadena con la información del empleado.
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
}
