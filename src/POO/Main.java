package POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        String n;
        int idade;
        char s;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome da pessoa: ");
        n = sc.nextLine();
        p1.definirNome(n);

        System.out.println("Informe a idade da pessoa: ");
        n = sc.nextLine();
        idade = Integer.parseInt(n);
        p1.definirIdade(idade);

        System.out.println("Informe o sexo da pessoa: ");
        n = sc.nextLine();
        s = n.charAt(0);
        p1.definirSexo(s);

        n = p1.imprimirDados();

        System.out.println(n);

    }
}
