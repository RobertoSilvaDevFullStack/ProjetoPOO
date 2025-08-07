import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {

        double media = 0;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor, informe a MEDIA do aluno: ");
        media = leitura.nextDouble();

        if (media <= 4.0 ) {
            System.out.println("O aluno foi reprovado!");
        }
        else if ((media >= 4) && (media <= 6)){
            System.out.println("O aluno está de recuperação!");
        }
        else {
            System.out.println("O aluno foi aprovado!");

        }

    }
}
