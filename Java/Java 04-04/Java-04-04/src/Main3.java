import javax.swing.JOptionPane;

public class Main3 {
    
     public static void main(String[] args) {
     JOptionPane.showMessageDialog(null, "Este Programa serve para calcular a multilicação de dois números!", "Início", JOptionPane.INFORMATION_MESSAGE);
     Float valorA = Float.parseFloat(JOptionPane.showInputDialog("Valor A: "));
     Float valorB = Float.parseFloat(JOptionPane.showInputDialog("Valor B: "));
     Float resultado = valorA * valorB; 
     JOptionPane.showMessageDialog(null, "Resultado final: "+resultado,
       "Resultado", JOptionPane.INFORMATION_MESSAGE);
    
    }

}
