import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args) throws Exception {
        String nomeCliente = JOptionPane.showInputDialog(null,"Prezado Cliente\nPor favor informe seus Dados\nNome:", "Sistema de Serviço para Jardins", JOptionPane.INFORMATION_MESSAGE);
        String endereco = JOptionPane.showInputDialog(null, "Informe seu endereço:");
        Cliente cliente = new Cliente(nomeCliente, endereco);

        double comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Comprimento do seu Jardim(m):"));
        double largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Largura do seu Jardim(m):"));
        Jardim jardim = new Jardim(largura, comprimento);
        double areaJardim = jardim.calcularArea(largura, comprimento);

        double valorServico = areaJardim * 10;
        Servico servico = new Servico(valorServico);
        double valorComDesconto = servico.aplicarDesconto(10);
        double desconto = valorServico - valorComDesconto;

        cliente.exibir();
        JOptionPane.showMessageDialog(null, "Área do Jardim: " + areaJardim+"m²"+"\nValor Bruto: R$"+valorServico+"\nDesconto: "+"-"+desconto+"R$"+ "\nValor do Serviço: R$" + valorComDesconto);

    }
}
