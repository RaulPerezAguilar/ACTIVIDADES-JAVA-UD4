package Ejercicio13;

//Clase final MatematicasUtil
public final class Ejercicio13 {
 // Constante PI
 public static final double PI = 3.14159;

 // Método para calcular el área de un círculo
 public static double calcularAreaCirculo(double radio) {
     if (radio < 0) {
         throw new IllegalArgumentException("El radio no puede ser negativo.");
     }
     return PI * Math.pow(radio, 2);
 }

 // Método para calcular el perímetro de un rectángulo
 public static double calcularPerimetroRectangulo(double largo, double ancho) {
     if (largo < 0 || ancho < 0) {
         throw new IllegalArgumentException("Las dimensiones no pueden ser negativas.");
     }
     return 2 * (largo + ancho);
 }

 // Método para determinar si un número es primo
 public static boolean esPrimo(int numero) {
     if (numero <= 1) {
         return false; // Los números menores o iguales a 1 no son primos
     }
     for (int i = 2; i <= Math.sqrt(numero); i++) {
         if (numero % i == 0) {
             return false; // Si el número es divisible, no es primo
         }
     }
     return true; // Si no es divisible por ninguno, es primo
 }

 // Método para calcular el factorial de un número
 public static long factorial(int n) {
     if (n < 0) {
         throw new IllegalArgumentException("El número no puede ser negativo.");
     }
     long resultado = 1;
     for (int i = 1; i <= n; i++) {
         resultado *= i;
     }
     return resultado;
 }

 // Método para redondear un número a una cantidad específica de decimales
 public static double redondearDecimal(double numero, int decimales) {
     if (decimales < 0) {
         throw new IllegalArgumentException("La cantidad de decimales no puede ser negativa.");
     }
     double factor = Math.pow(10, decimales);
     return Math.round(numero * factor) / factor;
 }
}

