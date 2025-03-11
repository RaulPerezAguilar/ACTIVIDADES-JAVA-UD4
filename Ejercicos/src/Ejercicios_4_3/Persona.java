package Ejercicios_4_3;

public class Persona {
    private String nombre;
    private int edad;
    private double estatura;

    // Constructor con todos los parámetros
    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    // Constructor por defecto
    public Persona() {
        this("anónimo", 18, 1.70); // Persona estándar
    }
}

    // Métodos
