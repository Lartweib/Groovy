# Groovy

## Índice

- [Groovy](#groovy)
  - [Índice](#índice)
  - [Variables y tipos de datos](#variables-y-tipos-de-datos)
    - [Numeros](#numeros)
    - [Strings](#strings)
    - [Booleanos](#booleanos)
    - [Listas](#listas)
    - [Mapas](#mapas)
    - [Arrays](#arrays)
    - [Objetos](#objetos)
  - [Operadores](#operadores)
    - [Operadores aritmeticos](#operadores-aritmeticos)
    - [Operadores de comparación](#operadores-de-comparación)
    - [Operadores lógicos](#operadores-lógicos)
    - [Operadores de asignación](#operadores-de-asignación)
    - [Operadores de bits](#operadores-de-bits)
    - [Operadores de identidad](#operadores-de-identidad)
    - [Operadores de membresía](#operadores-de-membresía)
    - [Operadores de miembro](#operadores-de-miembro)
    - [Operador: $](#operador-)
    - [Operador ternario condicional: ?:](#operador-ternario-condicional-)
    - [Operadores de navegación segura: ?., ?\[\] y ?\*](#operadores-de-navegación-segura---y-)
  - [Conversiones](#conversiones)
    - [String a otros tipos de datos](#string-a-otros-tipos-de-datos)
    - [Numeros a otros tipos de datos](#numeros-a-otros-tipos-de-datos)
    - [De listas y arreglos](#de-listas-y-arreglos)
  - [Estructuras de control](#estructuras-de-control)
    - [If](#if)
    - [Switch](#switch)
    - [For](#for)
    - [For each](#for-each)
    - [While](#while)
    - [Do while](#do-while)
    - [Try catch](#try-catch)
  - [Leyendo e imprimiento datos](#leyendo-e-imprimiento-datos)
    - [Imprimiendo datos](#imprimiendo-datos)
    - [Leyendo datos](#leyendo-datos)
  - [Funciones y metodos](#funciones-y-metodos)
    - [Declaracion de funciones y metodos](#declaracion-de-funciones-y-metodos)
    - [Parámetros opcionales](#parámetros-opcionales)
    - [Orden superior](#orden-superior)
    - [Metodos de extension](#metodos-de-extension)
      - [delegate](#delegate)
    - [Return implicito](#return-implicito)
  - [Clases y objetos](#clases-y-objetos)
    - [Clases](#clases)
    - [Objetos](#objetos-1)
    - [Constructores](#constructores)
    - [Constructor de copia](#constructor-de-copia)
    - [Metodos](#metodos)
  - [Colecciones](#colecciones)
    - [Map](#map)
      - [Crear un mapa vacio](#crear-un-mapa-vacio)
      - [Agregar pares clave-valor al mapa](#agregar-pares-clave-valor-al-mapa)
      - [Acceder a un valor del mapa](#acceder-a-un-valor-del-mapa)
      - [Iterar sobre un mapa](#iterar-sobre-un-mapa)
      - [Eliminar un par clave-valor del mapa](#eliminar-un-par-clave-valor-del-mapa)
    - [LinkedHashMap](#linkedhashmap)
    - [Set](#set)
      - [Crear un set vacio](#crear-un-set-vacio)
      - [Agregar elementos al set](#agregar-elementos-al-set)
      - [Iterar sobre un set](#iterar-sobre-un-set)
      - [Eliminar un elemento del set](#eliminar-un-elemento-del-set)
      - [contains()](#contains)

## Variables y tipos de datos

### Numeros

Groovy soporta numeros enteros (int) y numeros de punto flotante (float)

    int numero = 0
    float numeroflotante = 0.0 

### Strings

Se pueden crear utilizando comillas simples ('') y comillas dobles ("")

    String texto = "Hola" 
    String texto = 'Hola'

### Booleanos

Los booleanos (Boolean) manejan dos valores 'true' y 'false'

    Boolean flag = false

### Listas

Se pueden crear utilizando corchetes ([]) y se pueden acceder a los elementos mediante su indice.

_`lista.size()`_ -> nos da el tamaño de la lista

    def lista = [1,2,3]
    tamLista = lista.size()

### Mapas

Los mapas (Map) son colecciones de clave-valor (key-value) el equivalente a diccionarios en python y se pueden crear usando llaves ({}) o mediante la sintaxis "key:value".

    def myMap = [
        "manzana":2.99,
        "banana":1.25,
        "naranja":0.99
    ]

### Arrays

Los array son una colección ordenada de elementos de un solo tipo y se pueden crear usando la sintaxis "[tipo]".

    int[] myArray = [1,2,3]

### Objetos

Los objetos (Object) son instancias de clases que tienen propiedades y metodos.

    class Person {
        String name
        int age

        void speak(){
            println("Hola, mi nombre es ${name}")
        }
    }

    def person = new Person(name:"John", age:30)

    person.speak()

## Operadores

### Operadores aritmeticos

| Operador | Descripción |
| --- | --- |
| + | Suma |
| - | Resta |
| * | Multiplicación |
| / | División |
| % | Módulo |
| ++ | Incremento |
| -- | Decremento |

### Operadores de comparación

| Operador | Descripción |
| --- | --- |
| == | Igual a |
| != | Diferente a |
| > | Mayor que |
| < | Menor que |

### Operadores lógicos

| Operador | Descripción |
| --- | --- |
| && | AND |
| \|\| | OR |
| ! | NOT |

### Operadores de asignación

| Operador | Descripción |
| --- | --- |
| = | Asignación |
| += | Asignación de suma |
| -= | Asignación de resta |
| *= | Asignación de multiplicación |
| /= | Asignación de división |
| %= | Asignación de módulo |

### Operadores de bits

| Operador | Descripción |
| --- | --- |
| & | AND |
| \| | OR |
| ^ | XOR |
| ~ | Complemento a uno |
| << | Desplazamiento a la izquierda |
| >> | Desplazamiento a la derecha |
| >>> | Desplazamiento a la derecha sin signo |

### Operadores de identidad

| Operador | Descripción |
| --- | --- |
| === | Igualdad estricta |
| !== | Desigualdad estricta |

### Operadores de membresía

| Operador | Descripción |
| --- | --- |
| in | Contenido en |
| not in | No contenido en |

### Operadores de miembro

| Operador | Descripción |
| --- | --- |
| . | Acceso a miembro |
| [] | Acceso a miembro |
| () | Llamada a método |
| ?: | Operador ternario |

### Operador: $ 

Se usa para incluir el valor de una variable en un String

    String nombre = "John"
    println("Hola, mi nombre es ${nombre}")

### Operador ternario condicional: ?:

`condicion ? resultado_si_verdadero : resultado_si_falso`

    def numero = 10
    def resultado = (numero > 0) ? "Positivo" : "Negativo"

### Operadores de navegación segura: ?., ?[] y ?*

Estos operadores se utilizan para manejar expresiones que pueden ser nulas o indefinidas

    def persona = null
    def nombre = persona?.nombre

    def lista = null
    def primerElemento = lista?.[0]

    def mapa = null
    def valor = mapa?.get("llave")

## Conversiones

### String a otros tipos de datos

| Tipo de dato | Método |
| --- | --- |
| int | toInteger() |
| float | toFloat() |
| double | toDouble() |
| boolean | toBoolean() |
| date | toDate() |

    def texto = "123"
    def entero = texto.toInteger()
    println entero

### Numeros a otros tipos de datos

| Tipo de dato | Método |
| --- | --- |
| String | toString() |
| boolean | toBoolean() |
| BigDecimal | toBigDecimal() |
| BigInteger | toBigInteger() |

    def numero = 123
    def texto = numero.toString()
    println texto

### De listas y arreglos

- _`join()`_ -> convierte una lista o arreglo en un String separado por comas

        def lista = [1,2,3]
        def texto = lista.join()
        println texto

- _`toArray()`_ -> convierte una lista en un arreglo

        def lista = [1,2,3]
        def arreglo = lista.toArray()
        println arreglo

- _`toList()`_ -> convierte un arreglo en una lista

        def arreglo = [1,2,3]
        def lista = arreglo.toList()
        println lista

## Estructuras de control

### If

    def numero = 10
    if(numero > 0){
        println("Positivo")
    }else{
        println("Negativo")
    }

### Switch

    def numero = 10
    switch(numero){
        case 1:
            println("Uno")
            break
        case 2:
            println("Dos")
            break
        default:
            println("Otro")
    }

### For

    def lista = [1,2,3]
    for(int i = 0; i < lista.size(); i++){
        println(lista[i])
    }

### For each

    def lista = [1,2,3]
    for(int i in lista){
        println(i)
    }

### While

    def numero = 10
    while(numero > 0){
        println(numero)
        numero--
    }

### Do while

    def numero = 10
    do{
        println(numero)
        numero--
    }while(numero > 0)

### Try catch

    try{
        def numero = 10 / 0
    }catch(Exception e){
        println("Error: ${e}")
    }

## Leyendo e imprimiento datos

### Imprimiendo datos

    println("Hola mundo")

### Leyendo datos

    def entradaUsuario = System.console().readLine("Ingresa los string separados por comas: ")
    def lista = entradaUsuario.split(",")
    println lista

## Funciones y metodos

### Declaracion de funciones y metodos

    def suma(int a, int b){
        return a + b
    }

### Parámetros opcionales

    def saludar(String nombre, String apellido = ""){
        if (apellido) {
            println "Hola ${nombre} ${apellido}"
        } else {
            println "Hola ${nombre}"
        }
    }

### Orden superior

Toman otra funcion como parametro.

    def doble(func, int x){
        return func(x) * 2
    }

    def cuadrado(int x){
        return x * x
    }

    assert doble(cuadrado, 2) == 8

### Metodos de extension

Permite agregar metodos a clases existentes mediante la metaprogramacion de Groovy.

- Se definen fuera de la clase y con metaClass se agregan.

#### delegate

Permite delegar la ejecucion de un metodo a otro objeto.

    String.metaClass.capitalize = { 
        delegate.substring(0, 1).toUpperCase() + delegate.substring(1)
    }

    def resultado = "hola mundo".capitalize()
    println resultado // Salida: "Hola mundo"

### Return implicito

En groovy cuando una funcion o metodo no tiene un return explicito, se retorna el ultimo valor evaluado.

    def suma(int a, int b){
        a + b
    }

## Clases y objetos

### Clases

Para definir clases se utiliza `class` y el nombre de la clase.

    class Persona {
        String nombre
        int edad
    }

### Objetos

Para crear objetos se utiliza `new` y el nombre de la clase.

    class Persona {
        String nombre
        int edad
    }

    def persona = new Persona()
    persona.nombre = "John"
    persona.edad = 30

    println persona.nombre
    println persona.edad

### Constructores

Los constructores se definen con `def __init__` y se ejecutan al crear un objeto.

    class Persona {
        String nombre
        int edad

        def __init__(String nombre, int edad){
            this.nombre = nombre
            this.edad = edad
        }
    }

    def persona = new Persona("John", 30)

    println persona.nombre
    println persona.edad

### Constructor de copia

Se puede crear un constructor de copia para crear un nuevo objeto con los mismos valores de otro objeto.

    class Persona {
        String nombre
        int edad

        Persona(String nombre, int edad){
            this.nombre = nombre
            this.edad = edad
        }

        Persona(Persona persona){
            this(persona.nombre, persona.edad)
        }
    }
    
    def persona = new Persona("John", 30)
    def persona2 = new Persona(persona)

### Metodos

Los metodos se definen con `def` y el nombre del metodo.

    class Persona {
        String nombre
        int edad

        Persona(String nombre, int edad){
            this.nombre = nombre
            this.edad = edad
        }

        void saludar(){
            println "Hola, mi nombre es ${nombre}"
        }
    }

    def persona = new Persona("John", 30)
    persona.saludar()

## Colecciones

### Map

#### Crear un mapa vacio

    def mapa = [:]  

#### Agregar pares clave-valor al mapa

    def mapa = [:]
    mapa.put("llave", "valor")
    mapa.llave = "valor"

#### Acceder a un valor del mapa

    def mapa = [:]
    mapa.put("nombre", "federico")
    mapa.edad = 31
    println mapa.get("nombre") // Salida: "federico" 
    println mapa.nombre // Salida: "federico"
    println mapa["nombre"] // Salida: "federico"

#### Iterar sobre un mapa

    def mapa = [:]
    mapa.put("nombre", "federico")
    mapa.edad = 31
    mapa.each { clave, valor ->
        println "${clave}: ${valor}"
    }

#### Eliminar un par clave-valor del mapa

    def mapa = [:]
    mapa.put("nombre", "federico")
    mapa.edad = 31
    mapa.remove("nombre")
    println mapa // Salida: [edad:31]

### LinkedHashMap

Es una clase de groovy que extiende la funcionalidad de HashMap y mantiene el orden de inserción de los elementos.

    def mapa = new LinkedHashMap()
    mapa.put("nombre", "federico")
    mapa.edad = 31
    mapa.each { clave, valor ->
        println "${clave}: ${valor}"
    }
    // Salida: 
    // nombre: federico 
    // edad: 31

### Set

Es una coleccion que representa un conjunto de elementos unicos.

    def miSet = [1,2,3,2,1] as Set
    println miSet // Salida: [1, 2, 3]

#### Crear un set vacio

    def set = [] as Set

#### Agregar elementos al set

    def set = [] as Set
    set.add("elemento")
    set << "elemento"

#### Iterar sobre un set

    def set = [] as Set
    set.add("elemento")
    set << "elemento"
    set.each { elemento ->
        println elemento
    }

#### Eliminar un elemento del set

    def set = [] as Set
    set.add("elemento")
    set << "elemento"
    set.remove("elemento")
    println set // Salida: []

#### contains()

Permite verificar si un elemento esta en el set.

    def set = [] as Set
    set.add("elemento")
    set << "elemento"
    println set.contains("elemento") // Salida: true
