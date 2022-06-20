package taller_5

data class Ascensor(
    var n_pisos_edificio:Int = 0,
    var n_sotanos_edificio:Int = 0,
    var piso_actual: Int = 0
){

    // Analizadoras

    fun get_N_pisos_edificio() = this.n_pisos_edificio
    fun get_N_sotanos_edificio() = this.n_sotanos_edificio
    fun get_piso_actual() = this.piso_actual

    //Modificadores

    fun set_N_pisos_edificio(nuevo_n_pisos_edificio: Int) {
        if (n_pisos_edificio != 0){
            this.n_pisos_edificio = nuevo_n_pisos_edificio
        }
    }

    fun set_N_sotanos_edificio(nuevo_n_sotanos_edificio: Int) {
        if (n_sotanos_edificio != 0){
            this.n_sotanos_edificio = nuevo_n_sotanos_edificio
        }
    }
    fun set_piso_actual(nuevo_piso_actual: Int) {
        if (piso_actual != 0){
            this.piso_actual = nuevo_piso_actual
        }
    }


    //metodos
    //------------------------------------------------------------------------------------------------------------------

    //metodo 1
    fun subir_piso(piso_actual:Int):Int{
        //require(piso_actual != 0)
        var piso_nuevo = piso_actual
        if (piso_actual <= n_pisos_edificio){
            piso_nuevo =  piso_actual + 1

        }
        if (piso_actual == -1){
            piso_nuevo =  piso_actual + 2

        }
        set_piso_actual(piso_nuevo)
        return piso_nuevo

    }

    fun bajar_piso(piso_actual: Int):Int{
        //require(piso_actual != 0)
        var piso_nuevo = piso_actual
        if (piso_actual <= n_pisos_edificio){
            piso_nuevo = piso_actual - 1
        }
        if (piso_actual == 1){
            piso_nuevo = piso_actual - 2
        }
        set_piso_actual(piso_nuevo)
        return piso_nuevo
    }

    fun total_pisos(n_pisos_edificio: Int,n_sotanos_edificio:Int):Int{
        var capacidad_ascensor_pisos = n_pisos_edificio +n_sotanos_edificio

        return capacidad_ascensor_pisos
    }

}
fun main(){
    //Entrada de datos -------------------------------------------------------------------------------------------------

    println("ingresa el numero de pisos del edificio: ")
    val n_pisos_edificio = readln()!!.toInt()

    println("ingrese el numero de sotanos: ")
    val n_sotanos_edificio = readln()!!.toInt()

    println("ingrese piso en el que esta: ")
    val piso_actual = readln()!!.toInt()

    println("desea ascender o descender? :")
    val decision = readln()!!.toString()

    //Pasar valores a la clase -----------------------------------------------------------------------------------------

        var e = Ascensor(n_pisos_edificio,n_sotanos_edificio,piso_actual)

    //Visualizar datos iniciales----------------------------------------------------------------------------------------

        println("Estos son los datos iniciales")
        println("${e}") // visualizar dato entrada
        println()

    //Condición si el piso es igual a 0 --------------------------------------------------------------------------------

        if (e.piso_actual == 0){
            println("El piso actual debe ser diferente de 0")
        }

    //Condición si el piso es mayor al numero de pisos -----------------------------------------------------------------

        if (e.piso_actual > e.n_pisos_edificio){
            println("Estas en un piso imaginario!")
        }

    // Nuevo piso Ascender ---------------------------------------------------------------------------------------------

       if(e.piso_actual < e.n_pisos_edificio && decision == "ascender"){
            println()
            println()
            e.subir_piso(piso_actual)
            println( "Ahora estas en el piso: ${e.get_piso_actual()}") // visualizar dato salida
            println()
            println("Se actualizaron sus datos: ${e}") // visualizar dato salida
            println()
            println()
            println()
            println()
            println("Su ascensor puede atender un maximo de: ${e.total_pisos(n_pisos_edificio,n_sotanos_edificio)}" )
        }
    //Nuevo piso Descender ---------------------------------------------------------------------------------------------
        if(e.piso_actual < e.n_pisos_edificio && decision == "descender"){
            println()
            println()
            e.bajar_piso(piso_actual)
            println( "Ahora estas en el piso: ${e.get_piso_actual()}") // visualizar dato salida
            println()
            println("Se actualizaron sus datos: ${e}") // visualizar dato salida
            println()
            println()
            println()
            println()
            println("Su ascensor puede atender un maximo de: ${e.total_pisos(n_pisos_edificio,n_sotanos_edificio)}" )
        }


}
