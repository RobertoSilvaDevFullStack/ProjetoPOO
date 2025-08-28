package PE;

import java.util.Scanner;

public class CalculadoraSwitchCase {
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

        switch (operacao){
            case 1:
                resultadoFormatado = String.format("%.2f", (num1 + num2));
                System.out.println("O resultado da soma é:" + resultadoFormatado);
                break;
            case 2:
                resultadoFormatado = String.format("%.2f", (num1 - num2));
                System.out.println("O resultado da subtração é:" + resultadoFormatado);
                break;
            case 3:
                resultadoFormatado = String.format("%.2f", (num1 * num2));
                System.out.println("O resultado da multiplicação é:" + resultadoFormatado);
                break;
            case 4:
                if (num2 == 0)
                    System.out.println("Impossível dividir por zero");
                else {
                    //formata o número para 2 casas decimais
                    resultadoFormatado = String.format("%.2f", (num1 / num2));
                    System.out.println("O resultado da divisão é:" + resultadoFormatado);
                    // exibe o valor correto
                    System.out.println(num1 / num2);
                    // tipos de arredondamentos
                    System.out.println(Math.round((num1 / num2)*1000f)/1000f);
                    System.out.println(Math.round(num1 / num2));
                }
                break;

            default:
                System.out.println("Você escolheu a opção inválida");
                break;

        }
    }
}
