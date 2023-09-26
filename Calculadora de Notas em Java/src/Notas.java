import javax.swing.*;

public class Notas {
    int nota1 = 0;
    int nota2 = 0;
    int nota3 = 0;
    int nota4 = 0;
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

        while (true) {
            nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua primeira nota"));
            if (nota1 >= 0 && nota1 <= 20) {
                String valido = String.format("Nota computada");
                break;
            } else if (nota1 < 0) {
                String mensagem = String.format("Nota abaixo do valor do semestre.\nDigite novamente");
                JOptionPane.showMessageDialog(null, mensagem);
            } else if (nota1 > 20) {
                String mensagem = String.format("Nota acima do limite do semestre.\nDigite novamente");
                JOptionPane.showMessageDialog(null, mensagem);
            }

        }
        computado = String.format("nota computada");
        JOptionPane.showMessageDialog(null, computado
        );
        while (true) {
            nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua segunda nota"));
            if (nota2 >= 0 && nota2 <= 20) {
                String valido = String.format("Nota computada");
                break;
            } else if (nota2 < 0) {
                String mensagem = String.format("Nota abaixo do valor do semestre.\nDigite novamente");
                JOptionPane.showMessageDialog(null, mensagem);
            } else if (nota2 > 20) {
                String mensagem = String.format("Nota acima do limite do semestre.\nDigite novamente");
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }
        computado = String.format("nota computada");
        JOptionPane.showMessageDialog(null, computado);
        while (true) {
            nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua terceira nota"));
            if (nota3 >= 0 && nota3 <= 20) {
                String valido = String.format("Nota computada");
                break;
            } else if (nota3 < 0) {
                String mensagem = String.format("Nota abaixo do valor do semestre.\nDigite novamente");
                JOptionPane.showMessageDialog(null, mensagem);
            } else if (nota3 > 20) {
                String mensagem = String.format("Nota acima do limite do semestre.\nDigite novamente");
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }
        computado = String.format("nota computada");
        JOptionPane.showMessageDialog(null, computado);
        while (true) {
            nota4 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua quarta nota"));
            if (nota4 >= 0 && nota4 <= 20) {
                String valido = String.format("Nota computada");
                break;
            } else if (nota4 < 0) {
                String mensagem = String.format("Nota abaixo do valor do semestre.\nDigite novamente");
                JOptionPane.showMessageDialog(null, mensagem);
            } else if (nota4 > 20) {
                String mensagem = String.format("Nota acima do limite do semestre.\nDigite novamente");
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }
        computado = String.format("nota computada");
        JOptionPane.showMessageDialog(null, computado
        );


    }

    public void soma() {
        soma = nota1 + nota2 + nota3 + nota4;
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
