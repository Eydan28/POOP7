/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_7_poo;

/**
 *
 * @author Eydan, Alan y Luis
 */
public class Practica_7_POO {

    /**
     * El main principal donde se usan todas las clases creadas
     * 
     * @param args todos los argumentos de cada línea del codigo
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creacion e impresion de objetos
        P7_Empleado empleado1 = new P7_Empleado();
        P7_Empleado empleado2 = new P7_Empleado("Alan", 58241, 30000f);
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        
        empleado2.aumentarSueldo(10);
        System.out.println(empleado2);
        
        // Inflar al empleado1
        
        empleado1.setNombre("Emiliano");
        empleado1.setNumEmpleado(543);
        empleado1.setSueldo(1023.43f);
        
        System.out.println(empleado1);
        
        System.out.println("########## Gerente ###########");
        
        P7_Gerente gerente1 = new P7_Gerente("Oscar", 1000, 2345.54f, 34455.34f);
        System.out.println(gerente1);
        
        P7_Gerente gerente2 = new P7_Gerente();
        System.out.println(gerente2);
        
        // Agregando solo presupuesto
        gerente2.setPresupuesto(1000f);
        System.out.println(gerente2);
        
        // Agregando atributos heredados
        gerente2.setNombre("Alan");
        System.out.println(gerente2);
        
        // Se guardo correctamente el nombre
        System.out.println(gerente2.getNombre());
        
        System.out.println("");
        System.out.println("######### Animales #########");
        
        // Creando un Animal
        P7_Animal animal = new P7_Animal("Elefante", 10, 500.5, "Gris", "Sabana");
        
        // Imprimiendo atributos del animal
        System.out.println("Atributos del Animal:");
        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Edad: " + animal.getEdad());
        System.out.println("Peso: " + animal.getPeso());
        System.out.println("Color: " + animal.getColor());
        System.out.println("Habitat: " + animal.getHabitat());
        
        // Imprimiendo métodos del animal
        System.out.println("Metodos del Animal:");
        animal.comer();
        animal.dormir();
        animal.moverse();
        animal.emitirSonido();
        animal.respirar();
        
        System.out.println("");
        System.out.println("######### Perro #########");
        
        // Creando un perro
        P7_Perro perro = new P7_Perro("Max", 3, 12.5, "Marron", "Casa", "Labrador", true, "Mediano", "Negro", true);
        
        // Imprimiendo atributos del perro (incluyendo los heredados de Animal)
        System.out.println("Atributos del Perro:");
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Edad: " + perro.getEdad());
        System.out.println("Peso: " + perro.getPeso());
        System.out.println("Color: " + perro.getColor());
        System.out.println("Habitat: " + perro.getHabitat());
        System.out.println("Raza: " + perro.getRaza());
        System.out.println("Entrenado: " + perro.isEntrenado());
        System.out.println("Tamano: " + perro.getTamaño());
        System.out.println("Color Pelaje: " + perro.getColorPelaje());
        System.out.println("Amigable: " + perro.isAmigable());
        
        // Imprimiendo métodos del perro
        System.out.println("\nMetodos del Perro:");
        perro.ladrar();
        perro.correr();
        perro.jugar();
        perro.obedecer();
        perro.cavar();
        
        // Métodos heredados de Animal
        perro.comer();
        perro.dormir();
        perro.moverse();
        perro.emitirSonido();
        perro.respirar();
        
        System.out.println("");
        System.out.println("######### Pastor Aleman #########");

        // Creando un Pastor Aleman
        P7_PastorAleman pastorAleman = new P7_PastorAleman("Rex", 5, 30.0, "Negro y Marron", "Campo", "Pastor Aleman", true, "Grande", "Negro y Marron", true, 
                                                            true, false, 100, 60, true);
        
        // Imprimiendo atributos del Pastor Aleman (incluyendo los heredados de Perro y Animal)
        System.out.println("Atributos del Pastor Aleman:");
        System.out.println("Nombre: " + pastorAleman.getNombre());
        System.out.println("Edad: " + pastorAleman.getEdad());
        System.out.println("Peso: " + pastorAleman.getPeso());
        System.out.println("Color: " + pastorAleman.getColor());
        System.out.println("Habitat: " + pastorAleman.getHabitat());
        System.out.println("Raza: " + pastorAleman.getRaza());
        System.out.println("Entrenado: " + pastorAleman.isEntrenado());
        System.out.println("Tamaño: " + pastorAleman.getTamaño());
        System.out.println("Color Pelaje: " + pastorAleman.getColorPelaje());
        System.out.println("Amigable: " + pastorAleman.isAmigable());
        System.out.println("Perro Policia: " + pastorAleman.isPerroPolicia());
        System.out.println("Perro Guia: " + pastorAleman.isPerroGuia());
        System.out.println("Nivel de Inteligencia: " + pastorAleman.getNivelInteligencia());
        System.out.println("Velocidad Maxima: " + pastorAleman.getVelocidadMaxima());
        System.out.println("Protector: " + pastorAleman.isProtector());
        
        // Imprimiendo metodos del Pastor Aleman (incluyendo los heredados de Perro y Animal)
        System.out.println("\nMetodos del Pastor Aleman:");
        pastorAleman.patrullar();
        pastorAleman.guiar();
        pastorAleman.proteger();
        pastorAleman.correr();
        pastorAleman.resolverProblemas();
        
        // Metodos heredados de Perro y Animal
        pastorAleman.comer();
        pastorAleman.dormir();
        pastorAleman.moverse();
        pastorAleman.emitirSonido();
        pastorAleman.respirar();
        
        System.out.println("");
        System.out.println("######### Dalmata #########");
        // Creando un Pastor Aleman
        P7_Dalmata dalmata = new P7_Dalmata("Manchas", 4, 25.0, "Manchas blancas con negra", "Casa lujosa", "Dalmata", true, "Grande", "Blanco", true, 
                                                            13, false, true, 90, true);
               
        // Imprimiendo atributos del Dalmata (incluyendo los heredados de Perro y Animal)
        System.out.println("Atributos del Dalmata:");
        System.out.println("Nombre: " + dalmata.getNombre());
        System.out.println("Edad: " + dalmata.getEdad());
        System.out.println("Peso: " + dalmata.getPeso());
        System.out.println("Color: " + dalmata.getColor());
        System.out.println("Habitat: " + dalmata.getHabitat());
        System.out.println("Raza: " + dalmata.getRaza());
        System.out.println("Entrenado: " + dalmata.isEntrenado());
        System.out.println("Tamaño: " + dalmata.getTamaño());
        System.out.println("Color Pelaje: " + dalmata.getColorPelaje());
        System.out.println("Amigable: " + dalmata.isAmigable());
        System.out.println("Numero de Manchas: " + dalmata.getNumeroManchas());
        System.out.println("Es Perro de Bombero: " + dalmata.isEsPerroDeBombero());
        System.out.println("Es Activo: " + dalmata.isEsActivo());
        System.out.println("Nivel de Energia: " + dalmata.getNivelEnergia());
        System.out.println("Amigable con Ninos: " + dalmata.isAmigableConNiños());

        // Imprimiendo metodos del Dalmata
        System.out.println("\nMetodos del Dalmata:");
        dalmata.correr();
        dalmata.ladrar();
        dalmata.jugarConNiños();
        dalmata.trabajarConBomberos();
        dalmata.descansar();

        // Metodos heredados de Perro y Animal
        dalmata.comer();
        dalmata.dormir();
        dalmata.moverse();
        dalmata.emitirSonido();
        dalmata.respirar();
        
        System.out.println("");
        System.out.println("\n######### Aves #########");
        // Creando Ave
        P7_Ave ave = new P7_Ave("Aguila", 3, 4.5, "Marron", "Montañas", "Largas", 2.5, true, "Agudo", "Ganchudo");
        System.out.println("Atributos del ave:");
        System.out.println("Nombre: " + ave.getNombre());
        System.out.println("Edad: " + ave.getEdad());
        System.out.println("Peso: " + ave.getPeso());
        System.out.println("Color: " + ave.getColor());
        System.out.println("Habitat: " + ave.getHabitat());
        System.out.println("Tipo de plumas: " + ave.getTipoPlumas());
        System.out.println("Envergadura: " + ave.getEnvergadura());
        System.out.println("Puede volar: " + (ave.isVuela() ? "Si" : "No"));
        System.out.println("Canto: " + ave.getCanto());
        System.out.println("Tipo de pico: " + ave.getTipoPico());
        System.out.println("\nMetodos del ave:");
        ave.comer();
        ave.dormir();
        ave.moverse();
        ave.emitirSonido();
        ave.volar();
        ave.piar();
        ave.limpiarPlumas();
        ave.construirNido();
        ave.migrar();
        
        System.out.println("");
        System.out.println("######### Perico #########");
    
        // Creando Perico
        P7_Perico perico = new P7_Perico("Loro", 2, 0.9, "Verde", "Selva", "Cortas", 0.3, true, "Agudo", "Corto", 
                                     "Verde brillante", 5, 3, true, "Semillas");

        // Imprimiendo los atributos heredados de la clase P7_Ave y los nuevos de P7_Perico
        System.out.println("Atributos del perico:");
        System.out.println("Nombre: " + perico.getNombre());
        System.out.println("Edad: " + perico.getEdad());
        System.out.println("Peso: " + perico.getPeso());
        System.out.println("Color: " + perico.getColor());
        System.out.println("Habitat: " + perico.getHabitat());
        System.out.println("Tipo de plumas: " + perico.getTipoPlumas());
        System.out.println("Envergadura: " + perico.getEnvergadura());
        System.out.println("Puede volar: " + (perico.isVuela() ? "Si" : "No"));
        System.out.println("Canto: " + perico.getCanto());
        System.out.println("Tipo de pico: " + perico.getTipoPico());
    
        System.out.println("Color de plumas: " + perico.getColorPlumas());
        System.out.println("Capacidad para hablar: " + perico.getCapacidadHablar());
        System.out.println("Numero de canciones: " + perico.getNumeroCanciones());
        System.out.println("Es mascota domestica: " + (perico.isMascotaDomestica() ? "Si" : "No"));
        System.out.println("Tipo de dieta: " + perico.getTipoDieta());

        // Imprimiendo los métodos heredados y nuevos de la clase P7_Perico
        System.out.println("\nMetodos del perico:");
        perico.comer();
        perico.dormir();
        perico.moverse();
        perico.emitirSonido();
        perico.volar(); // Sobreescrito en P7_Perico
        perico.hablar();
        perico.cantar();
        perico.comerSemillas();
        perico.jugar();
        
        System.out.println("");
        System.out.println("######### Paloma #########");
    
        // Creando Paloma
        P7_Paloma paloma = new P7_Paloma("Paloma Blanca", 2, 0.5, "Blanco", "Ciudad", "Suaves", 0.4, true, "Suave", "Pequeño", 
                                        true, 60.0, "Gris", 500, true);

        // Imprimiendo los atributos heredados de la clase P7_Ave y los nuevos de P7_Paloma
        System.out.println("Atributos de la paloma:");
        System.out.println("Nombre: " + paloma.getNombre());
        System.out.println("Edad: " + paloma.getEdad());
        System.out.println("Peso: " + paloma.getPeso());
        System.out.println("Color: " + paloma.getColor());
        System.out.println("Habitat: " + paloma.getHabitat());
        System.out.println("Tipo de plumas: " + paloma.getTipoPlumas());
        System.out.println("Envergadura: " + paloma.getEnvergadura());
        System.out.println("Puede volar: " + (paloma.isVuela() ? "Si" : "No"));
        System.out.println("Canto: " + paloma.getCanto());
        System.out.println("Tipo de pico: " + paloma.getTipoPico());

        System.out.println("Es mensajera: " + (paloma.isMensajera() ? "Si" : "No"));
        System.out.println("Velocidad de vuelo: " + paloma.getVelocidadVuelo() + " km/h");
        System.out.println("Color de plumaje: " + paloma.getColorPlumaje());
        System.out.println("Distancia de vuelo: " + paloma.getDistanciaVuelo() + " km");
        System.out.println("Es simbolo de paz: " + (paloma.isSimboloPaz() ? "Si" : "No"));

        // Imprimiendo los métodos heredados y nuevos de la clase P7_Paloma
        System.out.println("\nMetodos de la paloma:");
        paloma.comer();
        paloma.dormir();
        paloma.moverse();
        paloma.emitirSonido();
        paloma.volar();
        paloma.enviarMensaje();
        paloma.volarRapido();
        paloma.volarLargaDistancia();
        
    }
}
