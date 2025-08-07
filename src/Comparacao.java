import java.util.Scanner;

public class Comparacao {
    private static final int PRIMEIRO_NUMERO = 10;
    private static final int SEGUNDO_NUMERO = 20;

    public static void main(String[] args) {
        compararNumeros(PRIMEIRO_NUMERO, SEGUNDO_NUMERO);
    }

    private static void compararNumeros(int primeiro, int segundo) {
        if (primeiro == segundo) {
            System.out.println("Os números " + primeiro + " e " + segundo + " são iguais!");
        } else {
            System.out.println("Os números " + primeiro + " e " + segundo + " são diferentes!");
        }
    }
}

class comparação2 {
    public static void main(String[] args) {
        int x, y;
        Scanner ler;

        System.out.println("Digite o valor que deseja comparar:");

        ler = new Scanner(System.in);
                x = ler.nextInt();

        System.out.println("O valor informado foi: " + x);

        System.out.println("Digite o valor de comparação: ");

        ler = new Scanner(System.in);
        y = ler.nextInt();

        System.out.println("O valor informado foi: " + y);

        if (x == y){
            System.out.println("O valor " + x + "é igual que o valor " + y);
        }
        else if (x > y) {
            System.out.println("O valor " + x + "é maior que o valor " + y);
        }
        else {
            System.out.println("O valor " + x + "é menor que o valor " + y);
        }
    }
}
