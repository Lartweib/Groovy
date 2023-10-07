import java.util.Scanner

class Paises{
    static def scanner = new Scanner(System.in)

    Map mapaPaises = [
        "Argentina": "Buenos Aires",
        "Italia": "Roma",
        "Australia": "Canberra",
        "Canada": "Ottawa",
        "Japon": "Tokio",
        "India": "Nueva Delhi",
        "Francia": "Paris",
        "Brasil": "Brasilia",
        "Egipto": "El Cairo"
    ]

    static exit = false

    def menu(){
        def mostrarMenu = """
-----| MENU 

[1] - Listar paises
[2] - Buscar capital de un pais
[3] - Salir"""
        while (true) {
            println mostrarMenu
            println "\nSeleccione la opcion deseada: "
            def opcion = scanner.nextLine()
            if (opcion == "1") {
                imprimirListado()
            } else if (opcion == "2") {
                busquedaPais()
            } else if (opcion == "3") {
                println "\nHasta luego!"
                exit = true
                break
            } else {
                println "[ ERROR ] -> Ingrese una opcion correcta"
            }
        }
    }

    void ingresarPaises() {
        println "\nA continuacion se le pedira que ingrese la cantidad de paises que se van a agregar:"
        def cantidad = null
        while (true) {
            println "\nIngrese la cantidad de paises a agregar: "
            cantidad = scanner.nextLine()
            try {
                cantidad = cantidad.toInteger()
                break
            } catch (Exception e) {
                println "\n[ ERROR ] Indique unicamente numeros enteros"
            }
        }
        mapaPaises = [:]
        for (i in 1..cantidad) {
            println "\nIngrese el pais $i:"
            def pais = scanner.nextLine()
            println "\nIngrese la capital de $pais:"
            def capital = scanner.nextLine()
            mapaPaises[pais] = capital
            println "\nSe agrego el pais $pais con su capital $capital al listado de paises"
        }
    }

    void busquedaPais() {
        def volverABuscar = "S"
        while (true) {
            println "\nBuscar capitales por paises: "
            println "\nIngrese el pais a buscar: "
            def busqueda = scanner.nextLine()
            def encontrado = false

            mapaPaises.each { pais, capital ->
                if (pais.toUpperCase() == busqueda.toUpperCase()) { // Convertir a mayúsculas para la comparación
                    println "\nLa capital de $pais es $capital"
                    encontrado = true
                    return
                }
            }
            if (!encontrado) {
                println "El pais $busqueda no se encuentra dentro del listado de paises guardados"
            }
            println "\nDesea buscar otro pais? [S/N]: "
            volverABuscar = scanner.nextLine()
            if (volverABuscar.toUpperCase() != "S") {
                break
            }
        }
    }

    void imprimirListado(){
        println "\nA continuacion se mostraran los paises y sus capitales almacenados en memoria: "
        mapaPaises.sort().each { pais, capital ->
            println "Pais: $pais - Capital: $capital"
        }
    }

    static void main(String[] args) {
        def paises = new Paises()
        println "\nActualmente existe un listado de paises precargados"
        println "\nPuede operar con estos o cargar una lista desde cero"

        while (true) {
            if (exit == true) {
                break
            }
            println "\nCargar paises nuevos? [S/N]:"
            def paisesNuevos = scanner.nextLine()
            if (paisesNuevos.toUpperCase() == "S") {
                paises.ingresarPaises()
            } else if (paisesNuevos.toUpperCase() == "N") {
                paises.menu()
            } else {
                println "[ ERROR ] -> Ingrese una opcion correcta"
            }
        }
    }
}