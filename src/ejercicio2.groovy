import java.util.Scanner

class Promedio {

    List<Integer> listaNumerosEnteros = []

    def pedirNumeros() {
        Scanner scanner = new Scanner(System.in)

        def entradaUsuario = ""
        while (true) {
            println "\nIngresa una lista de numeros enteros separados por comas: "
            entradaUsuario = scanner.nextLine()
            if (entradaUsuario.trim() == '') {
                println "\nDebes ingresar almenos dos numeros enteros"
                continue
            }
            try {
                def listaNumeros = entradaUsuario.split(",")
                if (listaNumeros.size() == 0) {
                    println "\nDebes ingresar al menos un numero"
                    continue
                }
                listaNumerosEnteros = listaNumeros.collect { it.toInteger() }
                break
            } catch (Exception e) {
                println "\nSolo ingresa numeros enteros separados por coma"
            }
        }

        scanner.close()
        return listaNumerosEnteros
    }

    def calcularPromedio(lista) {
        float total = lista.sum()
        return total / lista.size()
    }

    void imprimirResultado(promedio) {
        println "\n-> El promedio de los numeros facilitados es: ${promedio}"
    }

    static void main(String[] args) {
        def promedio = new Promedio()
        promedio.imprimirResultado(promedio.calcularPromedio(promedio.pedirNumeros()))
    }
}
