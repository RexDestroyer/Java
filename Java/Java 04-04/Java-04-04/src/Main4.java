
import javax.swing.JOptionPane;

public class Main4 {
    
     public static void main(String[] args) {
     JOptionPane.showMessageDialog(null, "Este Programa serve para calcular a média de 4 notas !", "Início", JOptionPane.INFORMATION_MESSAGE);
     Double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor A: "));
     Double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor B: "));
     Double valor3 = Double.parseDouble(JOptionPane.showInputDialog("Valor A: "));
     Double valor4 = Double.parseDouble(JOptionPane.showInputDialog("Valor B: "));
     
     if ((valor1 < 10) || (valor2 < 10) || (valor3 < 10) || (valor4 < 10))  {
       Double resultado = (valor1+valor2+valor3+valor4)/4; 

         if (resultado >= 7) {
         JOptionPane.showMessageDialog(null, "Aprovado com: "+resultado,
         "Resultado", JOptionPane.INFORMATION_MESSAGE); 
        } else {
        JOptionPane.showMessageDialog(null, "Reprovado com: "+resultado,
        "Resultado", JOptionPane.INFORMATION_MESSAGE); 
        }
    
    } else {
         JOptionPane.showMessageDialog(null, "O(s) número(s) inserido(s) não é Válido(s)!", "Inválido", JOptionPane.ERROR_MESSAGE);
    }
  }
}