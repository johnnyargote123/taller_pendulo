package taller_5

class pendulo{
    private var cuerda: Double = 0.0
    private var aceleracion_pendulo: Double = 0.0



    // constructor------------------------------------------------------------------------------------------------------

    //para que son los constructores: para hacer llamados a la creacion e intanciacion de objetos
    constructor() //constructor primario
    constructor(cuerda:Double,aceleracion_pendulo:Double){
        this.cuerda = cuerda
        this.aceleracion_pendulo = aceleracion_pendulo
        // esto es para poder usar sus atributos
    }

    // analizadoras-----------------------------------------------------------------------------------------------------
    //para que sirven? : Para poder obtener el valor cuando creemos una instancia

    fun getLongitudCuerda() = this.cuerda
    fun getAceleracionPendulo() = this.aceleracion_pendulo


    //modificadoras-----------------------------------------------------------------------------------------------------
    // para cambiar el valor cuando se definicio un objeto

    fun setLongitudCuerda(nueva_longitud_cuerda: Double){
        if(nueva_longitud_cuerda != 0.0){
            this.cuerda = nueva_longitud_cuerda
        }
    }

    fun setAceleracionPendulo(nueva_aceleracion_pendulo: Double){
        if (aceleracion_pendulo != 0.0){
            this.aceleracion_pendulo = nueva_aceleracion_pendulo
        }
    }

    //Metodos de la funcion---------------------------------------------------------------------------------------------
    fun periodo_de_oscilacion():Double{
        val periodo = (2 * Math.PI)*(Math.sqrt(aceleracion_pendulo/cuerda))
        return  periodo
    }
}


//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

//Metodo 2

// DATA CLASS

// En este paso ya hizo contructor primario y constructor secundario , analizadoras

data class pendulo2(
     var longitud_cuerda :Double = 0.0,
      var aceleracion_pen :Double = 0.0
){
    // se realizan solamente las modificadoras

    //Modificadoras

    fun setlongitudcuerda(nueva_longitud_cuerda2: Double){
        if (longitud_cuerda != 0.0){
            this.longitud_cuerda = nueva_longitud_cuerda2
        }
    }

    fun setaceleracionpen(nueva_aceleracion_pen : Double){
        if (aceleracion_pen != 0.0){
            this.aceleracion_pen = nueva_aceleracion_pen
        }
    }

    // se crea el metodo correcpondiente

    //metodo

    fun perioOsila():Double{
        var peri = (2 * Math.PI)*(Math.sqrt(aceleracion_pen/longitud_cuerda))
        return peri
    }
}


fun main (){
    var x = pendulo(2.0,2.0)
    x.getAceleracionPendulo()
    x.getLongitudCuerda()
    var o =pendulo2(2.0,2.0)
    println("${o.perioOsila()}")
}