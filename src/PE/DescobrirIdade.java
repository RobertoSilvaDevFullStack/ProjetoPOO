package PE;

import java.util.Scanner;

public class DescobrirIdade {
    public static void main(String[]args) {

        int idade;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor, informe sua idade: ");

        idade = leitura.nextInt();

        if (idade > 0 && idade <= 15) {
            System.out.println("A pessoa é menor de idade");
            System.out.println("E a idade informada foi:" + idade);
        }
        else if (idade >= 16 && idade <= 65) {
            System.out.println("A pessoa é maior de idade");
            System.out.println("E a idade informada foi:" + idade);
        }
        else if (idade >= 66 && idade <= 100) {
            System.out.println("A pessoa é maior de idade e tem direito a voto");
            System.out.println("E a idade informada foi:" + idade);
        }
        else {
            System.out.println("A idade deve ser maior que 0");

        }
    }
}
