package Ejercicio15;

public class Ejercicio15 {
    
    public static void modificarPrimitivo(int numero) {
        numero = numero * 2;
        System.out.println("Dentro del método, numero = " + numero);
    }
    
    public static void modificarObjeto(StringBuilder texto) {
        texto.append(" modificado");
        System.out.println("Dentro del método, texto = " + texto);
    }
    
    public static void main(String[] args) {
        int valorPrimitivo = 5;
        StringBuilder valorObjeto = new StringBuilder("Hola");
        
        System.out.println("Antes de llamar al método, valorPrimitivo = " + valorPrimitivo);
        modificarPrimitivo(valorPrimitivo);
        System.out.println("Después de llamar al método, valorPrimitivo = " + valorPrimitivo);
        
        System.out.println("\nAntes de llamar al método, valorObjeto = " + valorObjeto);
        modificarObjeto(valorObjeto);
        System.out.println("Después de llamar al método, valorObjeto = " + valorObjeto);
    }
}
