/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_7_poo;

/**
 * Clase que representa a un gerente, heredando de la clase {P7_Empleado}.
 * Además de los atributos y métodos de un empleado, un gerente tiene un presupuesto que puede ser asignado.
 * 
 * 
 */
public class P7_Gerente extends P7_Empleado {
    // Atributos adicionales
    private float presupuesto;
    
    /**
     * Constructor vacío que crea un objeto de tipo Gerente sin inicializar sus atributos.
     * Llama al constructor vacío de la clase {@link P7_Empleado}.
     */
    public P7_Gerente() {
    }

    /**
     * Constructor que inicializa un objeto de tipo Gerente con los atributos proporcionados,
     * incluyendo el nombre, número de empleado, sueldo y presupuesto.
     * 
     * @param nombre      El nombre del gerente.
     * @param numEmpleado El número de identificación del gerente.
     * @param sueldo      El sueldo del gerente.
     * @param presupuesto El presupuesto asignado al gerente.
     */
    public P7_Gerente(String nombre, int numEmpleado, float sueldo, float presupuesto) {
        super(nombre, numEmpleado, sueldo); // Hereda el constructor de P7_Empleado
        this.presupuesto = presupuesto;
    }

    /**
     * Obtiene el presupuesto asignado al gerente.
     * 
     * @return El presupuesto del gerente.
     */
    public float getPresupuesto() {
        return presupuesto;
    }

    /**
     * Establece el presupuesto asignado al gerente.
     * 
     * @param presupuesto El nuevo presupuesto del gerente.
     */
    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    /**
     * Método que asigna un nuevo presupuesto al gerente.
     * 
     * @param presupuesto El presupuesto que se asignará al gerente.
     * @return El nuevo presupuesto asignado.
     */
    public float asignarPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
        return presupuesto;
    }

    /**
     * Devuelve una representación en forma de cadena del objeto Gerente,
     * que incluye la información del empleado y el presupuesto asignado.
     * 
     * @return Una cadena con la información del gerente.
     */
    @Override
    public String toString() {
        return super.toString() + " Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}
