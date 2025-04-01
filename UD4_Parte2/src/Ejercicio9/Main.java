package Ejercicio9;

//Clase principal Main
public class Main {
 public static void main(String[] args) {
     // Crear objetos de las clases derivadas
     Coche coche = new Coche("Toyota", "Corolla", 2020, 4);
     Motocicleta motocicleta = new Motocicleta("Harley-Davidson", "Sportster", 2021, true);
     Camion camion = new Camion("Volvo", "FH16", 2019, 18.0);

     // Llamar al método mostrarDetalles() de cada objeto
     System.out.println("Detalles del coche:");
     coche.mostrarDetalles();
     System.out.println("\nDetalles de la motocicleta:");
     motocicleta.mostrarDetalles();
     System.out.println("\nDetalles del camión:");
     camion.mostrarDetalles();

     // Llamar al método mover() de cada objeto
     System.out.println("\nMoviendo vehículos:");
     coche.mover();
     motocicleta.mover();
     camion.mover();
 }
}