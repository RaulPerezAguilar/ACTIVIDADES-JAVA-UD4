package Ejercicio12;

//Parte 1: Clase abstracta Animal
abstract class Animal {
 // Atributos protegidos
 protected String nombre;
 protected int edad;

 // Constructor para inicializar los atributos
 public Animal(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
 }

 // Métodos abstractos
 public abstract void hacerSonido();
 public abstract String moverse();

 // Método concreto para mostrar información
 public void mostrarInformacion() {
     System.out.println("Nombre: " + nombre + ", Edad: " + edad);
     hacerSonido();
     System.out.println("Se mueve: " + moverse());
 }
}

//Parte 2: Clases concretas que heredan de Animal

//Clase Perro
class Perro extends Animal {
 public Perro(String nombre, int edad) {
     super(nombre, edad);
 }

 @Override
 public void hacerSonido() {
     System.out.println("Guau guau");
 }

 @Override
 public String moverse() {
     return "Corre en cuatro patas";
 }
}

//Clase Gato
class Gato extends Animal {
 public Gato(String nombre, int edad) {
     super(nombre, edad);
 }

 @Override
 public void hacerSonido() {
     System.out.println("Miau miau");
 }

 @Override
 public String moverse() {
     return "Se desliza sigilosamente";
 }
}

//Clase Pajaro
class Pajaro extends Animal {
 public Pajaro(String nombre, int edad) {
     super(nombre, edad);
 }

 @Override
 public void hacerSonido() {
     System.out.println("Pío pío");
 }

 @Override
 public String moverse() {
     return "Vuela por el aire";
 }

 // Método adicional para que los pájaros vuelen
 public void volar() {
     System.out.println("fly fly");
 }
}

