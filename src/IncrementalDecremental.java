public class IncrementalDecremental {

    public static void main(String[] args) {

        int referencia;

        referencia = 100;

        System.out.println("O referencia foi: " + referencia);
        referencia++;
        System.out.println("O valor da referencia foi incrementado: " + referencia);
        referencia--;
        System.out.println("O valor da referencia foi decrementado: " + referencia);
        referencia+=10;
        System.out.println("O valor da referencia foi incrementado: " + referencia);
        referencia-=10;
    }
}
