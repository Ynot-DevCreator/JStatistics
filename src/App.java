import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        double areaJardim, comprimento, largura;

        comprimento = Double.parseDouble(JOptionPane.showInputDialog(null,"Comprimento do Jardim: "));
        largura = Double.parseDouble(JOptionPane.showInputDialog(null,"Largura do Jardim: "));
        
        String[] tamanho = {"Pequeno","Grande"};
        areaJardim = comprimento*largura;

        if (areaJardim < 100) {
            JOptionPane.showMessageDialog(null, "Area do Jardim: "+areaJardim+"\nTamanho: "+tamanho[0]);
        }else {
            JOptionPane.showMessageDialog(null, "Area do Jardim: "+areaJardim+"\nTamanho: "+tamanho[1]);
        }
        int contServ=0;
        int soma =0;
        while (true) {
            int servico = Integer.parseInt(JOptionPane.showInputDialog("Qual Serviço Deseja Contratar:\n1-Adubação R$300,00\n2-Poda R$150,00\n3-Manutenção R$90,00\n4-Plantio R$400,00\n5-Sair"));
           if (servico!=5) {
            contServ++;
           }else{
            break;
           }
            String escolhido = "";
            switch (servico) {
                case 1: escolhido = "Adubação"; soma = soma + 300; break;
                case 2: escolhido = "Poda"; soma = soma + 150; break;
                case 3: escolhido = "Manutenção"; soma = soma + 90;break;
                case 4: escolhido = "Plantio"; soma = soma + 400;break;
            }
            JOptionPane.showMessageDialog(null, "Serviço Contratado: "+escolhido);
            int loop = JOptionPane.showConfirmDialog(null, "Deseja contratar mais serviços?");
            if (loop != JOptionPane.YES_OPTION) {
                break;
            }
            }
            double desc = 0.20 * soma;
            double descsoma = soma - desc;
            int fidel = JOptionPane.showConfirmDialog(null, "Possui Cadastro de Fidelidade na Empresa? ");
            if (fidel == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null,"Área do Jardim: "+areaJardim+"m²"+"\nQuantidade de Serviços Contratados: "+contServ+"\nValor Total: "+soma+",00R$"+"\nDesconto de: "+desc+"\nValor Total com Desconto: "+descsoma+"R$");
            }else{
                JOptionPane.showMessageDialog(null,"Área do Jardim: "+areaJardim+"m²"+"\nQuantidade de Serviços Contratados: "+contServ+"\nValor Total: "+soma+",00R$");
            }
            
    }
}
