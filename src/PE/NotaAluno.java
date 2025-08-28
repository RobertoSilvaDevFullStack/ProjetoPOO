package PE;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {

        double nota1, nota2, nota3, nota4, media;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = leitura.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = leitura.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = leitura.nextDouble();

        System.out.println("Digite a quarta nota: ");
        nota4 = leitura.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média do aluno é: " + media);


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
