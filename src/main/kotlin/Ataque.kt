class Ataque(nombre:String, tipo:String, fuerza:Int) {

    var nombre = ""

    var tipo = ""

    var fuerza = 0
        get() = field
        set(value) {
            if (value<0) throw Exception("la has liao!!!!!11!!!!!!111!")
            field = value
        }

    init {
        this.nombre = nombre
        this.tipo = tipo
        this.fuerza = fuerza
    }

    override fun toString(): String {
        return "Soy el mejor ataque de todos! $nombre, tipo $tipo, con $fuerza de fuerza! "
    }

    fun tipoAtaca(tipo_enemigo: String){
        if (tipo in arrayOf("roca", "fuego"))
    }

}