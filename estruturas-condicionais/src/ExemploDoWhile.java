import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            // executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
        }while(tocando());
        System.out.println("Alô !!!");

        int num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
        } while (count <= 3);
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return ! atendeu;
    }
}
