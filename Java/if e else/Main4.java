import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner fds = new Scanner (System.in);

        System.out.println("Digite o PRIMEIRO valor: ");
        int num1 = fds.nextInt();
        System.out.println("Digite o SEGUNDO valor: ");
        int num2 = fds.nextInt();
        System.out.println("Digite o TERCEIRO valor: ");
        int num3 = fds.nextInt();

        if ((num1 > num2 ) && (num1 > num3)){
            System.out.println("O PRIMEIRO número é o maior");
        } if ((num2 > num1 ) && (num2 > num3)){
            System.out.println("O SEGUNDO número é o maior"); 
        } if ((num3 > num1 ) && (num3 > num2)){
            System.out.println("O TERCEIRO número é o maior");
        }

        fds.close();
    }
}
