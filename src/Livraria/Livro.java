package Livraria;

import java.util.Scanner;

public class Livro {

    //Propriedades ou atributos

    String titulo;
    String autor;
    String Categoria;
    int qtdPaginas;
    int ISBN;
    double preco;

    //Métodos ou OPERAÇÕES

    public Livro(){

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do livro: ");
        this.titulo = leitura.nextLine();

        System.out.println("Digite o autor do livro: ");
        this.autor = leitura.nextLine();

        System.out.println("Digite a categoria do livro: ");
        this.Categoria = leitura.nextLine();

        System.out.println("Digite o código do livro: ");
        this.ISBN = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Informe a quantidade de páginas do livro: ");
        this.qtdPaginas = leitura.nextInt();

        System.out.println("Informe o preço do livro: ");
        this.preco = leitura.nextDouble();

    }

    public void abrirLivro(){
        System.out.println("Livro aberto!");
    }

    public void fecharLivro(){
        System.out.println("Livro fechado!");
    }

    public void lerLivro(int p){
        System.out.println("Livro sendo lido!");
    }

    public void venderLivro(){
        System.out.println("Livro vendido!");
    }

    public void alterarPreco(double novopreco){
        this.preco = novopreco;
        System.out.println("O valor do livro foi alterado para: " + this.preco + "");
    }

    public void receberDesconto(int desconto){
        this.preco = this.preco - (this.preco * desconto/100);
        System.out.println("O valor do livro com desconto foi: " + this.preco + "");

    }

    public String mostrarLivro(){

        return ("\nTitulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nCategoria: " + this.Categoria +
                "\nQuantidade de Páginas: " + this.qtdPaginas +
                "\nISBN: " + this.ISBN +
                "\nPreço do livro: " + this.preco);

    }


}
