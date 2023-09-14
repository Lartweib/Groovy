class Paises{

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
        do {
            println mostrarMenu
            def opcion = System.console().readLine("\nSeleccione la opcion deseada: ")
            if (opcion == "1"){
                imprimirListado()
            }else if (opcion == "2"){
                busquedaPais()
            }else if (opcion == "3"){
                println "\nHasta luego!"
                exit = true
                break 
            }else{
                println "[ ERROR ] -> Ingrese una opcion correcta"
            }
        }while (true)
    }

    void ingresarPaises(){
        println "\nA continuacion se le pedira que ingrese la cantidad de paises que se van a agregar:"
        def cantidad = null
        do{
            cantidad = System.console().readLine("\nIndique la cantidad de paises: ")
            try{
                cantidad = cantidad.toInteger()
                break
            }catch (Exception e){
                println "\n[ ERROR ] Indique unicamente numeros enteros"
            }
        }while(true)
        mapaPaises = [:]
        for (i in 1..cantidad){
            def pais = System.console().readLine("\nIndique el nombre del pais $i: ")
            def capital = System.console().readLine("\nIndique la capital de $pais: ")
            mapaPaises[pais] = capital
            println "\nSe agrego el pais $pais con su capital $capital al listado de paises"
        }
    }

    void busquedaPais(){
        def volverABuscar = "S"
        do{
            println "\nBuscar capitales por paises: "
            def busqueda = System.console().readLine("\nIngrese el pais a buscar: ")
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
            volverABuscar = System.console().readLine("\nBuscar otro pais? [S/N]: ")
        }while (volverABuscar.toUpperCase() == "S")
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
        
        do{
            if (exit == true){
                break
            }
            def paisesNuevos = System.console().readLine("\nCargar paises nuevos? [S/N]: ")
            if (paisesNuevos.toUpperCase() == "S"){
                paises.ingresarPaises()
            }else if (paisesNuevos.toUpperCase() == "N"){
                paises.menu()
            }else {
                println "[ ERROR ] -> Ingrese una opcion correcta"
            }
        }while(true)
    } 
}


