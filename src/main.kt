fun main() {
    println("Bem vindo ao Bytebank")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.setSaldo(200.0)

    val contaFran = Conta()
    contaFran.titular = "Alex"
    contaFran.numero = 1001
    contaFran.setSaldo(-601.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.getSaldo())

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.getSaldo())

//    println("depositando na conta do Alex")
//    contaAlex.deposita(50.0)
//    println(contaAlex.saldo)
//
//    println("depositando na conta da fran")
//    contaFran.deposita(70.0)
//    println(contaFran.saldo)
//
//    println("sacando na conta do Alex")
//    contaAlex.saca(250.0)
//    println(contaAlex.saldo)
//
//    println("sacando na conta da Fran")
//    contaFran.saca(100.0)
//    println(contaFran.saldo)
//
//    println("Transferencia da conta da Fran para o Alex ")

//    if (contaFran.transfere(500.0, contaAlex)){
//        println("Transferencia bem Sucedida")
//        }else {
//
//        println("Falha na Transferencia")
//    }

}

class Conta {
    var titular = ""
    var numero = 0
    var informacao = "saldo negativo"
    private var saldo = 0.0

    fun deposita(valor: Double) {
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

    fun getSaldo(): Double{
        return saldo
    }

    fun setSaldo(valor: Double){
        if(valor > 0){
        saldo = valor
    }
        else{
           println(informacao)
        }
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