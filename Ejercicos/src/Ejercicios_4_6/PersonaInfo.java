package Ejercicios_4_6;

public class PersonaInfo {
    private String nombre;
    private int edad;
    private double estatura;
    private Genero genero; // Atributo para el género

    // Constructor con todos los parámetros
    public PersonaInfo(String nombre, int edad, double estatura, Genero genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.genero = genero;
    }

    // Constructor por defecto
    public PersonaInfo() {
        this("Anónimo", 18, 1.70, Genero.HOMBRE); // Por defecto, género es HOMBRE
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    // Método para mostrar información de la persona
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Género: " + genero);
    }
}

