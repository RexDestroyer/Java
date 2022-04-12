import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
Scanner area = new Scanner(System.in);
System.out.println("\n Digite um lado: " + "\n");
float lado1 = area.nextFloat();
System.out.println("\n Digite o outro lado: " + "\n");
float lado2 = area.nextFloat();
System.out.println("A área do retângulo é: " + lado1*lado2 + "\n");
area.close();
    }
}


