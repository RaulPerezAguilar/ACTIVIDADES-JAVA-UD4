package Ejercicio11;

//Clase Libro
public class Ejercicio11 {
 // Atributos
 private String titulo;
 private String autor;
 private String isbn;
 private int anioPublicacion;

 // Constructor que inicializa los atributos
 public Ejercicio11(String titulo, String autor, String isbn, int anioPublicacion) {
     this.titulo = titulo;
     this.autor = autor;
     this.isbn = isbn;
     this.anioPublicacion = anioPublicacion;
 }

 // Sobrescritura del método toString() para devolver la representación en cadena
 @Override
 public String toString() {
     return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Año: " + anioPublicacion;
 }

 // Sobrescritura del método equals() para comparar libros por ISBN
 @Override
 public boolean equals(Object obj) {
     // Verifica si el objeto comparado es del mismo tipo
     if (this == obj) {
         return true;
     }
     if (obj == null || getClass() != obj.getClass()) {
         return false;
     }
     // Realiza la comparación por ISBN
     Ejercicio11 otroLibro = (Ejercicio11) obj;
     return this.isbn.equals(otroLibro.isbn);
 }

 // Método main para realizar las operaciones
 public static void main(String[] args) {
     // Crear varios objetos Libro
     Ejercicio11 libro1 = new Ejercicio11("Java: Programación para principiantes", "Juan Pérez", "123456789", 2020);
     Ejercicio11 libro2 = new Ejercicio11("Python para todos", "María López", "987654321", 2021);
     Ejercicio11 libro3 = new Ejercicio11("Java: Programación para principiantes", "Juan Pérez", "123456789", 2020);

     // Imprimir cada libro usando toString()
     System.out.println(libro1);
     System.out.println(libro2);
     System.out.println(libro3);

     // Comparar dos libros con el mismo ISBN
     System.out.println("\nComparar libro1 y libro3 (mismo ISBN): " + libro1.equals(libro3)); // Esperado: true

     // Comparar dos libros con diferentes ISBN
     System.out.println("Comparar libro1 y libro2 (diferente ISBN): " + libro1.equals(libro2)); // Esperado: false
 }
}

