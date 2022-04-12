import java.util.Scanner;

public class App {
    public static void main(String[] args) {
     Scanner var = new Scanner(System.in);
     System.out.println("Digite um número: ");
     int num = var.nextInt();
     System.out.println("\n");
      for (int i = num; i <= num + 200 ; i = i + 2) {
          System.out.println(i);
      }
      var.close();  
    }
}
