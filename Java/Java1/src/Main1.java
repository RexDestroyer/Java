import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
       
Scanner area = new Scanner(System.in);
System.out.println("\n Digite o valor da base: ");
float base = area.nextFloat();
System.out.println("\n Digite o valor da altura: ");
float altura = area.nextFloat();
System.out.println("\n A área do triângulo é: " + (base*altura)/2 + "\n");
area.close();
    }
}