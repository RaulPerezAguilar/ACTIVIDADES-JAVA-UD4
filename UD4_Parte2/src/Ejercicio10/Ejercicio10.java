package Ejercicio10;

// Clase base Figura
abstract class Figura {
    // Atributo protegido nombre de la figura
    protected String nombre;

    // Constructor que recibe el nombre como parámetro
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método calcularArea() que devuelve 0.0 (será sobrescrito en las clases hijas)
    public double calcularArea() {
        return 0.0;
    }

    // Método mostrarInformacion() que imprime el nombre de la figura
    public void mostrarInformacion() {
        System.out.println("Figura: " + nombre);
    }
}

// Clase Circulo que hereda de Figura
class Circulo extends Figura {
    // Atributo radio (doble)
    private double radio;

    // Constructor que inicializa los atributos
    public Circulo(String nombre, double radio) {
        super(nombre);  // Llamada al constructor de la clase base
        this.radio = radio;
    }

    // Sobrescritura del método calcularArea() para calcular el área del círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase Rectangulo que hereda de Figura
class Rectangulo extends Figura {
    // Atributos base y altura (dobles)
    private double base;
    private double altura;

    // Constructor que inicializa los atributos
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);  // Llamada al constructor de la clase base
        this.base = base;
        this.altura = altura;
    }

    // Sobrescritura del método calcularArea() para calcular el área del rectángulo
    @Override
    public double calcularArea() {
        return base * altura;
    }
}


