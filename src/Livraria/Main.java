package Livraria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TUDO O QUE FOR ESCRITO AQUI VAI SER EXECUTADO COMO PROGRAMA.

        Estante estante;
        int tamanhoEstante;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o tamanho da estante: ");
        tamanhoEstante = leitura.nextInt();

        estante = new Estante(tamanhoEstante);
        
        // 1. Chama o método da Estante para preenchê-la
        estante.preencherEstante();
        
        System.out.println("\n----- RELATÓRIO DE LIVROS NA ESTANTE -----");
        // 2. Chama o método da Estante para exibir seu conteúdo
        estante.exibirEstante();
        System.out.println("-----------------------");

    }
}
