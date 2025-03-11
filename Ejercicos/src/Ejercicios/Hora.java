package Ejercicios;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor principal
    public Hora(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // Constructor por defecto
    public Hora() {
        this(0, 0, 0);
    }

    // Getters y Setters con validaciones
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora >= 24) {
            System.out.println("Hora no válida. Se asigna 0.");
            this.hora = 0;
        } else {
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto >= 60) {
            System.out.println("Minuto no válido. Se asigna 0.");
            this.minuto = 0;
        } else {
            this.minuto = minuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo >= 60) {
            System.out.println("Segundo no válido. Se asigna 0.");
            this.segundo = 0;
        } else {
            this.segundo = segundo;
        }
    }

    // Método para avanzar un segundo
    public void avanzarSegundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }

    // Método para mostrar la hora en formato hh:mm:ss
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
