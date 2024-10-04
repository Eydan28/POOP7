/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_7_poo;

/**
 * Clase que representa a un ave, heredando de la clase base {P7_Animal}.
 * Esta clase contiene atributos específicos de las aves como el tipo de plumas, envergadura, 
 * si puede volar, el tipo de canto y el tipo de pico.
 * También ofrece métodos específicos relacionados con el comportamiento de las aves.
 * 
 * 
 */
public class P7_Ave extends P7_Animal {
    // Atributos
    private String tipoPlumas;
    private double envergadura;
    private boolean vuela;
    private String canto;
    private String tipoPico;

    /**
     * Constructor vacío que crea un objeto de tipo Ave sin inicializar sus atributos.
     * Llama al constructor de la clase {@link P7_Animal}.
     */
    public P7_Ave() {
        super();
    }

    /**
     * Constructor que inicializa un objeto de tipo Ave con los atributos proporcionados, 
     * incluyendo los atributos heredados de la clase {@link P7_Animal}.
     * 
     * @param nombre       El nombre del ave.
     * @param edad         La edad del ave en años.
     * @param peso         El peso del ave en kilogramos.
     * @param color        El color del plumaje del ave.
     * @param habitat      El tipo de hábitat en el que vive el ave.
     * @param tipoPlumas   El tipo de plumas que posee el ave.
     * @param envergadura  La envergadura de las alas del ave en metros.
     * @param vuela        Indica si el ave es capaz de volar o no.
     * @param canto        El tipo de canto característico del ave.
     * @param tipoPico     El tipo de pico del ave.
     */
    public P7_Ave(String nombre, int edad, double peso, String color, String habitat, String tipoPlumas, double envergadura, boolean vuela, String canto, String tipoPico) {
        super(nombre, edad, peso, color, habitat);
        this.tipoPlumas = tipoPlumas;
        this.envergadura = envergadura;
        this.vuela = vuela;
        this.canto = canto;
        this.tipoPico = tipoPico;
    }

    /**
     * Obtiene el tipo de plumas del ave.
     * 
     * @return El tipo de plumas del ave.
     */
    public String getTipoPlumas() {
        return tipoPlumas;
    }

    /**
     * Establece el tipo de plumas del ave.
     * 
     * @param tipoPlumas El nuevo tipo de plumas del ave.
     */
    public void setTipoPlumas(String tipoPlumas) {
        this.tipoPlumas = tipoPlumas;
    }

    /**
     * Obtiene la envergadura del ave.
     * 
     * @return La envergadura de las alas del ave en metros.
     */
    public double getEnvergadura() {
        return envergadura;
    }

    /**
     * Establece la envergadura del ave.
     * 
     * @param envergadura La nueva envergadura de las alas del ave en metros.
     */
    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    /**
     * Indica si el ave puede volar.
     * 
     * @return {@code true} si el ave puede volar, {@code false} en caso contrario.
     */
    public boolean isVuela() {
        return vuela;
    }

    /**
     * Establece si el ave puede volar.
     * 
     * @param vuela {@code true} si el ave puede volar, {@code false} en caso contrario.
     */
    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    /**
     * Obtiene el tipo de canto del ave.
     * 
     * @return El tipo de canto característico del ave.
     */
    public String getCanto() {
        return canto;
    }

    /**
     * Establece el tipo de canto del ave.
     * 
     * @param canto El nuevo tipo de canto del ave.
     */
    public void setCanto(String canto) {
        this.canto = canto;
    }

    /**
     * Obtiene el tipo de pico del ave.
     * 
     * @return El tipo de pico del ave.
     */
    public String getTipoPico() {
        return tipoPico;
    }

    /**
     * Establece el tipo de pico del ave.
     * 
     * @param tipoPico El nuevo tipo de pico del ave.
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    /**
     * Método que simula que el ave está volando.
     * Solo permite volar si el ave tiene la capacidad de volar.
     */
    public void volar() {
        if (vuela) {
            System.out.println("El ave está volando.");
        } else {
            System.out.println("Este ave no puede volar.");
        }
    }

    /**
     * Método que simula que el ave está piando.
     */
    public void piar() {
        System.out.println("El ave está piando.");
    }

    /**
     * Método que simula que el ave está limpiando sus plumas.
     */
    public void limpiarPlumas() {
        System.out.println("El ave está limpiando sus plumas.");
    }

    /**
     * Método que simula que el ave está construyendo su nido.
     */
    public void construirNido() {
        System.out.println("El ave está construyendo su nido.");
    }

    /**
     * Método que simula que el ave está migrando.
     */
    public void migrar() {
        System.out.println("El ave está migrando.");
    }
}

