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
- Get titulo, autor, fecha publicación, nVecesPrestado: 
- Prestado
- EsIgual: método privado que se implementa en conjunto con el ya definido equals

## Clase Lector

### Atributos 

- nSocio: (int) nº de socio
- nombre: (String) nombre del socio
- historicoLectura: (ArrayList<Libro>) historico de los últimos 10 libros leidos por el socio.
  En primera posición el libro más antiguo leido y en última posición el libro más recientemente leido

### Funciones

- Constructor
- getnSocio, getNombre, getHistoricoLecturo: getters de los atributos
- getlibroLeido: el libro que se encuentra en el histórico en la posición que se recibe como parámetro
- leerLibro: 
- esIgual: (return boolean) [] método privado
