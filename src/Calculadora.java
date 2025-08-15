import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        //variveis
        double num1, num2, resultado;
        int operacao;

        String resultadoFormatado;

        Scanner leitura = new Scanner(System.in);

        //valores
        System.out.println("Digite o primeiro valor: ");
        num1 = leitura.nextDouble();

        System.out.println("Digite o segundo valor: ");
        num2 = leitura.nextDouble();

        //Mostra um "menu" de opções para cálculo
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.println("Informe a operação desejada: ");
        operacao = leitura.nextInt();

        //Agora execulta a operação escolhida pelo usuário e mostra o resultado

        if (operacao == 1) {
            System.out.println("O resultado da soma é: " + (num1 + num2));
        }
        else if (operacao == 2) {
            System.out.println("O resultado da subtração é: " + (num1 - num2));
        }
        else if (operacao == 3) {
            System.out.println("O resultado da multiplicação é: " + (num1 * num2));
                    }
        else {
            if (num2 == 0)
                System.out.println("Imposssível dividir por zero");
            else {
                System.out.println("O resultado da divisão é: " + (num1 / num2));
                //Formata o número para 2 casas decimais
                resultadoFormatado = String.format("%.2f", (num1 / num2));
                //exibe o valor correto
                System.out.println(num1 / num2);
                // tipos de arredondamentos
                System.out.println(Math.round(num1 / num2));
                System.out.println(Math.round((num1 / num2)*1000f)/1000f);

            }
        }
    }
}
