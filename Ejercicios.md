# Ejercicios de practica

## Ejercicio 1

Escribe un programa en Groovy que pida al usuario una lista de numeros separados por comas y a continuación calcule la suma de todos los numeros impares en la lista.

- El programa debe manejar el caso en el que la lista este vacia.

## Ejercicio 2

Escriba un programa en Groovy que permita calcular el promedio de un conjunto de números enteros ingresados por el usuario.

El programa debe contar con una clase Promedio que contenga los siguientes métodos:

- Un método pedirNumeros() que solicite al usuario que ingrese una lista de números enteros separados por comas.
  - El método debe convertir esta lista en una lista de enteros y devolverla.
- Un método calcularPromedio(lista) que reciba la lista de números enteros y calcule el promedio de los valores en la lista.
  - El método debe devolver el promedio calculado.
- Un método imprimirResultado(promedio) que imprima el resultado del cálculo del promedio en pantalla.

El programa principal debe:

- Crear una instancia de la clase Promedio
- Llamar al método pedirNumeros() para obtener la lista de números enteros
- Llamar al método calcularPromedio() para calcular el promedio de la lista de números enteros
- Finalmente llamar al método imprimirResultado() para imprimir el resultado en pantalla.

## Ejercicio 3

Escribe un programa en Groovy que realice distintas operaciones sobre una lista de paises con sus capitales.

- Al iniciar el programa nos debe preguntar si queremos usar un listado de paises y capitales precargado o queremos ingresar los paises y capitales nosotros mismos.
  - Si elegimos usar el listado precargado, el programa debe usar un listado precargado.
  - Si elegimos ingresar los paises y capitales nosotros mismos, el programa debe pedirnos que ingresemos la cantidad de paises que queremos ingresar y luego pedirnos que ingresemos los paises y capitales.
- Debe tener un menu que permita al usuario elegir entre las siguientes opciones:
  - Listar los paises guardados en orden alfabetico
  - Buscar la capital de un pais
  - Finalizar la ejecucion del programa
