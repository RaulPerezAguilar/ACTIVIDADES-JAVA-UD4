package Ejercicios;

public class Persona {
    private String nombre;
    private int edad;
    private double estatura;
    private String apellido;
    private String nombrecompleto;

    // Constructor principal
    public Persona(String nombre, int edad, double estatura, String apellido) {
        setNombre(nombre);
        setEdad(edad);
        setEstatura(estatura);
        setApellido(apellido);
        this.nombrecompleto = nombre + " " + apellido;
    }

    // Constructor por defecto
    public Persona() {
        this("Anonimo", 18, 1.70, "Anonimo");
    }

    // Constructor con solo el nombre
    public Persona(String nombre) {
        this(nombre, 18, 1.70, "Anonimo");
    }

    // Nuevo constructor con concatenación explícita
    public Persona(String nombre, int edad, double estatura, String apellido, boolean concatApellido) {
        this(nombre, edad, estatura, apellido);
        if (concatApellido) {
            this.nombrecompleto = nombre + " " + apellido;
        }
    }

    // Métodos getter y setter con validaciones
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

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    // Métodos de la clase
    void saludar() {
        System.out.println("Hola, soy " + nombrecompleto);
    }

    void cumplirAyos() {
        setEdad(this.edad + 1); // Valida la nueva edad
    }

    void crecer(double incremento) {
        setEstatura(this.estatura + incremento); // Valida la nueva estatura
    }
}
