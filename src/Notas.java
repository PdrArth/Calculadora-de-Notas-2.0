import javax.swing.*;
import java.util.Scanner;

public class Notas {
    Scanner ler = new Scanner(System.in);

    final double aprovado = 59.95;
    final double recuperacao = 59.94;
    final double reprovado = 29.94;
    int soma = 0;

    public void notas() {
        final double aprovado = 59.95;
        final double recuperacao = 59.94;
        final double reprovado = 29.94;
        String computado = " ";
        JOptionPane.showMessageDialog(null, "AVISO. So aceitamos notas maiores que 0 e menores  do que 20", "Erro", JOptionPane.ERROR_MESSAGE);

        for(int i = 1; i<=4 ; i++) {
            int nota;

            while (true) {
                nota = Integer.parseInt(JOptionPane.showInputDialog("Digite sua nota " + i + ":"));
                if (nota < 0 || nota > 20) {

                    JOptionPane.showMessageDialog(null, "Nota fora do intervalo de (a a 20). Tente novamente.");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Nota computada");
                break;
                }

                soma += nota;

            }
        }
    }

    public void soma() {
        String somas = String.format("Sua nota eh %d ", soma);
        JOptionPane.showMessageDialog(null, somas);
    }

    public void resultado() {
        if (soma >= aprovado) {
            String aprovado = String.format("Voce foi aprovado!");
            JOptionPane.showMessageDialog(null, aprovado);

        } else if (soma <= recuperacao && soma > reprovado) {
            var notanecessaria = 120 - soma;
            String recuperacao = String.format("Voce esta de prova final!\nVoce precisa tirar na prova final %d pontos", notanecessaria);
            JOptionPane.showMessageDialog(null, recuperacao);
        } else if (soma <= reprovado) {
            String reprovado = String.format("Voce foi reprovado.");
            JOptionPane.showMessageDialog(null, reprovado);
        }

    }


}
