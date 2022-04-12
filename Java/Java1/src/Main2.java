import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
       
Scanner tempc = new Scanner(System.in);
System.out.println("\n Digite a temperatura em Celsius: ");
float temp = tempc.nextFloat();
double temc = (temp * 1.8 + 32);
System.out.println("\n A temperatura em Fahrenheit é: " + temc + "\n");
tempc.close();
    }
}