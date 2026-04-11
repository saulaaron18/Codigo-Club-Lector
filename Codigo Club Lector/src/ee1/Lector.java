package ee1;
import list.ArrayList;
/**
 * 
 */


public class Lector {

	private int nSocio;
	private String nombre;
	private ArrayList<Libro> historicoLectura;

	//Constructor
	public Lector(int nSocio, String nombre) {
		this.nSocio = nSocio;
		this.nombre = nombre;
		historicoLectura = new ArrayList<Libro>();
	}

	//Getters
	public int getNSocio() {
		return nSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public Libro getLibroLeido(int posicion) {
		Libro libro=null;

		if(posicion>=1 && posicion<=historicoLectura.size()) {
			libro = historicoLectura.get(posicion-1);
		}

		return libro;
	}

	//Otros Métodos
	public void leerLibro(Libro libro) {
		libro.prestado();

		if(historicoLectura.size() < 10) {
			historicoLectura.add(historicoLectura.size(), libro);
		}

		else {
			historicoLectura.removeElementAt(0);	
			historicoLectura.add(historicoLectura.size(), libro);
		}
	}

	private boolean esIgual(Lector obj) {
		boolean historicoIgual = historicoLectura.size() == obj.historicoLectura.size();

		if(historicoIgual) {
			for(int i = 1; i <= historicoLectura.size() && historicoIgual; i++) {
				historicoIgual = getLibroLeido(i).equals(obj.getLibroLeido(i));
			}
		}

		return historicoIgual && nSocio == obj.nSocio;
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

		if (!(otro instanceof Lector))
		{
			return false;
		}

		Lector comparar = (Lector) otro;
		return this.esIgual(comparar);
	}

}
