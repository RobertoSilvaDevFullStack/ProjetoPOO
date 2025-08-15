import java.util.Scanner;

public class calculadoraComFuncoes {

    //Função com retorno que exibe o menu e retorna a opção do usuário
    public static int exibirMenu() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("---Calculadora Simples---");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Sair");
        System.out.println("Escolha uma opção: ");

        return leitor.nextInt();
    }

    public static void somar(double num1, double num2) {
        System.out.println("Resultado da soma: " + (num1 + num2));
    }

    public static void subtracao(double num1, double num2) {
        System.out.println("Resultado da subtração: " + (num1 - num2));
    }

    public static void multiplicacao(double num1, double num2) {
        System.out.println("Resultado da multiplicação: " + (num1 * num2));
    }

    public static void divisao(double num1, double num2) {
        if (num2 != 0) {
            System.out.println("Resultado da divisao: " + (num1 / num2));
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        double num1, num2;

        do {
            opcao = exibirMenu();

            System.out.println("Digite o primeiro número: ");
            num1 = leitor.nextDouble();
            System.out.println("Digite o segundo número: ");
            num2 = leitor.nextDouble();

            switch (opcao) {
                case 1:
                    somar(num1, num2);
                    break;
                case 2:
                    subtracao(num1, num2);
                    break;
                case 3:
                    multiplicacao(num1, num2);
                    break;
                case 4:
                    divisao(num1, num2);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println();

        } while (opcao != 5);

        System.out.println("Obrigado por usar a calculadora.");
        leitor.close();
    }

}
