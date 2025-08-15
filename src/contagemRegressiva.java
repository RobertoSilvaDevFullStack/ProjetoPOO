
public class contagemRegressiva {

    public static void main(String[] args) throws InterruptedException {

        //Laço While

        int contador = 10;
        System.out.println("Laço While");
        while (contador >= 0) {
            System.out.println(contador);
            contador--;
            Thread.sleep(1000);
        }
        //System.out.println("Feliz Ano Novo");

        //Laço DO/While
        System.out.println("Laço DO/While");
        do {
            System.out.println("Feliz Ano Novo");
            //contador++;

        }
        while (contador >= 0);

        //Laço For

        System.out.println("Laço For");
        for (contador = 10; contador >= 0; contador--) {

            System.out.println(contador);
            Thread.sleep( 1000);
        }

        System.out.println("Feliz Ano Novo");
    }
}
