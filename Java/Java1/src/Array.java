import java.util.Scanner;

public class Array {

     public static void main(String[] args) {
       
       //Criação de um leitor/scanner// 
       Scanner scan = new Scanner(System.in);
       
       //Pedir a quantidade de notas, onde o valor é armazenado na variável quant//  
       System.out.println("Digite a quantidade de notas: ");
       int quant = scan.nextInt();
       
       //Criação de um Array double para ler os valores do usuário em função da variável (contador) quant// 
       double[] notas = new double[quant];

       //for para declarar mais uma variável "var1" para ser o contador do array "notas", exercendo a função que, 
       //enquanto essa variável for menor que o contador anterior de notas (quant), ele faz a incrementação (++) e pede um valor para "notas":
       for (int var1 = 0; var1 < quant; var1++) {
           System.out.println("Digite a nota[" + var1 + "]: \n");
           notas[var1] = scan.nextDouble();
        }
        double total = 0;

        for(int var2 = 0; var2 < notas.length; var2++) {
            total = total + notas[var2];
        }
         total = total/quant;
         System.out.println("A média é:" + total);
        scan.close();

}
}