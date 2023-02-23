class Pokemon(id:Int, nombre:String, vida:Int, tipo:Tipo) {

    var tipo :Tipo

    var movimientos = arrayOf("", "", "", "")
    var id : Int = id
        get() = field
        set(value) {
            if (id < 0){
                throw Exception("El id no puede ser menor que 0")
            }
            field = value
        }
    var nombre : String = ""

    var vida : Double = 0.0
        set(value) {
            if (field <= 0) throw Exception("tas morido") else field = value
        }



    init {
        this.id = id
        this.nombre = nombre
        this.vida = vida.toDouble()
        this.tipo = tipo
    }

    override fun toString(): String {
        return "Hola, mi nombre es $nombre, y tengo $vida de vida, y soy de tipo $tipo"
    }

    fun recibirDanio(ataque: Ataque){
        vida -= (ataque.fuerza)*(tipo.efectividad(ataque.tipo))
    }

}