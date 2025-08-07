import java.util.Scanner;

public class MensagemDiaNoite {
    public static void main(String[] args) {


        int horaDoDia;
        String NomeSerHumano;
        Scanner leituraDoTeclado;

        System.out.println("Informe a hora de agora: ");
        leituraDoTeclado = new Scanner(System.in);
        horaDoDia = leituraDoTeclado.nextInt();

        System.out.println("Informe o seu Nome: ");
        leituraDoTeclado = new Scanner(System.in);
        NomeSerHumano = leituraDoTeclado.nextLine();


        if (horaDoDia >= 0 && horaDoDia <= 12) {
            System.out.println("Bom dia, " + NomeSerHumano + "!");
        }
        else if (horaDoDia >= 13 && horaDoDia <= 18) {
            System.out.println("Boa tarde, " + NomeSerHumano + "!");
        }
        else if (horaDoDia >= 19 && horaDoDia <= 23) {
            System.out.println("Boa noite, " + NomeSerHumano + "!");
        }
        else {}


    }
}

