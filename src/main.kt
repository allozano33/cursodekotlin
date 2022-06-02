fun main() {
    println("Bem vindo ao Bytebank")

    for (i in 1..5) { //ordem crescente
        for (i in 5 downTo 1) //ordem decrescente
            for (i in 5 downTo 1 step 2) { //decrescente de 2 em 2

                loop@ for (i in 1..100) {
                    println("i $i")
                    for (j in 1..100) {
                        println("j $j")
                        if (j == 5) break@loop
                    }
                }

                val titular: String = "Alex $i"
                val numeroConta: Int = 1000 + i
                var saldo = i + 10.0

                println("Titular $titular")
                println("número da conta $numeroConta")
                println("saldo da conta $saldo")
                println()

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
}