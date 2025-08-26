import java.util.Scanner;

public class calculadoraComFuncoes {

    private static final Scanner LEITOR = new Scanner(System.in);
    private static double num1;
    private static double num2;

    // Exibe o menu e retorna a opção
    public static int exibirMenu() {
        System.out.println("---Calculadora Simples---");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Sair");
        System.out.println("6. Alterar Números");
        System.out.print("Escolha uma opção: ");
        while (!LEITOR.hasNextInt()) {
            System.out.print("Entrada inválida. Escolha uma opção numérica: ");
            LEITOR.next();
        }
        return LEITOR.nextInt();
    }

    public static void somar(double a, double b) {
        System.out.println("Resultado da soma: " + (a + b));
    }

    public static void subtracao(double a, double b) {
        System.out.println("Resultado da subtração: " + (a - b));
    }

    public static void multiplicacao(double a, double b) {
        System.out.println("Resultado da multiplicação: " + (a * b));
    }

    public static void divisao(double a, double b) {
        if (b != 0) {
            System.out.println("Resultado da divisao: " + (a / b));
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
    }

    public static void LerNumeros() {
        System.out.print("Digite o primeiro número: ");
        while (!LEITOR.hasNextDouble()) {
            System.out.print("Entrada inválida. Digite um número: ");
            LEITOR.next();
        }
        num1 = LEITOR.nextDouble();

        System.out.print("Digite o segundo número: ");
        while (!LEITOR.hasNextDouble()) {
            System.out.print("Entrada inválida. Digite um número: ");
            LEITOR.next();
        }
        num2 = LEITOR.nextDouble();
    }

    public static void main(String[] args) {
        System.out.println("=== CALCULADORA ===");
        // Lê números inicialmente
        LerNumeros();

        int opcao;
        do {
            opcao = exibirMenu();

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
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                case 6:
                    LerNumeros(); // altera os números
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println();

        } while (opcao != 5);

        System.out.println("Obrigado por usar a calculadora.");
        LEITOR.close();
    }

}
