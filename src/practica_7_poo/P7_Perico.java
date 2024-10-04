/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_7_poo;

/**
 * Clase que representa a un Perico, heredando de la clase {P7_Ave}.
 * Esta clase incluye atributos y comportamientos específicos de los pericos,
 * como la capacidad de hablar, cantar, y su comportamiento como mascota doméstica.
 * 
 * 
 */
public class P7_Perico extends P7_Ave {
    private String colorPlumas;
    private int capacidadHablar;
    private int numeroCanciones;
    private boolean mascotaDomestica;
    private String tipoDieta;

    /**
     * Constructor vacío que crea un objeto de tipo Perico sin inicializar sus atributos.
     * Llama al constructor vacío de la clase {@link P7_Ave}.
     */
    public P7_Perico() {
        super();
    }

    /**
     * Constructor que inicializa un objeto de tipo Perico con todos los atributos proporcionados,
     * incluyendo los atributos heredados de {@link P7_Ave} y los atributos específicos de un perico.
     * 
     * @param nombre           El nombre del perico.
     * @param edad             La edad del perico.
     * @param peso             El peso del perico.
     * @param color            El color del perico.
     * @param habitat          El hábitat del perico.
     * @param tipoPlumas       El tipo de plumas del perico.
     * @param envergadura      La envergadura del perico en metros.
     * @param vuela            Indica si el perico puede volar.
     * @param canto            El tipo de canto del perico.
     * @param tipoPico         El tipo de pico del perico.
     * @param colorPlumas      El color de las plumas del perico.
     * @param capacidadHablar  La capacidad del perico para hablar, medida en número de palabras.
     * @param numeroCanciones  El número de canciones que puede cantar el perico.
     * @param mascotaDomestica Indica si el perico es una mascota doméstica.
     * @param tipoDieta        El tipo de dieta del perico.
     */
    public P7_Perico(String nombre, int edad, double peso, String color, String habitat, String tipoPlumas, double envergadura, boolean vuela, String canto, String tipoPico,
                     String colorPlumas, int capacidadHablar, int numeroCanciones, boolean mascotaDomestica, String tipoDieta) {
        super(nombre, edad, peso, color, habitat, tipoPlumas, envergadura, vuela, canto, tipoPico);
        this.colorPlumas = colorPlumas;
        this.capacidadHablar = capacidadHablar;
        this.numeroCanciones = numeroCanciones;
        this.mascotaDomestica = mascotaDomestica;
        this.tipoDieta = tipoDieta;
    }

    /**
     * Obtiene el color de las plumas del perico.
     * 
     * @return El color de las plumas.
     */
    public String getColorPlumas() {
        return colorPlumas;
    }

    /**
     * Establece el color de las plumas del perico.
     * 
     * @param colorPlumas El nuevo color de las plumas.
     */
    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    /**
     * Obtiene la capacidad del perico para hablar.
     * 
     * @return El número de palabras que el perico puede hablar.
     */
    public int getCapacidadHablar() {
        return capacidadHablar;
    }

    /**
     * Establece la capacidad del perico para hablar.
     * 
     * @param capacidadHablar El número de palabras que el perico puede hablar.
     */
    public void setCapacidadHablar(int capacidadHablar) {
        this.capacidadHablar = capacidadHablar;
    }

    /**
     * Obtiene el número de canciones que el perico puede cantar.
     * 
     * @return El número de canciones.
     */
    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    /**
     * Establece el número de canciones que el perico puede cantar.
     * 
     * @param numeroCanciones El nuevo número de canciones.
     */
    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }

    /**
     * Indica si el perico es una mascota doméstica.
     * 
     * @return {@code true} si el perico es una mascota doméstica, {@code false} en caso contrario.
     */
    public boolean isMascotaDomestica() {
        return mascotaDomestica;
    }

    /**
     * Establece si el perico es una mascota doméstica.
     * 
     * @param mascotaDomestica {@code true} para hacer que el perico sea una mascota doméstica, {@code false} en caso contrario.
     */
    public void setMascotaDomestica(boolean mascotaDomestica) {
        this.mascotaDomestica = mascotaDomestica;
    }

    /**
     * Obtiene el tipo de dieta del perico.
     * 
     * @return El tipo de dieta.
     */
    public String getTipoDieta() {
        return tipoDieta;
    }

    /**
     * Establece el tipo de dieta del perico.
     * 
     * @param tipoDieta El nuevo tipo de dieta.
     */
    public void setTipoDieta(String tipoDieta) {
        this.tipoDieta = tipoDieta;
    }

    /**
     * Método que hace que el perico hable si tiene la capacidad para hacerlo.
     */
    public void hablar() {
        if (capacidadHablar > 0) {
            System.out.println("El perico está diciendo palabras.");
        } else {
            System.out.println("Este perico no sabe hablar.");
        }
    }

    /**
     * Método que hace que el perico cante un número de canciones basado en su capacidad.
     */
    public void cantar() {
        System.out.println("El perico está cantando " + numeroCanciones + " canciones diferentes.");
    }

    /**
     * Método que hace que el perico vuele si tiene la capacidad de volar.
     */
    @Override
    public void volar() {
        if (isVuela()) {
            System.out.println("El perico está volando alrededor.");
        } else {
            System.out.println("Este perico no puede volar.");
        }
    }

    /**
     * Método que hace que el perico coma semillas u otros alimentos de acuerdo a su dieta.
     */
    public void comerSemillas() {
        System.out.println("El perico está comiendo " + tipoDieta + ".");
    }

    /**
     * Método que hace que el perico juegue si es una mascota doméstica.
     */
    public void jugar() {
        if (mascotaDomestica) {
            System.out.println("El perico está jugando con su dueño.");
        } else {
            System.out.println("Este perico no está domesticado.");
        }
    }
}
