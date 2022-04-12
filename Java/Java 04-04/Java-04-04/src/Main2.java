import javax.swing.JOptionPane;
public class Main2 {
 
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String sobreNome = JOptionPane.showInputDialog("Digite o sobrenome: ");
        String nomeCompleto = nome +" "+ sobreNome;  
        JOptionPane.showMessageDialog(null, "Nome Completo: "+nomeCompleto,
        "Informação", JOptionPane.INFORMATION_MESSAGE); 
    
        JOptionPane.showMessageDialog(null, "You don't have the UNLIMITED POWER!", "WARNING "+nomeCompleto, JOptionPane.WARNING_MESSAGE);



    }
}
