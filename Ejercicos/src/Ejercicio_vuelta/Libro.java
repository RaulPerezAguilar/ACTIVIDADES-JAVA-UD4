package Ejercicio_vuelta;

public class Libro {

	//Añadir los atributos privados
	private String titulo;
	private String autor;
	private int aniopublicacion;
	private String prestarlibro;
	
	//Constructor principal
	public Libro(String Titulo,String Autor, int Aniopublicacion, boolean Prestarlibro) {
		setTitulo(titulo);
		setAutor(autor);
		setAniopublicacion(aniopublicacion);
		setPrestarlibro(prestarlibro);
	}
	
    public Libro(String titulo) {
        this(titulo, autor, 1, prestarlibro);
    }
}