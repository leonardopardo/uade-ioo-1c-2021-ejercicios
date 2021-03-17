# Clase 01

## Contexto general
En esta oportunidad hemos sido contratados para diseñar y desarrollar un sistema de Gestión de Vuelos y Aeropuertos. Una 
aerolínea ofrece vuelos para transportar pasajeros, en aviones, entre diferentes ciudades. Cada vuelo parte de un 
aeropuerto de inicio y arriba a un aeropuerto destino. Algunos vuelos pueden tener escalas intermedias. Los aeropuertos 
están localizados en ciudades, pudiendo tener una ciudad más de un aeropuerto.
A cada vuelo se le asigna un avión y una tripulación, la cual consta de 2 pilotos, 1 operador de comunicaciones, 2 
comisarios de abordo y 4 azafatas. Cada pasajero de un vuelo tiene asignado un asiento.

## Requerimientos
__El sistema debe informar:__

1. La capacidad de un vuelo ocupada por pasajeros.
2. La duración total aproximada de un vuelo, teniendo en cuenta que, de existir, en cada escala se demora un tiempo diferente.
3. La cantidad de vuelos que partieron de un aeropuerto, así como también la cantidad de vuelos que a él llegaron, en un día determinado.
4. El aeropuerto que recibió menos vuelos en escalas.
5. La cantidad de vuelos totales que realizó un pasajero.
6. La cantidad de aeropuertos que tiene una ciudad.
7. La ciudad que más pasajeros recibió en un día.
8. La cantidad de veces que un pasajero visitó una ciudad.
9. La cantidad de vuelos que realizó una tripulación en un periodo de tiempo determinado (en meses).
10. La aerolínea con mayor cantidad de pasajeros en un mes determinado.

## Resolución

__Simbolos__

### Identificar entidades principales o candidatas.

- Aerolinea
    ```
    prop nombre
    ```
- Aeropuerto
    ```
    prop nombre
    prop Ciudad ciudad
    prop Lista<Vuelo> arribos
    prop Lista<Vuelo> despegues
    cantidadArribos()
    cantidadDespegues()
    ```
- Avion 
    ```
    prop codigo
    prop Lista<Asiento> asientos
    prop Aerolinea aerolinea
    cantidadAsientos()
    ```
- Asiento
    ```
    prop numero
    prop <TURISTA | PRIMERA_CLASE> ClaseAsiento
    prop <PASILLO | VENTANA> UbicacionAsiento
    prop Avion avion
    ```
- Vuelo
    ```
    prop Avion
    prop Aeropuerto origen
    prop Aeropuerto destino
    prop Lista<Pasajeros> pasajeros
    prop Lista<Tripulantes> tripulantes
    prop Lista<<Aeropuerto, Duracion>> escalas
    prop FechaYHora fecha  
    prop duracion
    calcularDuracion()
    calcularOcupacion()
    ```
- Ciudad
    ```
    prop nombre
    prop Pais pais
    prop Lista<Aeropuertos> aeropuertos
    ```
- Persona
    ```
    prop nombre
    prop apellido
    prop documento
    prop tipo_documento
    prop fecha_nacimiento
    ```
    - Tripulante ___HEREDA DE___ Persona
        ```
        prop <PILOTO | OPERADOR | COMISARIO_ABORDO | AZAFATA> TipoTripulante  
        prop Lista<Vuelo> vuelos
        ```
    - Pasajero ___HEREDA DE___ Persona
        ```
        prop Lista<Vuelo> vuelos
        ```