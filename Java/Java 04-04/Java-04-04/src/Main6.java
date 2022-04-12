
import javax.swing.JOptionPane;

public class Main6 {
static void adição() {
    double A = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
    double B = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor: "));
    double resultado = A + B; 
    JOptionPane.showMessageDialog(null, "O resultado é: "+resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
}

static void subtração() {
    double A = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
    double B = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor: "));
    double resultado = A - B; 
    JOptionPane.showMessageDialog(null, "O resultado é: "+resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
}

static void multiplicação() {
    double A = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
    double B = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor: "));
    double resultado = (A * B); 
    JOptionPane.showMessageDialog(null, "O resultado é: "+resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
}

static void divisão() {
    double A = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
    double B = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor: "));
    double resultado = (A/B); 
    JOptionPane.showMessageDialog(null, "O resultado é: "+resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
}
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Esse programa executa as funções de uma Calculadora Simples.", "CALCULADORA", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Os números para as operações disponíveis são: \n 1 = adição | 2 p= subtração | 3 = multiplicação | 4 = divisão ", "OPERAÇÕES", JOptionPane.INFORMATION_MESSAGE);
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o número para a operação: "));

       if (op == 1) {
        adição();
       }
       if (op == 2) {
           subtração();
       }
       if (op == 3) {
           multiplicação();
       }
        if (op == 4) {
            divisão();
        } 
        if ((op < 1) || (op > 4)) {
            JOptionPane.showMessageDialog(null, "O VALOR DA OPERAÇÃO É INVÁLIDO", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
         
    }
}

