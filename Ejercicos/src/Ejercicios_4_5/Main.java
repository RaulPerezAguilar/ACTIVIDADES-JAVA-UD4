package Ejercicios_4_5;

public class Main {
    public static void main(String[] args) {
        // Crear varios objetos de la clase ContadorObjetos
        ContadorObjetos objeto1 = new ContadorObjetos();
        ContadorObjetos objeto2 = new ContadorObjetos();
        ContadorObjetos objeto3 = new ContadorObjetos();

        // Mostrar el número total de objetos creados
        ContadorObjetos.mostrarTotalObjetos();

        // Crear más objetos
        ContadorObjetos objeto4 = new ContadorObjetos();
        ContadorObjetos objeto5 = new ContadorObjetos();

        // Mostrar el número total de objetos creados nuevamente
        ContadorObjetos.mostrarTotalObjetos();
    }
}
