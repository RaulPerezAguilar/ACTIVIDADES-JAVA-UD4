package Ejercicio9;

// Clase base Vehiculo
class Vehiculo {
    // Atributos comunes a todos los vehículos
    String marca;
    String modelo;
    int anio;

    // Constructor para inicializar los atributos
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Método para mostrar los detalles del vehículo
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }

    // Método para mover el vehículo (se sobrescribirá en las clases derivadas)
    public void mover() {
        System.out.println("El vehículo está en movimiento");
    }
}

// Clase derivada Coche
class Coche extends Vehiculo {
    // Atributo específico de Coche
    int numPuertas;

    // Constructor que inicializa los atributos de Vehiculo y Coche
    public Coche(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);  // Llamada al constructor de la clase base
        this.numPuertas = numPuertas;
    }

    // Sobrescritura del método mostrarDetalles() para incluir numPuertas
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();  // Llamada al método mostrarDetalles() de la clase base
        System.out.println("Número de puertas: " + numPuertas);
    }

    // Sobrescritura del método mover()
    @Override
    public void mover() {
        System.out.println("El coche está en movimiento");
    }
}

// Clase derivada Motocicleta
class Motocicleta extends Vehiculo {
    // Atributo específico de Motocicleta
    boolean tieneSidecar;

    // Constructor que inicializa los atributos de Vehiculo y Motocicleta
    public Motocicleta(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);  // Llamada al constructor de la clase base
        this.tieneSidecar = tieneSidecar;
    }

    // Sobrescritura del método mostrarDetalles() para incluir si tiene sidecar
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();  // Llamada al método mostrarDetalles() de la clase base
        System.out.println("¿Tiene sidecar?: " + (tieneSidecar ? "Sí" : "No"));
    }

    // Sobrescritura del método mover()
    @Override
    public void mover() {
        System.out.println("La motocicleta está en movimiento");
    }
}

// Clase derivada Camion (Extensión opcional)
class Camion extends Vehiculo {
    // Atributo específico de Camion
    double capacidadCarga;  // en toneladas

    // Constructor que inicializa los atributos de Vehiculo y Camion
    public Camion(String marca, String modelo, int anio, double capacidadCarga) {
        super(marca, modelo, anio);  // Llamada al constructor de la clase base
        this.capacidadCarga = capacidadCarga;
    }

    // Sobrescritura del método mostrarDetalles() para incluir capacidadCarga
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();  // Llamada al método mostrarDetalles() de la clase base
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
    }

    // Sobrescritura del método mover()
    @Override
    public void mover() {
        System.out.println("El camión está en movimiento");
    }
}


