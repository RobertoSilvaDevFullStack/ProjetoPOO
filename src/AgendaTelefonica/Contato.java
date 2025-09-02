package AgendaTelefonica;

public class Contato {

    String nome;
    String telefone1;
    String telefone2;
    String email;
    String linkedIn;
    String instagram;
    String apelido;


    public Contato(String n, String t1, String e){

        this.nome = n;
        this.telefone1 = t1;
        this.email = e;
    }

    public void setTelefone2(String t2) {
        this.telefone2 = t2;
    }

    public void setInstagram(String i) {
        this.instagram = i;
    }

    public void setLinkedln(String l) {
        this.linkedIn = l;
    }

    public void setApelido(String a) {
        this.apelido = a;
    }

    public void mostrarContato(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone 1: " + this.telefone1);
        System.out.println("Telefone 2: " + this.telefone2);
        System.out.println("Email: " + this.email);
        System.out.println("Linkedln: " + this.linkedIn);
        System.out.println("Instagram: " + this.instagram);
        System.out.println("Apelido: " + this.apelido);
    }
}
