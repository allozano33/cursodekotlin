fun main() {
    println("Bem vindo ao Bytebank")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Alex"
    contaFran.numero = 1001
    contaFran.saldo = 201.0

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)


    println("depositando na conta do Alex")
    deposita(contaAlex, 50.0)
    println(contaAlex.saldo)
    println("depositando na conta da fran")
    deposita(contaFran, 70.0)
    println(contaFran.saldo)
}

    fun deposita(conta: Conta, valor: Double){
        conta.saldo += valor

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroX $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"

    val contaMaria = Conta()
    contaMaria.titular = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

}

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }
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


//for (i in 5 downTo 1) {
//    val titular: String = "Alex $i"
//    val numeroConta: Int = 1000 + i
//    var saldo = i + 10.0
//
//    println("Titular $titular")
//    println("número da conta $numeroConta")
//    println("saldo da conta $saldo")
//    println()
//}