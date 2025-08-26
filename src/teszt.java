import java.util.Scanner;

public class teszt {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = leitura.nextInt();
        leitura.nextLine(); // consome o enter que ficou no buffer

        String[] nomes = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = leitura.nextLine(); // agora funciona normalmente
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.println("O nome da posição " + i + " é: " + nomes[i]);
        }
    }
}
