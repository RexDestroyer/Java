import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner dia = new Scanner (System.in);
        
        System.out.println("Digite um número de 1 a 7: ");
        int feira = dia.nextInt();
        if ((feira >= 1) && (feira <=7)){
            if (feira == 1) {
                System.out.println("O número 1 representa DOMINGO");
            } if (feira == 2) {
                System.out.println("O número 2 representa SEGUNDA");
            } if (feira == 3) {
                System.out.println("O número 3 representa TERÇA");
            } if (feira == 4) {
                System.out.println("O número 4 representa QUARTA");
            } if (feira == 5) {
                System.out.println("O número 5 representa QUINTA");
            } if (feira == 6) {
                System.out.println("O número 6 representa SEXTA");
            } if (feira == 7) {
                System.out.println("O número 7 representa SÁBADO");
            } 
        } else {
            System.out.println("Digite um valor válido! ");
        }
        dia.close();
    }
}
