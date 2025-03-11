package Ejercicios_4_7;



public class Locomotora {
    private String matricula;
    private int potencia;
    private int antiguedad;
    private Mecanico mecanico;

    public Locomotora(String matricula, int potencia, int antiguedad, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.antiguedad = antiguedad;
        this.mecanico = mecanico;
    }
}
