import javax.swing.*;

public class Matricula {
    public void matriculas() {

        String nome = JOptionPane.showInputDialog("Por favor digite seu nome: ");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome ");

        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite sua matricula"));

        while (true) {
            int confimarmatricula = Integer.parseInt(JOptionPane.showInputDialog("Confirme sua matricula"));
            if (confimarmatricula == matricula) {
                String valido = String.format("Matricula correta. Acesso concedido", JOptionPane.CLOSED_OPTION);
                JOptionPane.showMessageDialog(null, "Matricula Correta.");

                break;
            } else {
                // String errado = String.format("Matricula Incorreta. Digite novamente");
                JOptionPane.showMessageDialog(null, "Matricula Incorreta. Digite novamente", "Erro", JOptionPane.ERROR_MESSAGE);


            }
        }

    }
}
