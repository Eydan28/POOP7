/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_7_poo;

/**
 * Clase que representa a una paloma, heredando de la clase {P7_Ave}.
 * Además de los atributos y métodos de un ave, una paloma puede ser mensajera, volar a gran velocidad,
 * y ser un símbolo de paz, entre otras características específicas.
 * 
 * 
 */
public class P7_Paloma extends P7_Ave {
    private boolean mensajera;
    private double velocidadVuelo;
    private String colorPlumaje;
    private int distanciaVuelo;
    private boolean simboloPaz;

    /**
     * Constructor vacío que crea un objeto de tipo Paloma sin inicializar sus atributos.
     * Llama al constructor vacío de la clase {@link P7_Ave}.
     */
    public P7_Paloma() {
        super();
    }

    /**
     * Constructor que inicializa un objeto de tipo Paloma con todos los atributos proporcionados,
     * incluyendo los atributos heredados de {@link P7_Ave} y los atributos específicos de una paloma.
     * 
     * @param nombre        El nombre de la paloma.
     * @param edad          La edad de la paloma.
     * @param peso          El peso de la paloma.
     * @param color         El color de la paloma.
     * @param habitat       El hábitat de la paloma.
     * @param tipoPlumas    El tipo de plumas de la paloma.
     * @param envergadura   La envergadura de las alas de la paloma.
     * @param vuela         Indica si la paloma puede volar.
     * @param canto         El tipo de canto de la paloma.
     * @param tipoPico      El tipo de pico de la paloma.
     * @param mensajera     Indica si la paloma es mensajera.
     * @param velocidadVuelo La velocidad de vuelo de la paloma en km/h.
     * @param colorPlumaje  El color del plumaje de la paloma.
     * @param distanciaVuelo La distancia máxima que puede volar la paloma sin detenerse.
     * @param simboloPaz    Indica si la paloma es considerada un símbolo de paz.
     */
    public P7_Paloma(String nombre, int edad, double peso, String color, String habitat, String tipoPlumas, double envergadura, boolean vuela, String canto, String tipoPico,
                     boolean mensajera, double velocidadVuelo, String colorPlumaje, int distanciaVuelo, boolean simboloPaz) {
        super(nombre, edad, peso, color, habitat, tipoPlumas, envergadura, vuela, canto, tipoPico);
        this.mensajera = mensajera;
        this.velocidadVuelo = velocidadVuelo;
        this.colorPlumaje = colorPlumaje;
        this.distanciaVuelo = distanciaVuelo;
        this.simboloPaz = simboloPaz;
    }

    /**
     * Indica si la paloma es mensajera.
     * 
     * @return {@code true} si la paloma es mensajera, {@code false} en caso contrario.
     */
    public boolean isMensajera() {
        return mensajera;
    }

    /**
     * Establece si la paloma es mensajera.
     * 
     * @param mensajera {@code true} para hacer que la paloma sea mensajera, {@code false} en caso contrario.
     */
    public void setMensajera(boolean mensajera) {
        this.mensajera = mensajera;
    }

    /**
     * Obtiene la velocidad de vuelo de la paloma.
     * 
     * @return La velocidad de vuelo en km/h.
     */
    public double getVelocidadVuelo() {
        return velocidadVuelo;
    }

    /**
     * Establece la velocidad de vuelo de la paloma.
     * 
     * @param velocidadVuelo La nueva velocidad de vuelo en km/h.
     */
    public void setVelocidadVuelo(double velocidadVuelo) {
        this.velocidadVuelo = velocidadVuelo;
    }

    /**
     * Obtiene el color del plumaje de la paloma.
     * 
     * @return El color del plumaje.
     */
    public String getColorPlumaje() {
        return colorPlumaje;
    }

    /**
     * Establece el color del plumaje de la paloma.
     * 
     * @param colorPlumaje El nuevo color del plumaje.
     */
    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    /**
     * Obtiene la distancia máxima que la paloma puede volar sin detenerse.
     * 
     * @return La distancia en kilómetros.
     */
    public int getDistanciaVuelo() {
        return distanciaVuelo;
    }

    /**
     * Establece la distancia máxima que la paloma puede volar sin detenerse.
     * 
     * @param distanciaVuelo La nueva distancia en kilómetros.
     */
    public void setDistanciaVuelo(int distanciaVuelo) {
        this.distanciaVuelo = distanciaVuelo;
    }

    /**
     * Indica si la paloma es considerada un símbolo de paz.
     * 
     * @return {@code true} si la paloma es símbolo de paz, {@code false} en caso contrario.
     */
    public boolean isSimboloPaz() {
        return simboloPaz;
    }

    /**
     * Establece si la paloma es considerada un símbolo de paz.
     * 
     * @param simboloPaz {@code true} para hacer que la paloma sea un símbolo de paz, {@code false} en caso contrario.
     */
    public void setSimboloPaz(boolean simboloPaz) {
        this.simboloPaz = simboloPaz;
    }

    /**
     * Método que permite que la paloma entregue un mensaje si es mensajera.
     */
    public void enviarMensaje() {
        if (mensajera) {
            System.out.println("La paloma está entregando un mensaje.");
        } else {
            System.out.println("Esta paloma no es mensajera.");
        }
    }

    /**
     * Método que hace que la paloma vuele a su velocidad máxima.
     */
    public void volarRapido() {
        System.out.println("La paloma está volando a una velocidad de " + velocidadVuelo + " km/h.");
    }

    /**
     * Método que hace que la paloma vuele largas distancias.
     */
    public void volarLargaDistancia() {
        System.out.println("La paloma puede volar " + distanciaVuelo + " kilómetros sin detenerse.");
    }
}
