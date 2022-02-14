# Taller_3
## Este repositorio se creó para el desarrollo del Taller de buenas prácticas de POO.
### La aplicación tiene como objetivo realizar la visualización, creación, aplicación de filtros y orden a una lista de canciones por medio de interacciones con el usuario.

### En estos archivos se tienen:
* Un paquete para las interfaces:
  > Una interface con la declaración de dos métodos para ordenar las canciones.
* Un paquete para las clases:
  1. Una abstracta con los atributos generales que deben tener las canciones (título, fecha, duración, género, caratula, descripción y un identificador con sus respectivos métodos get y set), dos métodos abstractos (contador, el cual permite calcular el numero de canciones en una lista y mensaje, el cual permite mostrar la información de una o varias canciones).
  2. Una clase para las canciones que extiende de la clase abstracta e implementa la interface junto con las interfaces Comparable y Comparator, con la implementación de cada uno de sus métodos.

* Un paquete para la clase principal:
> Esta clase hace que a partir de la interacción con el usuario se puedan visualizar y crear listas de canciones; ademas de poder despues ordenar por duración o por fecha las canciones de la lista (en orden ascendente, descendente o en orden de registro de las canciones) y filtrar dicha lista por género o por años.

## Es posible ejecutar el código a traves de un IDE descargando el proyecto, extrayéndolo del archivo .ZIP, abriéndolo en el IDE y ejecutándolo.
