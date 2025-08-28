package POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        String n;
        int idade;
        char sexo;

        Scanner sc = new Scanner(System.in);

        /*p1.nome = "Roberto";
        p1.idade = 37;
        p1.sexo = 'M';*/
        /*p2.nome = "Janice";
        p2.idade = 34;
        p2.sexo = 'F';*/

        /*System.out.println("O nome da primeira pessoa cadastrada é: " + p1.nome);
        System.out.println("O sexo da primeira pessoa cadastrada é: " + p1.sexo);
        System.out.println("A idade da primeira pessoa cadastrada é: " + p1.idade + " anos");

        System.out.println("O nome da segunda pessoa cadastrada é: " + p2.nome);
        System.out.println("O sexo da segunda pessoa cadastrada é: " + p2.sexo);
        System.out.println("A idade da segunda pessoa cadastrada é " + p2.idade + " anos");*/

        System.out.println("Informe o nome da pessoa: ");
        n = sc.nextLine();
        p1.definirNome(n);
        System.out.println("Informe a idade da pessoa: ");
        p1.definirIdade(sc.nextInt());
        System.out.println("Informe o sexo da pessoa: ");
        p1.definirSexo(sc.next().charAt(0));

        System.out.println("O nome informado foi: " + p1.obterNome());
        System.out.println("A idade informada foi: " + p1.obterIdade());
        System.out.println("O sexo informado foi: " + p1.obterSexo());
    }
}
