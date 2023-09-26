import java.util.Scanner

fun Usuario() {
    val ler = Scanner(System.`in`)
    var continuar = true
    while (continuar) {
        val matricula = matriculas()
        val notas = Notas()
        while (true) {
            print(
                "Deseja fazer outra consulta\n" +
                        "[1] Para sim\n" +
                        "[2] Para sair\n" +
                        "-> "
            )
            var escolha = ler.nextInt()
            if (escolha == 1) {
                continuar = true
                break

            } else if (escolha == 2) {
                println("Obrigado por usar nosso codigo");
                continuar = false
                break

            } else {
                println("Digite uma opcao valida")

            }
        }

    }
}
