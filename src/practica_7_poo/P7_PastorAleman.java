/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_7_poo;

/**
 * Clase que representa a un perro de raza Pastor Alemán, heredando de la clase {P7_Perro}.
 * Esta clase incluye características adicionales específicas de los pastores alemanes, 
 * como su habilidad para ser perros policía, perros guía, y su alto nivel de inteligencia.
 * 
 * 
 */
public class P7_PastorAleman extends P7_Perro {
    private boolean perroPolicia;
    private boolean perroGuia;
    private int nivelInteligencia;
    private int velocidadMaxima;
    private boolean protector;

    /**
     * Constructor vacío que crea un objeto de tipo PastorAleman sin inicializar sus atributos.
     * Llama al constructor vacío de la clase {@link P7_Perro}.
     */
    public P7_PastorAleman() {
        super();
    }

    /**
     * Constructor que inicializa un objeto de tipo PastorAleman con todos los atributos proporcionados,
     * incluyendo los atributos heredados de {@link P7_Perro} y los atributos específicos de un pastor alemán.
     * 
     * @param nombre          El nombre del pastor alemán.
     * @param edad            La edad del pastor alemán.
     * @param peso            El peso del pastor alemán.
     * @param color           El color del pastor alemán.
     * @param habitat         El hábitat del pastor alemán.
     * @param raza            La raza del perro, en este caso, Pastor Alemán.
     * @param entrenado       Indica si el perro ha sido entrenado.
     * @param tamaño          El tamaño del perro.
     * @param colorPelaje     El color del pelaje del perro.
     * @param amigable        Indica si el perro es amigable.
     * @param perroPolicia    Indica si el perro es utilizado como perro policía.
     * @param perroGuia       Indica si el perro es utilizado como perro guía.
     * @param nivelInteligencia El nivel de inteligencia del perro.
     * @param velocidadMaxima La velocidad máxima a la que el perro puede correr, en km/h.
     * @param protector       Indica si el perro tiene un comportamiento protector hacia su dueño.
     */
    public P7_PastorAleman(String nombre, int edad, double peso, String color, String habitat, String raza, boolean entrenado, String tamaño, String colorPelaje, boolean amigable,
                           boolean perroPolicia, boolean perroGuia, int nivelInteligencia, int velocidadMaxima, boolean protector) {
        super(nombre, edad, peso, color, habitat, raza, entrenado, tamaño, colorPelaje, amigable);
        this.perroPolicia = perroPolicia;
        this.perroGuia = perroGuia;
        this.nivelInteligencia = nivelInteligencia;
        this.velocidadMaxima = velocidadMaxima;
        this.protector = protector;
    }

    /**
     * Indica si el Pastor Alemán es un perro policía.
     * 
     * @return {@code true} si el perro es policía, {@code false} en caso contrario.
     */
    public boolean isPerroPolicia() {
        return perroPolicia;
    }

    /**
     * Establece si el Pastor Alemán es un perro policía.
     * 
     * @param perroPolicia {@code true} para hacer que el perro sea policía, {@code false} en caso contrario.
     */
    public void setPerroPolicia(boolean perroPolicia) {
        this.perroPolicia = perroPolicia;
    }

    /**
     * Indica si el Pastor Alemán es un perro guía.
     * 
     * @return {@code true} si el perro es guía, {@code false} en caso contrario.
     */
    public boolean isPerroGuia() {
        return perroGuia;
    }

    /**
     * Establece si el Pastor Alemán es un perro guía.
     * 
     * @param perroGuia {@code true} para hacer que el perro sea guía, {@code false} en caso contrario.
     */
    public void setPerroGuia(boolean perroGuia) {
        this.perroGuia = perroGuia;
    }

    /**
     * Obtiene el nivel de inteligencia del Pastor Alemán.
     * 
     * @return El nivel de inteligencia del perro.
     */
    public int getNivelInteligencia() {
        return nivelInteligencia;
    }

    /**
     * Establece el nivel de inteligencia del Pastor Alemán.
     * 
     * @param nivelInteligencia El nuevo nivel de inteligencia del perro.
     */
    public void setNivelInteligencia(int nivelInteligencia) {
        this.nivelInteligencia = nivelInteligencia;
    }

    /**
     * Obtiene la velocidad máxima a la que puede correr el Pastor Alemán.
     * 
     * @return La velocidad máxima en km/h.
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * Establece la velocidad máxima a la que puede correr el Pastor Alemán.
     * 
     * @param velocidadMaxima La nueva velocidad máxima en km/h.
     */
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * Indica si el Pastor Alemán es protector con su dueño.
     * 
     * @return {@code true} si el perro es protector, {@code false} en caso contrario.
     */
    public boolean isProtector() {
        return protector;
    }

    /**
     * Establece si el Pastor Alemán es protector con su dueño.
     * 
     * @param protector {@code true} para hacer que el perro sea protector, {@code false} en caso contrario.
     */
    public void setProtector(boolean protector) {
        this.protector = protector;
    }

    /**
     * Método que hace que el Pastor Alemán patrulle si es un perro policía.
     */
    public void patrullar() {
        if (perroPolicia) {
            System.out.println("El Pastor Alemán está patrullando.");
        } else {
            System.out.println("Este Pastor Alemán no es un perro policía.");
        }
    }

    /**
     * Método que hace que el Pastor Alemán guíe a una persona si es un perro guía.
     */
    public void guiar() {
        if (perroGuia) {
            System.out.println("El Pastor Alemán está guiando a una persona.");
        } else {
            System.out.println("Este Pastor Alemán no es un perro guía.");
        }
    }

    /**
     * Método que hace que el Pastor Alemán proteja a su dueño si tiene un comportamiento protector.
     */
    public void proteger() {
        if (protector) {
            System.out.println("El Pastor Alemán está protegiendo a su dueño.");
        } else {
            System.out.println("Este Pastor Alemán no tiene un comportamiento protector.");
        }
    }

    /**
     * Método que hace que el Pastor Alemán corra a su velocidad máxima.
     */
    @Override
    public void correr() {
        System.out.println("El Pastor Alemán está corriendo a una velocidad de " + velocidadMaxima + " km/h.");
    }

    /**
     * Método que hace que el Pastor Alemán resuelva problemas utilizando su inteligencia.
     */
    public void resolverProblemas() {
        System.out.println("El Pastor Alemán está usando su inteligencia para resolver un problema.");
    }
}
