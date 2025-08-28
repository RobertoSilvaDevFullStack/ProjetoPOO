package PE;

import java.util.Scanner;

public class MenuComWhile {

    private static final int MIN_OPCAO = 1;
    private static final int MAX_OPCAO = 4;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao = lerOpcaoValida(scanner);
            System.out.println("Operação selecionada: " + opcao);
        }
    }

    private static int lerOpcaoValida(Scanner scanner) {
        int opcao;
        do {
            exibirMenu();
            System.out.print("Informe a operação desejada: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número entre " + MIN_OPCAO + " e " + MAX_OPCAO + ".");
                System.out.print("Informe a operação desejada: ");
                scanner.next(); // descarta entrada inválida
            }
            opcao = scanner.nextInt();
            if (!opcaoValida(opcao)) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!opcaoValida(opcao));
        return opcao;
    }

    private static void exibirMenu() {
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
    }

    private static boolean opcaoValida(int opcao) {
        return opcao >= MIN_OPCAO && opcao <= MAX_OPCAO;
    }
}