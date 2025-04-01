package Ejercicio13;

//Clase Main para probar la clase MatematicasUtil
public class Main {
public static void main(String[] args) {
   // Ejemplo de uso de los métodos estáticos de MatematicasUtil

   // Calcular el área de un círculo con radio 5
   System.out.println("Área del círculo: " + Ejercicio13.calcularAreaCirculo(5));

   // Verificar si el número 17 es primo
   System.out.println("¿Es 17 primo? " + Ejercicio13.esPrimo(17));

   // Calcular el factorial de 5
   System.out.println("Factorial de 5: " + Ejercicio13.factorial(5));

   // Calcular el perímetro de un rectángulo con largo 10 y ancho 5
   System.out.println("Perímetro del rectángulo: " + Ejercicio13.calcularPerimetroRectangulo(10, 5));

   // Redondear un número (3.14159) a 2 decimales
   System.out.println("Número redondeado: " + Ejercicio13.redondearDecimal(3.14159, 2));
}
}

