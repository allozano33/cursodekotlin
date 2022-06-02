fun main() {
    println("Bem vindo ao Bytebank")
    val  contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0

    val  contaFran = Conta()
    contaFran.titular = "Alex"
    contaFran.numero = 1001
    contaFran.saldo = 201.0

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

}
class Conta{
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaLacos(){
    var i = 0
    while (i < 5){
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