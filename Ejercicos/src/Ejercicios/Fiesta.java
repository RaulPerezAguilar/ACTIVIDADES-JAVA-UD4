package Ejercicios;

public class Fiesta {

    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona raul = new Persona("Raul", 18, 1.87, "Perez");

        // Intentar modificar el atributo "nombre" directamente
        System.out.println("Nombre antes de cambiarlo: " + raul.getNombre());
        
        // Modificar nombre usando el setter público
        raul.setNombre("Raulito");
        System.out.println("Nombre después de cambiarlo: " + raul.getNombre());

        // Intentar modificar otros atributos directamente (esto dará error)
        // raul.edad = 25; // Esto no es posible porque "edad" es private
        // raul.estatura = 1.90; // Esto no es posible porque "estatura" es private
    }
}

