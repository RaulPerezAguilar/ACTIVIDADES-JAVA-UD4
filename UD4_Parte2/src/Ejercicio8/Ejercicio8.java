// CalculadoraBasica.java - Definimos la clase en un paquete
package Ejercicio8;

public class Ejercicio8 {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}

// Paso 1: Compilar la clase desde la terminal
// javac -d . CalculadoraBasica.java

// Paso 2: Crear el archivo JAR
// jar cvf CalculadoraBasica.jar -C . mi/libreria/CalculadoraBasica.class

// Paso 3: Crear otro archivo para usar la librería
// MiPrograma.java - Programa que usa la calculadora
import mi.libreria.CalculadoraBasica;

public class MiPrograma {
    public static void main(String[] args) {
        int suma = Ejercicio8.sumar(5, 3);
        int resta = Ejercicio8.restar(10, 4);
        int multiplicacion = Ejercicio8.multiplicar(6, 7);
        double division = Ejercicio8.dividir(20, 5);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}

// Paso 4: Compilar MiPrograma con el JAR
// javac -cp CalculadoraBasica.jar MiPrograma.java

// Paso 5: Ejecutar el programa usando el JAR
// java -cp .:CalculadoraBasica.jar MiPrograma
