package Ejercicio16;

//Clase principal para probar el código
public class Main {
public static void main(String[] args) {
   Pajaro pajaro = new Pajaro("Canario", 2);
   Pez pez = new Pez("Goldfish", 1);
   Perro perro = new Perro("Labrador", 3);
   Pato pato = new Pato("Donald", 4);

   // Usamos polimorfismo con interfaces
   Volador[] voladores = {pajaro, pato};
   Nadador[] nadadores = {pez, pato};
   Corredor[] corredores = {perro};

   System.out.println("\nAnimales que pueden volar:");
   for (Volador v : voladores) {
       v.volar();
   }

   System.out.println("\nAnimales que pueden nadar:");
   for (Nadador n : nadadores) {
       n.nadar();
   }

   System.out.println("\nAnimales que pueden correr:");
   for (Corredor c : corredores) {
       c.correr();
   }
}
}