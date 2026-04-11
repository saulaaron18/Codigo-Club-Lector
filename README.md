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
- getlibroLeido: (int posicion) [Libro] el libro que se encuentra en el histórico en la posición que se recibe como parámetro. (_La posición se encuentra entre 1 y el número de libros en el histórico_)
- leerLibro: (Libro libroLeido) [void] le indica al libro que ha sido prestado. 
Luego realiza una de las dos acciones:
      1. Si el número de libros leídos es menor que 10, este libro se inserta al final del histórico
      2. Si el número de libros leídos es mayor o igual que 10, se descarta el libro en la primera posición, se desplazan los libros hacia la posición de delante dejando la última posición libre, el cual se implementará el libroLeido del parámetro.
- esIgual: (Lector otroLector) [boolean] método privado que se implementa en conjunto con el ya definido equals.
Dos lectores son iguales si coinciden en el nSocio y el orden de los libros en el historicoLectura. (_El nombre no importa_) 
