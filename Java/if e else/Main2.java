import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner zx = new Scanner (System.in);

        System.out.println("Digite um valor: ");
        float x = zx.nextFloat();
        System.out.println("Digite outro valor: ");
        float z = zx.nextFloat();
        if (x>z) {
            System.out.println("O PRIMEIRO valor é maior que o SEGUNDO");
        } else {
            System.out.println("O SEGUNDO valor é maior que o PRIMEIRO");
        }
        zx.close();
    }
}
