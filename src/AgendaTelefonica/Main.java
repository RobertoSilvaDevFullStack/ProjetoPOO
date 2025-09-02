package AgendaTelefonica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Contato CadastrarContato() {

        String nome, telefone, email;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do contato a ser salvo: ");
        nome = sc.nextLine();
        System.out.println("Digite o telefone do contato a ser salvo: ");
        telefone = sc.nextLine();
        System.out.println("Digite o email do contato a ser salvo: ");
        email = sc.nextLine();

        return new Contato(nome, telefone, email);
    }

    public static void main(String[] args) {

        ArrayList<Contato> agenda = new ArrayList<>();

        //tipo, nome da variável (reserva de espaço na memória) -- DECLARANDO AS VARIÁVEIS E OBJETOS QUE VOU USAR!
        Scanner sc = new Scanner(System.in);
        //Contato novoContato = CadastrarContato();
        //agenda.add(novoContato); //Adiciona um novo contato à lista de contatos
        System.out.println("Agenda Telefônica Iniciada! ");
        //Instanciar um objeto é criar ele na área da memória já reservada na declaração acima!
        //c = new Contato("Roberto", "123456789", "a@a.com");

        /*c1 = CadastrarContato();
        System.out.println("Contato cadastrado com sucesso!");
        c1.mostrarContato();
        System.out.println("---------------------------------------");


        c1.setTelefone2("123456789");
        c1.setInstagram("@roberto");
        c1.setLinkedln("roberto.com");

        c1.mostrarContato();
        System.out.println("---------------------------------------");

        c2 = CadastrarContato();
        c2.mostrarContato();*/

        while (true) {
            System.out.println("\n---MENU---");
            System.out.println("1 - Cadastrar Contato");
            System.out.println("2 - Listar Contatos");
            System.out.println("3 - Buscar Contato");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    Contato novoContato = CadastrarContato();
                    agenda.add(novoContato);
                    System.out.println("Contato cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("\n---LISTA DE CONTATOS---");
                    if (agenda.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado!");
                    } else {
                        for (Contato c : agenda) {
                            c.mostrarContato();
                            System.out.println("--------------------------");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    sc.close();
                    return;
                case 4:
                    System.out.println("Digite o nome do contato a ser buscado: ");
                    String nomeBusca = sc.nextLine();
                    boolean achou = false;
                    for (Contato c : agenda) {
                        if (c.nome.equalsIgnoreCase(nomeBusca)) {
                            System.out.println("\n--- CONTATO ENCONTRADO ---");
                            c.mostrarContato();
                            achou = true;
                            break;
                        }

                    }
                    if (!achou) {
                        System.out.println("Contato com o nome " + nomeBusca + "não encontrado!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }


    }

}
