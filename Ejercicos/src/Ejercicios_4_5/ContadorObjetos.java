package Ejercicios_4_5;
public class ContadorObjetos {
    // Atributo estático para contar el número de objetos creados
    private static int totalObjetos = 0;

    // Constructor que incrementa el contador estático
    public ContadorObjetos() {
        totalObjetos++;
    }

    // Método estático para mostrar el total de objetos creados
    public static void mostrarTotalObjetos() {
        System.out.println("Total de objetos creados: " + totalObjetos);
    }
}
