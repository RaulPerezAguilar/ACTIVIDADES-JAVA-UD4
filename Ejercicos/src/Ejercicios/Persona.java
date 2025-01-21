package Ejercicios;

public class Persona {
    // Atributos privados (encapsulación)
    private String nombre;
    private int edad;
    private double estatura;
    private String apellido;

    // Constructor principal
    public Persona(String nombre, int edad, double estatura, String apellido) {
        setNombre(nombre);
        setEdad(edad);
        setEstatura(estatura);
        setApellido(apellido);
    }

    // Constructor por defecto
    public Persona() {
        this("Anonimo", 18, 1.70, "Anonimo");
    }

    // Constructor solo con nombre
    public Persona(String nombre) {
        this(nombre, 18, 1.70, "Anonimo");
    }

    // Métodos getter y setter con validaciones

    // Getter y setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            this.nombre = "Desconocido";
        } else {
            this.nombre = nombre;
        }
    }

    // Getter y setter para edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 150) {
            System.out.println("Edad no válida. Asignando edad por defecto: 18 años.");
            this.edad = 18;
        } else {
            this.edad = edad;
        }
    }

    // Getter y setter para estatura
    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        if (estatura < 0.5 || estatura > 2.5) {
            System.out.println("Estatura no válida. Asignando estatura por defecto: 1.70 metros.");
            this.estatura = 1.70;
        } else {
            this.estatura = estatura;
        }
    }

    // Getter y setter para apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido == null || apellido.isEmpty()) {
            this.apellido = "Desconocido";
        } else {
            this.apellido = apellido;
        }
    }

    // Métodos de la clase
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " " + apellido);
    }

    public void cumplirAyos() {
        setEdad(this.edad + 1); // Incrementa edad con validación
    }

    public void crecer(double incremento) {
        setEstatura(this.estatura + incremento); // Ajusta estatura con validación
    }
}

