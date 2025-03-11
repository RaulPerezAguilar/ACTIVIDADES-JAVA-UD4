package Ejercicios_4_7;

public class Vagon { // Clase con visibilidad por defecto
    private int id;
    private double cargaMaxima;
    private double cargaActual;
    private String tipoMercancia;

    public Vagon(int id, double cargaMaxima, double cargaActual, String tipoMercancia) {
        this.id = id;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }
}
