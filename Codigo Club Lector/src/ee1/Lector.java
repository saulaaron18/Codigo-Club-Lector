package ee1;
import list.ArrayList;
/**
 * 
 */


public class Lector {
	
	private int nSocio;
	private String nombre;
	private ArrayList<Libro> historicoLectura;
	
	public Lector(int nSocio, String nombre) {
		this.nSocio = nSocio;
		this.nombre = nombre;
		historicoLectura = new ArrayList<Libro>();
	}
	
	public int getNSocio() {
		return nSocio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Libro getLibroLeido(int indiceHistorico) {
		Libro leido;
		if(indiceHistorico == 1) {
			leido = historicoLectura.get(0);
		} else if(indiceHistorico <= 10 && indiceHistorico > 1) {
			leido = historicoLectura.get(indiceHistorico - 1);
		} else {
			leido = null;
		}
		return leido;
	}
	
	public void leerLibro(Libro libroLeido) {
		if(historicoLectura.size() < 10) {
			historicoLectura.add(historicoLectura.size(), libroLeido);
		} else if(historicoLectura.size() == 10){
			for(int i = 1; i < historicoLectura.size(); i++) {
				historicoLectura.set(i-1, historicoLectura.get(i));
			}
			historicoLectura.add(historicoLectura.size(), libroLeido);
		}
	}
	
	private boolean esIgual(Lector obj) {
		boolean historicoIgual = false;
		if(historicoLectura.size() == obj.historicoLectura.size()) {
			for(int i = 0; i < historicoLectura.size(); i++) {
				if(historicoLectura.get(i).equals(obj.historicoLectura.get(i))) {
					historicoIgual = true;
				}
			}
		}
		return historicoIgual && nSocio == obj.getNSocio();
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
