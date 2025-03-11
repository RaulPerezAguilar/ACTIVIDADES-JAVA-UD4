package Ejercicios_4_6;

import Maquinaria.*;
import Personal.*;
import java.time.LocalDate;

import Ejercicios_4_7.Locomotora;
import Ejercicios_4_7.Maquinista;
import Ejercicios_4_7.Mecanico;
import Ejercicios_4_7.Tren;
import Ejercicios_4_7.Vagon;

public class EmpresaFerroviaria {
    public static void main(String[] args) {
        // Crear mecánico
        Mecanico mecanico = new Mecanico("Carlos", "123456789", "Hidráulica");

        // Crear locomotora
        Locomotora locomotora = new Locomotora("ABC123", 3000, 2015, mecanico);

        // Crear maquinista
        Maquinista maquinista = new Maquinista("Luis", "987654321", 2000.0, "Senior");

        // Crear tren
        Tren tren = new Tren(locomotora, maquinista);

        // Enganchar vagones
        tren.engancharVagon(new Vagon(1, 10000, 8000, "Granos"));
        tren.engancharVagon(new Vagon(2, 15000, 12000, "Acero"));

        // Desenganchar un vagón
        tren.desengancharVagon();
    }
}
