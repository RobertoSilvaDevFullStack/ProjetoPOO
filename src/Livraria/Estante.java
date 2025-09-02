package Livraria;

public class Estante {

    Livro[] livros;

    public Estante(int tamanho) {
        this.livros = new Livro[tamanho];
    }

    public void exibirEstante(){

        for (int i = 0; i < livros.length; i++){
            // Adicionamos uma verificação para não dar erro se um espaço estiver vazio
            if (this.livros[i] != null) {
                System.out.println("Livro " + (i + 1) + ": " + livros[i].mostrarLivro());
            } else {
                System.out.println("Livro " + (i + 1) + ": [Vazio]");
            }
        }
    }
    

    public void preencherEstante(){
        // O laço percorre cada posição do array de livros da estante
        for (int i = 0; i < this.livros.length; i++){
            System.out.println("\n--- Cadastro do Livro " + (i + 1) + " ---");
            // 1. Cria um novo livro
            Livro novoLivro = new Livro();
            // 2. Adiciona o livro criado na posição correta da estante
            this.livros[i] = novoLivro;
        }
    }
}
