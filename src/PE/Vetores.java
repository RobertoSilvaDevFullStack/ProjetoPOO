package PE;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        String[] nomes = new String[4];
        Scanner leitura = new Scanner(System.in);

        //Leitura dos dados do meu vetor nomes

        for (int i = 0; i < 4; i++){
            System.out.println("Digite o nome do aluno: ");
            //String nome = leitura.nextLine();
            //nomes[i] = nome;
            nomes[i] = leitura.nextLine();
        }

        for (int i = 0; i < 4; i++){
            System.out.println("O nome da posição "+ i + " é: "+nomes[i]);
        }
    }
}
