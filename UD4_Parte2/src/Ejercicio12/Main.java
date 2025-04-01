package Ejercicio12;

//Parte 3: Clase Principal
public class Main {
public static void main(String[] args) {
   // Crear un array de Animal con instancias de cada tipo de animal
   Animal[] animales = new Animal[3];
   animales[0] = new Perro("Rex", 5);
   animales[1] = new Gato("Whiskers", 3);
   animales[2] = new Pajaro("Pájaro Loco", 2);

   // Recorrer el array y llamar a mostrarInformacion() para cada animal
   for (Animal animal : animales) {
       animal.mostrarInformacion();
       // Si el animal es un Pajaro, llamar al método volar
       if (animal instanceof Pajaro) {
           ((Pajaro) animal).volar();
       }
       System.out.println(); // Para separar la salida entre los animales
   }
}
}
