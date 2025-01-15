package Ejercicios;

public class Fiesta {

    public static void main(String[] args) {
        // Crear objetos usando diferentes constructores
        Persona raul = new Persona("Raul", 18, 1.87, "Perez");
        Persona manoli = new Persona();
        Persona anonimo = new Persona("Anonimo");

        // Modificar atributos usando setters
        manoli.setNombre("Manoli La Panadera");
        manoli.setEdad(1755); // Valor no válido, aplicará validación
        manoli.setEstatura(0.65);

        // Acceder a atributos usando getters
        System.out.println("Nombre completo de Raul: " + raul.getNombrecompleto());
        System.out.println("Nombre completo de Manoli: " + manoli.getNombrecompleto());
        System.out.println("Nombre completo del anónimo: " + anonimo.getNombrecompleto());

        // Llamar al método saludar
        raul.saludar();
        manoli.saludar();
        anonimo.saludar();

        // Probar métodos con validaciones
        raul.cumplirAyos();
        System.out.println("Nueva edad de Raul: " + raul.getEdad());

        manoli.crecer(0.10);
        System.out.println("Nueva estatura de Manoli: " + manoli.getEstatura());
    }
}

