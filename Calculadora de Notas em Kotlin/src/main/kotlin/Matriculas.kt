import java.util.Scanner

fun matriculas() {
    val ler = Scanner(System.`in`)
    var nome = print("Digite seu nome - > ")
    val leituranome = ler.nextLine()
    var sobrenome = print("Digite seu sobrenome -> ")
    val leiturasobrenome = ler.next()
    var matricula = print("Digite sua matricula -> ")
    var leituramatricula = ler.nextInt()
    while (true) {
        var confirmamatricula = print("Confirme sua matricula -> ")
        var lerconfirmacao = ler.nextInt()
        if (leituramatricula == lerconfirmacao) {
            println("\u001b[32mAcesso concedido \u001B[0m")
            println("Bem vindo(a) ${leituranome.uppercase()} ${leiturasobrenome.uppercase()}")
            break
        } else
            println("\u001B[31mMatricula incorreta digite novamente \u001B[0m")


    }

}