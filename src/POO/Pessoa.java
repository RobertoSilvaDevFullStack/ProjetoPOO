package POO;

public class Pessoa {
    //Propriedades ou atributos

    String nome;
    int idade;
    char sexo;

    //Metodos ou Operacoes
    public void definirNome(String n) { //Set
        this.nome = n;
    }

    public String obterNome() { //Get
        return this.nome;
    }

    public void definirIdade(int idade) {
        this.idade = idade;
    }

    public int obterIdade() {
        return this.idade;
    }

    public void definirSexo(char sexo) {
        this.sexo = sexo;
    }

    public String obterSexo() {
        if (this.sexo == 'M') {
            return "Masculino";
        }
        else{
            return "Feminino";
        }
    }

    public String imprimirDados() {
        return ("Nome: " + this.obterNome()
                + "\nSexo: " + this.obterSexo()
                + "\nIdade: " + this.obterIdade());
    }
}
