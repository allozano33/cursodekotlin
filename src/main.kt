fun main() {
    println("Bem vindo ao Bytebank")
    val contaAlex = Conta("Alex", 1001)
    contaAlex.deposita(230.0)

    val contaFran = Conta("Fran", 1002)
    contaFran.deposita(234.0)
    contaFran.saca(22.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)
}

class Conta(var titular: String, val numero: Int = 0) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (saldo >= 0)
            this.saldo += valor
    }


    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroX $numeroY")

    val contaJoao = Conta("João", 1003)

    val contaMaria = Conta("Maria", 1004)


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