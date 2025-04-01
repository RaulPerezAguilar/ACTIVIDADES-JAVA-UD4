package Ejercicio10;

//Clase principal Main
public class Main {
 public static void main(String[] args) {
     // Crear un array de tamaño 2 y tipo Figura
     Figura[] figuras = new Figura[2];

     // Crear instancias de Circulo y Rectangulo y agregarlas al array
     figuras[0] = new Circulo("Círculo", 5.0);  // Círculo con radio 5.0
     figuras[1] = new Rectangulo("Rectángulo", 4.0, 6.0);  // Rectángulo con base 4.0 y altura 6.0

     // Recorrer el array y llamar a los métodos mostrarInformacion() y calcularArea()
     for (Figura figura : figuras) {
         figura.mostrarInformacion();
         System.out.println("Área: " + figura.calcularArea());
         System.out.println();
     }
 }
}