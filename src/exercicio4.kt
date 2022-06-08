fun main() {
    val music = Song("Tente Outra Vez", "Raul Seixas", 1978,1000)
    music.printDescription()
    println(music.isPopular)
}

class Song(
    val propriedadesDoTitulo: String,
    val artista: String,
    val anoPublicacao: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$propriedadesDoTitulo, Produzido por $artista, Foi Gravada em $anoPublicacao")
    }
}
