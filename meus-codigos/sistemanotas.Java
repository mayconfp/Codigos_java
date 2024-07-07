package  fundamentos;
import javax.swing.JOptionPane;

public class SistemaNotasAlunos {
    public static void main(String[] args) {

        String nota1 = JOptionPane.showInputDialog("Digite 1° nota do aluno: ");
        String nota2 = JOptionPane.showInputDialog("Digite 2° nota do aluno: ");
        String nota3 = JOptionPane.showInputDialog("Digite 3° nota do aluno: ");
        String nota4 = JOptionPane.showInputDialog("Digite 4° nota do aluno: ");

        double numero1 = Double.parseDouble(nota1);
        double numero2 = Double.parseDouble(nota2);
        double numero3 = Double.parseDouble(nota3);
        double numero4 = Double.parseDouble(nota4);

        // calculo média de todas as notas

        double mediaQuatroUnidades = (numero1 + numero2 + numero3 + numero4) /4;

        // verificação se esta aprovado nas 4 notas

            if (mediaQuatroUnidades >= 7) {
                System.out.println("Aluno Aprovado em todas unidades com média: " + mediaQuatroUnidades);
            } else {
                double notanecessariaFinal = 7 - mediaQuatroUnidades;

                System.out.println("Nota necessária para final: " + notanecessariaFinal);

                // verifica prova final

                String notaFinal = JOptionPane.showInputDialog("Digite a nota da recuperação final: ");
                double resultadoFinal = Double.parseDouble(notaFinal);

                if (resultadoFinal >= notanecessariaFinal) {
                    System.out.println("Aluno aprovado na prova final com nota: "
                            + resultadoFinal);
                } else {
                    System.out.println("Aluno reprovado na prova final com nota: "
                            + resultadoFinal);
                }

            }
        }
    }
}


