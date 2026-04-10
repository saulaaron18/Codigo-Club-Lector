package ee1;
import anotacion.Programacion2;
import fecha.Fecha;



@Programacion2 (
        nombreAutor1 = "nombre",
		apellidoAutor1 = "apellidos",
		emailUPMAutor1 = "e-mail upm"
)


public class Libro {

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
