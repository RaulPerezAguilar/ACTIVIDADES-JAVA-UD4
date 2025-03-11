package Ejercicios_4_7;

import java.util.ArrayList;
import java.util.List;

public class Tren {
    private Locomotora locomotora;
    private Maquinista maquinista;
    private List<Vagon> vagones;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        this.vagones = new ArrayList<>();
    }

    public void engancharVagon(Vagon vagon) {
        if (vagones.size() < 5) {
            vagones.add(vagon);
        } else {
            System.out.println("No se pueden enganchar más de 5 vagones.");
        }
    }

    public void desengancharVagon() {
        if (!vagones.isEmpty()) {
            vagones.remove(vagones.size() - 1);
        } else {
            System.out.println("No hay vagones para desenganchar.");
        }
    }
}
