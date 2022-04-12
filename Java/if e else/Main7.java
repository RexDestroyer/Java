import java.util.Scanner;

public class Main7 {
    public static void main(String[] args){
        Scanner fds = new Scanner (System.in);

        System.out.println("Entre com um valor para INICIAR");
        int valori = fds.nextInt();
        System.out.println("Entre com um valor FINAL");
        int valorf = fds.nextInt();

        if (valori < valorf) {
            while (valori < valorf) {
                System.out.println("O valor é: " + valori);
                valori = valori + 1;
            }
        } else {
            while (valori > valorf) {
                System.out.println("O valor é: " + valori);
                valori = valori - 1;
            }
        }
        fds.close();
    }

}
