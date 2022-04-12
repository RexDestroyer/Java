import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
       
Scanner scantxt = new Scanner(System.in);
System.out.println("\n Digite um texto: ");
String text1 = scantxt.nextLine();
System.out.println("\n O texto inserido tem o tamanho de: " + text1.length());
scantxt.close();
   
  }
}
