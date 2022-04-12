import javax.swing.JOptionPane;

public class Main5 {
    
     public static void main(String[] args) {
     JOptionPane.showMessageDialog(null, "Este Programa serve para identificar certas características de um triângulo!", "Início", JOptionPane.INFORMATION_MESSAGE);
      
      double A = Double.parseDouble(JOptionPane.showInputDialog("Valor A: "));
      double B = Double.parseDouble(JOptionPane.showInputDialog("Valor B: "));
      double C = Double.parseDouble(JOptionPane.showInputDialog("Valor A: "));
     
     if ((A + B > C) && (B + C > A) && (C + A > B))  {
 
      if ((A != B) && (B != C) && (A != C)) {
        JOptionPane.showMessageDialog(null, "Esse Triângulo é Escaleno!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
      }

      if ((A == B) && (B == C) && (C == A)) {
        JOptionPane.showMessageDialog(null, "Esse Triângulo é Equilátero!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
      }

      if (((A == B) && (B != C)) || ((B == C) && (C != A)) || ((A == C)) && ((C != B))) {
        JOptionPane.showMessageDialog(null, "Esse Triângulo é Isósceles!", "Resultado", JOptionPane.INFORMATION_MESSAGE);    
      }    
      
    } else {
         JOptionPane.showMessageDialog(null, "Não é possível formar um triângulo com esssas medidas!", "Inválido", JOptionPane.ERROR_MESSAGE);
    }
  }
}
