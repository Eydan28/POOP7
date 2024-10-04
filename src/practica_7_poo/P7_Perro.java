/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_7_poo;

/**
 * Clase que representa a un Perro, heredando de la clase {P7_Animal}.
 * Esta clase incluye atributos y comportamientos específicos de los perros,
 * como la raza, si está entrenado, el tamaño, y otros comportamientos típicos de los perros.
 * 
 * 
 */
public class P7_Perro extends P7_Animal {
    private String raza;
    private boolean entrenado;
    private String tamaño;
    private String colorPelaje;
    private boolean amigable;

    /**
     * Constructor vacío que crea un objeto de tipo Perro sin inicializar sus atributos.
     * Llama al constructor vacío de la clase {@link P7_Animal}.
     */
    public P7_Perro() {
        super();
    }

    /**
     * Constructor que inicializa un objeto de tipo Perro con todos los atributos proporcionados,
     * incluyendo los atributos heredados de {@link P7_Animal} y los atributos específicos de un perro.
     * 
     * @param nombre       El nombre del perro.
     * @param edad         La edad del perro.
     * @param peso         El peso del perro.
     * @param color        El color del perro.
     * @param habitat      El hábitat del perro.
     * @param raza         La raza del perro.
     * @param entrenado    Indica si el perro está entrenado.
     * @param tamaño       El tamaño del perro.
     * @param colorPelaje  El color del pelaje del perro.
     * @param amigable     Indica si el perro es amigable.
     */
    public P7_Perro(String nombre, int edad, double peso, String color, String habitat, String raza, boolean entrenado, String tamaño, String colorPelaje, boolean amigable) {
        super(nombre, edad, peso, color, habitat);
        this.raza = raza;
        this.entrenado = entrenado;
        this.tamaño = tamaño;
        this.colorPelaje = colorPelaje;
        this.amigable = amigable;
    }

    /**
     * Obtiene la raza del perro.
     * 
     * @return La raza del perro.
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Establece la raza del perro.
     * 
     * @param raza La nueva raza del perro.
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Indica si el perro está entrenado.
     * 
     * @return {@code true} si el perro está entrenado, {@code false} en caso contrario.
     */
    public boolean isEntrenado() {
        return entrenado;
    }

    /**
     * Establece si el perro está entrenado.
     * 
     * @param entrenado {@code true} para indicar que el perro está entrenado, {@code false} en caso contrario.
     */
    public void setEntrenado(boolean entrenado) {
        this.entrenado = entrenado;
    }

    /**
     * Obtiene el tamaño del perro.
     * 
     * @return El tamaño del perro.
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * Establece el tamaño del perro.
     * 
     * @param tamaño El nuevo tamaño del perro.
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * Obtiene el color del pelaje del perro.
     * 
     * @return El color del pelaje.
     */
    public String getColorPelaje() {
        return colorPelaje;
    }

    /**
     * Establece el color del pelaje del perro.
     * 
     * @param colorPelaje El nuevo color del pelaje.
     */
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    /**
     * Indica si el perro es amigable.
     * 
     * @return {@code true} si el perro es amigable, {@code false} en caso contrario.
     */
    public boolean isAmigable() {
        return amigable;
    }

    /**
     * Establece si el perro es amigable.
     * 
     * @param amigable {@code true} para indicar que el perro es amigable, {@code false} en caso contrario.
     */
    public void setAmigable(boolean amigable) {
        this.amigable = amigable;
    }

    /**
     * Método que hace que el perro ladre.
     */
    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }

    /**
     * Método que hace que el perro corra.
     */
    public void correr() {
        System.out.println("El perro está corriendo.");
    }

    /**
     * Método que hace que el perro juegue.
     */
    public void jugar() {
        System.out.println("El perro está jugando.");
    }

    /**
     * Método que hace que el perro obedezca órdenes.
     */
    public void obedecer() {
        System.out.println("El perro está obedeciendo órdenes.");
    }

    /**
     * Método que hace que el perro cave en la tierra.
     */
    public void cavar() {
        System.out.println("El perro está cavando.");
    }
}
