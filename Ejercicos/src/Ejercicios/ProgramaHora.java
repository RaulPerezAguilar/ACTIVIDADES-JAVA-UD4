package Ejercicios;

import java.util.Scanner;

public class ProgramaHora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar hora, minuto y segundo al usuario
        System.out.println("Introduce la hora (0-23):");
        int hora = scanner.nextInt();
        System.out.println("Introduce los minutos (0-59):");
        int minuto = scanner.nextInt();
        System.out.println("Introduce los segundos (0-59):");
        int segundo = scanner.nextInt();

        // Crear objeto Hora con los valores introducidos
        Hora horaInicial = new Hora(hora, minuto, segundo);

        // Solicitar la cantidad de segundos a avanzar
        System.out.println("Introduce la cantidad de segundos a avanzar:");
        int nSegundos = scanner.nextInt();

        // Mostrar la hora inicial
        System.out.println("Hora inicial: " + horaInicial);

        // Mostrar las siguientes n horas
        System.out.println("Las siguientes " + nSegundos + " horas son:");
        for (int i = 0; i < nSegundos; i++) {
            horaInicial.avanzarSegundo();
            System.out.println(horaInicial);
        }

        scanner.close();
    }
}
