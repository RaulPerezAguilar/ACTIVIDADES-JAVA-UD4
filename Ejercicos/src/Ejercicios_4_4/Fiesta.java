package Ejercicios_4_4;

import java.util.Scanner;

public class Fiesta {
    public static void main(String[] args) {
        // **Parte 1: Hora**
        Scanner scanner = new Scanner(System.in);

        // Leer hora inicial
        System.out.println("Introduce la hora (HH MM SS):");
        int hora = scanner.nextInt();
        int minuto = scanner.nextInt();
        int segundo = scanner.nextInt();
        Hora tiempo = new Hora(hora, minuto, segundo);

        // Leer cantidad de segundos
        System.out.println("Introduce la cantidad de segundos:");
        int n = scanner.nextInt();

        // Mostrar hora inicial y las n siguientes
        System.out.println("Hora inicial: " + tiempo);
        for (int i = 1; i <= n; i++) {
            tiempo.incrementarSegundo();
            System.out.println("Siguiente hora (" + i + "): " + tiempo);
        }

        // **Parte 2: Persona**
        // Crear personas usando diferentes constructores
        Persona pepe = new Persona();
        Persona paco = new Persona();
        System.out.println("Pepe: Nombre=" + pepe.getNombre() + ", Edad=" + pepe.getEdad() + ", Estatura=" + pepe.getEstatura());
        System.out.println("Paco: Nombre=" + paco.getNombre() + ", Edad=" + paco.getEdad() + ", Estatura=" + paco.getEstatura());

        Persona ana = new Persona("Ana", 25, 1.65, "García");
        System.out.println("Ana: Nombre=" + ana.getNombre() + ", Edad=" + ana.getEdad() + ", Estatura=" + ana.getEstatura());

        // Crear persona concatenando el apellido
        Persona luis = new Persona("Luis", 30, 1.80, "Martínez", true);
        System.out.println("Luis: Nombre completo=" + luis.getNombre());
    }
}
