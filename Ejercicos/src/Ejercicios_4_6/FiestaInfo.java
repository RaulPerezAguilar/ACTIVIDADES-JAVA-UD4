package Ejercicios_4_6;

import javax.annotation.processing.Generated;

public class FiestaInfo {
    public static void main(String[] args) {
        // Crear objetos PersonaInfo con diferentes géneros
        PersonaInfo persona1 = new PersonaInfo("Raúl", 25, 1.80, Generated.HOMBRE);
        PersonaInfo persona2 = new PersonaInfo("Ana", 22, 1.65, Genero.MUJER);

        // Mostrar información de las personas
        persona1.mostrarInfo();
        System.out.println();
        persona2.mostrarInfo();
    }
}
