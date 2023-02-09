class Pokemon(id:Int, nombre:String, vida:Int, tipo:String) {

    var id : Int = id
        get() = field
        set(value) {
            if (id < 0){
                throw Exception("El id no puede ser menor que 0")
            }
            field = value
        }
    var nombre : String = ""

    var vida : Int = 0
        set(value) {
            if (field <= 0) throw Exception("tas morido")
        }

    var tipo :String = ""

    init {
        this.id = id
        this.nombre = nombre
        this.vida = vida
        this.tipo = tipo
    }

    override fun toString(): String {
        return "Hola, mi nombre es $nombre, y tengo $vida de vida, y soy de tipo $tipo"
    }

}