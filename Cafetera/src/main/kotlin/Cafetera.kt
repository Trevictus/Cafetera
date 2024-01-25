class Cafetera (val ubicacion: String ){

    var capacidad: Int = 1000
    var cantidad: Int = 0
    constructor(ubicacion: String, capacidad: Int): this(ubicacion){
        this.cantidad = this.capacidad
    }
    constructor(ubicacion: String, capacidad: Int, cantidad: Int): this(ubicacion){
        if (cantidad > capacidad){
            this.cantidad = capacidad
        }
        else {
            this.cantidad = cantidad
        }
    }

    fun llenar(){
        this.cantidad = this.capacidad
    }
    fun servirTaza(){
        var taza = 0
        if (cantidad > 0){
            if (cantidad < taza){
                cantidad = 0
                taza = taza + 1
            }
            if (cantidad > taza){
                cantidad = cantidad - taza
                taza = taza + 1
            }
        }
    }
    fun vaciar(){
        cantidad = 0
    }
    fun agregarCafe(){
    val cantidad = 200
        if (cantidad + this.cantidad > capacidad){
            capacidad = this.cantidad
}
        if (cantidad + this.cantidad < capacidad){
            this.cantidad = this.cantidad + cantidad
        }
    }

    override fun toString(): String {
        return "Cafetera en ${ubicacion}, ${capacidad}c.c., ${cantidad}c.c.)"
    }
}

class Taza(var color: String = "Blanco", val capacidad: Int = 50, var cantidad: Int = 0){
    init {
        if (cantidad > capacidad){
            cantidad = capacidad
        }
    }
    fun llenarTaza(){
        this.cantidad = capacidad
    }
}
