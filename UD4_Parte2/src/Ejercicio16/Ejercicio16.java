package Ejercicio16;

//Definición de interfaces
public interface Volador {
 void volar();
}

public interface Nadador {
 void nadar();
}

public interface Corredor {
 void correr();
}

//Clase base Animal
public abstract class Animal {
 protected String nombre;
 protected int edad;

 public Animal(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
 }

 public void mostrarInformacion() {
     System.out.println("Nombre: " + nombre + ", Edad: " + edad);
 }
}

//Clases específicas con capacidades adicionales
public class Ejercicio16 extends Animal implements Volador {
 public Ejercicio16(String nombre, int edad) {
     super(nombre, edad);
 }

 @Override
 public void volar() {
     System.out.println(nombre + " está volando.");
 }
}

public class Pez extends Animal implements Nadador {
 public Pez(String nombre, int edad) {
     super(nombre, edad);
 }

 @Override
 public void nadar() {
     System.out.println(nombre + " está nadando.");
 }
}

public class Perro extends Animal implements Corredor {
 public Perro(String nombre, int edad) {
     super(nombre, edad);
 }

 @Override
 public void correr() {
     System.out.println(nombre + " está corriendo.");
 }
}

//Clase con múltiples capacidades (Ejemplo: Pato)
public class Pato extends Animal implements Volador, Nadador {
 public Pato(String nombre, int edad) {
     super(nombre, edad);
 }

 @Override
 public void volar() {
     System.out.println(nombre + " está volando.");
 }

 @Override
 public void nadar() {
     System.out.println(nombre + " está nadando.");
 }
}


