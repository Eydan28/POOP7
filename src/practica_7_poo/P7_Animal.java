/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_7_poo;

/**
 * Clase base que representa a un animal genérico con atributos y comportamientos comunes.
 * Proporciona métodos para manipular los datos del animal como nombre, edad, peso, color y hábitat.
 * También ofrece métodos de comportamiento como comer, dormir, moverse, emitir sonidos y respirar.
 * 
 * 
 */
public class P7_Animal {
    // Atributos
    private String nombre;
    private int edad;
    private double peso;
    private String color;
    private String habitat;

    /**
     * Constructor vacío que crea un objeto de tipo Animal sin inicializar sus atributos.
     */
    public P7_Animal() {}

    /**
     * Constructor que inicializa un objeto de tipo Animal con los atributos proporcionados.
     * 
     * @param nombre  El nombre del animal.
     * @param edad    La edad del animal en años.
     * @param peso    El peso del animal en kilogramos.
     * @param color   El color del pelaje o piel del animal.
     * @param habitat El tipo de hábitat en el que vive el animal.
     */
    public P7_Animal(String nombre, int edad, double peso, String color, String habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
        this.habitat = habitat;
    }

    /**
     * Obtiene el nombre del animal.
     * 
     * @return El nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del animal.
     * 
     * @param nombre El nuevo nombre del animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del animal.
     * 
     * @return La edad del animal en años.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del animal.
     * 
     * @param edad La nueva edad del animal en años.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el peso del animal.
     * 
     * @return El peso del animal en kilogramos.
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Establece el peso del animal.
     * 
     * @param peso El nuevo peso del animal en kilogramos.
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Obtiene el color del animal.
     * 
     * @return El color del pelaje o piel del animal.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del animal.
     * 
     * @param color El nuevo color del pelaje o piel del animal.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene el hábitat del animal.
     * 
     * @return El hábitat en el que vive el animal.
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * Establece el hábitat del animal.
     * 
     * @param habitat El nuevo hábitat del animal.
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    /**
     * Método que simula que el animal está comiendo.
     */
    public void comer() {
        System.out.println("El animal está comiendo.");
    }

    /**
     * Método que simula que el animal está durmiendo.
     */
    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }

    /**
     * Método que simula que el animal está moviéndose.
     */
    public void moverse() {
        System.out.println("El animal está moviéndose.");
    }

    /**
     * Método que simula que el animal está emitiendo un sonido.
     */
    public void emitirSonido() {
        System.out.println("El animal está emitiendo un sonido.");
    }

    /**
     * Método que simula que el animal está respirando.
     */
    public void respirar() {
        System.out.println("El animal está respirando.");
    }
}

