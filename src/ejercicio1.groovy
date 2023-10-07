import java.util.Scanner

import java.util.Scanner

def scanner = new Scanner(System.in)

def entradaUsuario = ""
def listaNumeros = []
def listaNumerosEnteros = []
def suma = 0
def impares = []

while (true) {
    println "Ingresa numeros separados por comas: "
    entradaUsuario = scanner.nextLine()
    if (entradaUsuario.trim() == '') {
        println "\nDebes ingresar algunos valores\n"
        continue
    }
    try {
        listaNumeros = entradaUsuario.split(",")
        if (listaNumeros.size() == 0) {
            println "\nDebes ingresar al menos un numero\n"
            continue
        }
        listaNumerosEnteros = listaNumeros.collect { it.toInteger() }
        break
    } catch (Exception e) {
        println "\nSolo ingresa numeros separados por coma\n"
    }
}

for (i in listaNumerosEnteros) {
    if (i % 2 != 0) {
        impares.add(i)
        suma += i
    }
}

println "\nEstos son los numeros que ingresaste: $listaNumerosEnteros"
println "\nEstos son los numeros impares que ingresaste: $impares"
println "\nEl resultado de sumar todos los numeros impares es: $suma"
