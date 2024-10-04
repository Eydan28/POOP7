/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_7_poo;

/**
 * Clase que representa a un Dálmata, heredando de la clase {P7_Perro}.
 * Incluye atributos y comportamientos específicos de los perros Dálmatas,
 * tales como el número de manchas, si es un perro de bombero, su nivel de energía,
 * y si es amigable con los niños.
 * 
 * 
 */
public class P7_Dalmata extends P7_Perro {
    // Atributos
    private int numeroManchas;
    private boolean esPerroDeBombero;
    private boolean esActivo;
    private int nivelEnergia;
    private boolean amigableConNiños;

    /**
     * Constructor vacío que crea un objeto de tipo Dálmata sin inicializar sus atributos.
     * Llama al constructor de la clase {@link P7_Perro}.
     */
    public P7_Dalmata() {
        super();
    }

    /**
     * Constructor que inicializa un objeto de tipo Dálmata con los atributos proporcionados, 
     * incluyendo los atributos heredados de la clase {@link P7_Perro}.
     * 
     * @param nombre            El nombre del dálmata.
     * @param edad              La edad del dálmata en años.
     * @param peso              El peso del dálmata en kilogramos.
     * @param color             El color del dálmata.
     * @param habitat           El hábitat donde vive el dálmata.
     * @param raza              La raza del perro, en este caso "Dálmata".
     * @param entrenado         Indica si el perro está entrenado o no.
     * @param tamaño            El tamaño del perro (pequeño, mediano, grande).
     * @param colorPelaje       El color del pelaje del perro.
     * @param amigable          Indica si el perro es amigable.
     * @param numeroManchas     El número de manchas que tiene el dálmata.
     * @param esPerroDeBombero  Indica si el dálmata es un perro de bombero.
     * @param esActivo          Indica si el dálmata es activo.
     * @param nivelEnergia      El nivel de energía del dálmata en una escala de 1 a 10.
     * @param amigableConNiños  Indica si el dálmata es amigable con los niños.
     */
    public P7_Dalmata(String nombre, int edad, double peso, String color, String habitat, String raza, boolean entrenado, String tamaño, String colorPelaje, boolean amigable,
                      int numeroManchas, boolean esPerroDeBombero, boolean esActivo, int nivelEnergia, boolean amigableConNiños) {
        super(nombre, edad, peso, color, habitat, raza, entrenado, tamaño, colorPelaje, amigable);
        this.numeroManchas = numeroManchas;
        this.esPerroDeBombero = esPerroDeBombero;
        this.esActivo = esActivo;
        this.nivelEnergia = nivelEnergia;
        this.amigableConNiños = amigableConNiños;
    }

    /**
     * Obtiene el número de manchas del dálmata.
     * 
     * @return El número de manchas del dálmata.
     */
    public int getNumeroManchas() {
        return numeroManchas;
    }

    /**
     * Establece el número de manchas del dálmata.
     * 
     * @param numeroManchas El nuevo número de manchas del dálmata.
     */
    public void setNumeroManchas(int numeroManchas) {
        this.numeroManchas = numeroManchas;
    }

    /**
     * Indica si el dálmata es un perro de bombero.
     * 
     * @return {@code true} si el dálmata es un perro de bombero, {@code false} en caso contrario.
     */
    public boolean isEsPerroDeBombero() {
        return esPerroDeBombero;
    }

    /**
     * Establece si el dálmata es un perro de bombero.
     * 
     * @param esPerroDeBombero {@code true} si el dálmata es un perro de bombero, {@code false} en caso contrario.
     */
    public void setEsPerroDeBombero(boolean esPerroDeBombero) {
        this.esPerroDeBombero = esPerroDeBombero;
    }

    /**
     * Indica si el dálmata es activo.
     * 
     * @return {@code true} si el dálmata es activo, {@code false} en caso contrario.
     */
    public boolean isEsActivo() {
        return esActivo;
    }

    /**
     * Establece si el dálmata es activo.
     * 
     * @param esActivo {@code true} si el dálmata es activo, {@code false} en caso contrario.
     */
    public void setEsActivo(boolean esActivo) {
        this.esActivo = esActivo;
    }

    /**
     * Obtiene el nivel de energía del dálmata.
     * 
     * @return El nivel de energía del dálmata en una escala de 1 a 10.
     */
    public int getNivelEnergia() {
        return nivelEnergia;
    }

    /**
     * Establece el nivel de energía del dálmata.
     * 
     * @param nivelEnergia El nuevo nivel de energía del dálmata.
     */
    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    /**
     * Indica si el dálmata es amigable con los niños.
     * 
     * @return {@code true} si el dálmata es amigable con los niños, {@code false} en caso contrario.
     */
    public boolean isAmigableConNiños() {
        return amigableConNiños;
    }

    /**
     * Establece si el dálmata es amigable con los niños.
     * 
     * @param amigableConNiños {@code true} si el dálmata es amigable con los niños, {@code false} en caso contrario.
     */
    public void setAmigableConNiños(boolean amigableConNiños) {
        this.amigableConNiños = amigableConNiños;
    }

    /**
     * Método que simula que el dálmata está corriendo rápidamente.
     * Sobrescribe el método {@link P7_Perro#correr()}.
     */
    @Override
    public void correr() {
        System.out.println("El dálmata está corriendo rápidamente.");
    }

    /**
     * Método que simula que el dálmata está ladrando para alertar.
     * Sobrescribe el método {@link P7_Perro#ladrar()}.
     */
    @Override
    public void ladrar() {
        System.out.println("El dálmata está ladrando para alertar.");
    }

    /**
     * Método que simula que el dálmata está jugando con los niños.
     * Verifica si el dálmata es amigable con los niños antes de realizar la acción.
     */
    public void jugarConNiños() {
        if (amigableConNiños) {
            System.out.println("El dálmata está jugando con los niños.");
        } else {
            System.out.println("Este dálmata no es amigable con los niños.");
        }
    }

    /**
     * Método que simula que el dálmata está trabajando con los bomberos.
     * Verifica si el dálmata es un perro de bombero antes de realizar la acción.
     */
    public void trabajarConBomberos() {
        if (esPerroDeBombero) {
            System.out.println("El dálmata está trabajando con los bomberos.");
        } else {
            System.out.println("Este dálmata no es un perro de bombero.");
        }
    }

    /**
     * Método que simula que el dálmata está descansando.
     * El dálmata descansará solo si su nivel de energía es bajo.
     */
    public void descansar() {
        if (nivelEnergia > 5) {
            System.out.println("El dálmata tiene mucha energía y no quiere descansar.");
        } else {
            System.out.println("El dálmata está descansando.");
        }
    }
}
