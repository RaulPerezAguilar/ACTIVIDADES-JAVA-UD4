package Ejercicios_4_2;

public class Persona {
    // Atributos privados
    private String nombre;
    private int edad;
    private double estatura;

    // Constructor principal
    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    // Constructor por defecto
    public Persona() {
        this("Anonimo", 18, 1.70);
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
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        if (estatura >= 0.5 && estatura <= 2.5) {
            this.estatura = estatura;
        } else {
            System.out.println("La estatura debe estar entre 0.5 y 2.5 metros.");
        }
    }

    // Método cumplirAños
    public void cumplirAños() {
        this.edad++; // Incrementa en 1 la edad
    }

    // Método crecer
    public void crecer(double incremento) {
        if (incremento > 0) {
            this.estatura += incremento; // Incrementa la estatura
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                '}';
    }
}
