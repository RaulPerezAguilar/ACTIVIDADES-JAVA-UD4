package Ejercicios_4_4;

public class Persona {
    private String nombre;
    private int edad;
    private double estatura;
    private String apellido;

    // Constructor principal con todos los parámetros
    public Persona(String nombre, int edad, double estatura, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.apellido = apellido;
    }

    // Constructor con sólo el nombre
    public Persona(String nombre) {
        this(nombre, 18, 1.70, "Anónimo");
    }

    // Constructor por defecto
    public Persona() {
        this("Anónimo", 18, 1.70, "Anónimo");
    }

    // Constructor que concatena el apellido al nombre
    public Persona(String nombre, int edad, double estatura, String apellido, boolean concatApellido) {
        this(nombre, edad, estatura, apellido);
        if (concatApellido) {
            this.nombre += " " + apellido;
        }
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 150) {
            throw new IllegalArgumentException("La edad debe estar entre 0 y 150.");
        }
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        if (estatura < 0.5 || estatura > 2.5) {
            throw new IllegalArgumentException("La estatura debe estar entre 0.5 y 2.5 metros.");
        }
        this.estatura = estatura;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
