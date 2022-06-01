fun main() {
    println("Bem vindo ao Bytebank")

    for (i in 5..1){


    val titular: String = "Alex $i"
    val numeroConta: Int = 1000 + i
    var saldo = i +10


    println("Titular $titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")

    //testaCondicoes(saldo)
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0)
        println("conta é positiva")
    else if (saldo == 0.0)
        println("conta é neutra")
    else {
        println("conta é negativa")

    }
}
}