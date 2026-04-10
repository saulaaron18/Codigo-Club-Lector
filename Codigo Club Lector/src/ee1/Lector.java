package ee1;
/**
 * 
 */


public class Lector {
  
  
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
