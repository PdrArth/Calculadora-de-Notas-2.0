import java.util.Scanner

fun Notas() {
    var ler = Scanner(System.`in`)
    val aprovado = 59.95
    val recuperacao = 59.94
    val reprovado = 29.94
    var soma = 0.0
    fun Digitarnotas() {
        println("\u001B[31mSo aceitamos notas maiores que 0 e menores que 20 \u001B[0m")
        println("\u001B[31mPOR FAVOR DIGITE O VALOR COM VIRGULA NAO COM PONT0 \u001B[0m")
        for (i in 1..4) {
            var notas = 0.0
            while (true) {
                var nota = print("Digite sua $i -> ")
                notas = ler.nextDouble()
                val errodigitacao = notas?.toFloat() ?: 0.0
                if (notas < 0.0 || notas > 20.0) {
                    println("Nota fora do intervalor. Digite novamente")
                } else {
                    println("Nota Computada")
                    soma += notas
                    break
                }

            }
        }
    }

    Digitarnotas()

    fun imprimirsoma() {
        println("Sua nota eh $soma")
    }
    imprimirsoma()
    fun resultado() {
        if (soma >= aprovado) {
            println("\u001B[32mVoce foi aprovado. \u001B[0m ")
        } else if (soma <= recuperacao && soma > reprovado) {
            var notaparafinal = 120 - soma
            println("\u001B[33mVoce esta de prova final. \u001B[0m")
            println("Tire na prova nota igual ou superior a $notaparafinal para ser aprovado")
        } else if (soma <= reprovado) {
            println("\u001B[31mVoce esta reprovado \u001B[0m")
        } else {
            println("Nao sei o que dizer")
        }


    }
    resultado()

}