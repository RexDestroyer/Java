import java.util.Scanner;

public class Metodo2 {
    
   static void metodo1() {
    Scanner scan1 = new Scanner(System.in);
    System.out.println("\nDigite o nome do usuário.");
    String nome = scan1.nextLine();
    System.out.println("\nDigite a Senha: ");
    int senha = scan1.nextInt();
    if ((nome == "carlinda") || (senha == 3456)) {
        System.out.println("\nUsuário Autorizado.");
    } else {
        System.out.println("\nUsuário Não Autorizado. ");
    }
    scan1.close();
}

   static void metodo2() {
     Scanner scan2 = new Scanner(System.in);
    
    System.out.println("\nDigite uma nota.");
    float n1 = scan2.nextFloat();

    System.out.println("\nDigite mais uma nota.");
    float n2 = scan2.nextFloat(); 

    System.out.println("\nDigite mais uma nota.");
    float n3 = scan2.nextFloat();

    System.out.println("\nDigite mais uma nota.");
    float n4 = scan2.nextFloat();

    Float media = (n1+n2+n3+n4)/4;
    System.out.println("\nA média é: " + media + "\n");
    scan2.close();
}
   
    static void metodo3() {
     System.out.println("\nSeja Bem Vindo!\n");
}

    static void metodo4() {
     Scanner scan3 = new Scanner(System.in);
     
     System.out.println("\nDigite a variação do espaço (delta s.");
     Float ds = scan3.nextFloat();
     
     System.out.println("\nDigite a variação do tempo (delta t).");
     Float dt = scan3.nextFloat();
      
     Float Vm = ds/dt;
     System.out.println("\nA velocidade média é: " + Vm + "m/s\n");
    scan3.close();
}

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite um número para realizar a operação desejada (De 1 a 4). \n");
        int op = scan.nextInt();
        
        if (op == 1) {
            metodo1();
        }
        
        if (op == 2) {
            metodo2();
        }

        if (op == 3) {
            metodo3();
        }

        if (op == 4) {
            metodo4();
        } else {
            System.out.println("\nO número é inválido!\n");
        }
      scan.close();  
    }






































}







