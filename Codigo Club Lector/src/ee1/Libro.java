package ee1;
import anotacion.Programacion2;
import fecha.Fecha;



@Programacion2 (
		nombreAutor1 = "nombre",
		apellidoAutor1 = "apellidos",
		emailUPMAutor1 = "e-mail upm"
		)


public class Libro {
	private String titulo;
	private String autor;
	private Fecha fechaPublicacion;
	private int nVecesPrestado;

	// CONSTRUCTORES
	public Libro(String titulo, String autor, Fecha fechaPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = new Fecha(fechaPublicacion);
		this.nVecesPrestado = 0;
	}

	public Libro(Libro obj) {
		this.titulo = new String(obj.titulo);
		this.autor = new String(obj.autor);
		this.fechaPublicacion = new Fecha(obj.fechaPublicacion);
		this.nVecesPrestado = obj.nVecesPrestado;
	}

	//GETTERS
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Fecha getFechaPublicacion() {
		return fechaPublicacion;
	}

	public int getNVecesPrestado() {
		return nVecesPrestado;
	}

	//OTROS MÉTODOS
	public void prestado() {
		this.nVecesPrestado += 1;
	}

	private boolean esIgual(Libro obj) {
		return this.titulo.equals(obj.titulo) &&
				this.autor.equals(obj.autor) &&
				this.fechaPublicacion.equals(obj.getFechaPublicacion());
	}

	/**
	 * Indica si este libro es igual a otro
	 * PRE: Cierto
	 * Retorna cierto si los libros coincide: 
	 * el título, el autor y la fecha de publicación. 
	 * En otro caso retorna falso 
	 * @param otro libro con el que se compara
	 * @return cierto si son iguales falso en otro caso
	 */
	@Override
	public boolean equals (Object otro) {

		if (!(otro instanceof Libro))
		{
			return false;
		}

		Libro comparar = (Libro) otro;
		return this.esIgual(comparar);
	}


}
