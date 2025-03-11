package Ejercicios_4_1;

public class a {
    public static void main(String[] args) {
        // Crear una persona con valores predeterminados
        Persona persona1 = new Persona("Raul", 25, 1.80);

        // Imprimir estado inicial
        System.out.println("Estado inicial:");
        System.out.println(persona1);

        // Llamar a cumplirAños y mostrar el cambio
        persona1.cumplirAños();
        System.out.println("Después de cumplir años:");
        System.out.println(persona1);

        // Incrementar la estatura y mostrar el cambio
        persona1.crecer(0.05); // Crecer 5 centímetros
        System.out.println("Después de crecer:");
        System.out.println(persona1);

        // Probar validaciones
        System.out.println("Pruebas de validación:");
        persona1.setEdad(-5); // Edad inválida
        persona1.setEstatura(3.0); // Estatura inválida
        persona1.crecer(-0.02); // Incremento inválido
    }
}
