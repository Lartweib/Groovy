import java.text.SimpleDateFormat
import java.util.Date

abstract class Empleado {
    private String nombre
    private String apellido
    private int salario
    private Date fechaNacimiento 
    private Date fechaContratacion

    def formatoFecha = new SimpleDateFormat("dd/MM/yyyy")

    Empleado(String nombre, String apellido, int salario, String fechaNacimiento, String fechaContratacion){
        this.nombre = nombre
        this.apellido = apellido
        this.salario = salario
        this.fechaContratacion = formatoFecha.parse(fechaContratacion)
        this.fechaNacimiento = formatoFecha.parse(fechaNacimiento)
    }

    public void getNombre() {
        println "El empleado se llama ${this.nombre}"
    }
    public void getApellido(){
        println "El apellido del empleado es ${this.apellido}"

    }
    public void getSalario(){
        println "El salario del empleado es ${this.salario} euros"
    }
    public void getCumpleanios(){
        println  "El cumpleaños del empleado es el ${formatoFecha.format(this.fechaNacimiento)}"
    }
    public void getFechaContratacion(){
        println  "El empleado fue contratado el ${formatoFecha.format(this.fechaContratacion)}"
    }

}

class EmpleadoTemporal extends Empleado {
    private Date fechaFinContrato 

    EmpleadoTemporal(String nombre, String apellido, int salario, String fechaNacimiento, String fechaContratacion, String fechaFinContrato){
        super(nombre, apellido, salario, fechaNacimiento, fechaContratacion)
        this.fechaFinContrato = formatoFecha.parse(fechaFinContrato)
    }

    public void getFechaFinContrato(){
        println "La fecha de finalizacion del contrato temporal es ${formatoFecha.format(this.fechaFinContrato)}"
    }
}

class EmpleadoPermanente extends Empleado {
    private Date fechaFinPeriodoPrueba 

    EmpleadoPermanente(String nombre, String apellido, int salario, String fechaNacimiento, String fechaContratacion, String fechaFinPeriodoPrueba){
        super(nombre, apellido, salario, fechaNacimiento, fechaContratacion)
        this.fechaFinPeriodoPrueba = formatoFecha.parse(fechaFinPeriodoPrueba)
    }

    public void getFechaFinPeriodoPrueba(){
        println "La fecha de finalizacion del periodo de pruebas es ${formatoFecha.format(this.fechaFinPeriodoPrueba)}"
    }
}


// Crear instancias de EmpleadoTemporal y EmpleadoPermanente
def empleadoTemporal = new EmpleadoTemporal("Juan", "Pérez", 2000, "15/08/1985", "01/01/2022", "15/08/2022")
def empleadoPermanente = new EmpleadoPermanente("María", "López", 2500, "20/04/1990", "01/01/2019", "20/04/2022")

// Imprimir detalles de los empleados
println "Detalles del Empleado Temporal:"
empleadoTemporal.getNombre()
empleadoTemporal.getApellido()
empleadoTemporal.getSalario()
empleadoTemporal.getCumpleanios()
empleadoTemporal.getFechaContratacion()
empleadoTemporal.getFechaFinContrato()

println "\nDetalles del Empleado Permanente:"
empleadoPermanente.getNombre()
empleadoPermanente.getApellido()
empleadoPermanente.getSalario()
empleadoPermanente.getCumpleanios()
empleadoPermanente.getFechaContratacion()
empleadoPermanente.getFechaFinPeriodoPrueba()
