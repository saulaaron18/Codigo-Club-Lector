> Pequeña definición de simbolos:
> - []: en funciones significa lo que devuelve
> - (): en funciones significa los parametros que recibe

## Clase Libro

### Atributos 

- titulo: (String) título del libro
- autor: (String) nombre y apellidos del autor, que además se asume que solo hay un autor por libro
- fechaPublicación: (Fecha) fecha en el que fue publicado
- nVecesPrestado: (static int) cuenta las veces que ha sido prestado

### Funciones 

- Constructor: (String titulo, String autor, Fecha fechaPublicacion) []
- Constructor Copia: (Libro otroLibro) []
- Get titulo, autor, fecha publicación, nVecesPrestado: () getters de los atributos
- Prestado: () [void] incrementa en 1 el objeto libro
- EsIgual: (Libro otroLibro) [boolean] método privado que se implementa en conjunto con el ya definido equals.
  Dos libros son iguales si coinciden en el título, el autor y la fecha de publicación

## Clase Lector

### Atributos 

- nSocio: (int) nº de socio
- nombre: (String) nombre del socio
- historicoLectura: (ArrayList<Libro>) historico de los últimos 10 libros leidos por el socio.
  En primera posición el libro más antiguo leido y en última posición el libro más recientemente leido

### Funciones

- Constructor: (int nSocio, String nombre) [] además se ha de inicializar historicoLectura
- getnSocio, getNombre, getHistoricoLecturo: () getters de los atributos
- getlibroLeido: (int posicion) [Libro] el libro que se encuentra en el histórico en la posición que se recibe como parámetro
- leerLibro: 
- esIgual: (Lector otroLector) [boolean] método privado que se implementa en conjunto con el ya definido equals.
Dos lectores son iguales si coinciden en el nSocio y el orden de los libros en el historicoLectura. (_El nombre no importa_) 
