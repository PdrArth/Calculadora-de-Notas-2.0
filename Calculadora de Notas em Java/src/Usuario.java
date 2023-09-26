import java.util.Scanner;
import javax.swing.*;


public class Usuario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        var continuar = true;
        while (continuar) {
            Matricula conferir = new Matricula();
            Notas notasaluno = new Notas();
            conferir.matriculas();
            notasaluno.notas();
            notasaluno.soma();
            notasaluno.resultado();
            String escolhaString = JOptionPane.showInputDialog("Deseja fazer outra consulta?\nDigite 1 para continuar !\nOu qualquer outra tecla para sair");
            int escolha = Integer.parseInt(escolhaString);

            if (escolha == 1) {
                continuar = true;
            } else {
                JOptionPane.showMessageDialog(null, "Obrigado por usar nosso programa!");
                continuar = false;
            }

        }
    }
}