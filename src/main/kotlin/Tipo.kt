class Tipo(tipo:String) {

    var tipo = tipo
        set(value) {
            if (value in arrayOf("acero", "agua", "bicho", "dragon", "electrico", "fantasma", "fuego",
                    "hada", "hielo", "lucha", "normal", "planta", "psiquico", "roca", "siniestro", "tierra",
                    "veneno", "volador")) field = value else {
                        field = ""
                        IllegalArgumentException("el tipo no es válido")
                    }
        }

}