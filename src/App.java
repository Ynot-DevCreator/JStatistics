import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Alô, Jardim!", "Exercício 1", JOptionPane.INFORMATION_MESSAGE);
        String nomeCliente = JOptionPane.showInputDialog(null,"Prezado Cliente Por favor informe seus Dados\nNome:", "Sistema de Serviço para Jardins", JOptionPane.INFORMATION_MESSAGE);
        String endereco = JOptionPane.showInputDialog(null, "Informe seu endereço:");
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Comprimento do seu Jardim(m):"));
        double largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Largura do seu Jardim(m):"));

        Cliente cliente = new Cliente(nomeCliente, endereco, comprimento, largura);

        double areaJardim = comprimento * largura;
        
        JOptionPane.showMessageDialog(null, "Nome do CLiente: "+cliente.getNomeCliente()+"\nEndereço do Cliente: "+cliente.getEndereco()+"\nArea do Jardim:"+areaJardim, "Dados Do Cliente", JOptionPane.INFORMATION_MESSAGE);
    }
}
