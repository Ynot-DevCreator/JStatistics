
import javax.swing.JOptionPane;

public class App {
    public static double calcularArea(double comprimento, double largura) {
        return comprimento * largura;
    }
    public static void exibirDados(String nome, String endereco, double areaJardim, String tamanhoJardim) {
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nEndereço: "+endereco+"\nÁrea do Jardim: "+areaJardim+"\nTamanho do Jardim: "+tamanhoJardim);
    }
    public static double calcularMedia(double somaArea, int areas) {
        return somaArea/areas;
    }
    public static void main(String[] args) throws Exception {
        
        double areaJardim, comprimento, largura;
        double somaArea = 0;
        int areas=0;
        int areasGrandes=0;
        while (true) {
            String nome = JOptionPane.showInputDialog("Informe seu Nome:");
            String endereco = JOptionPane.showInputDialog("Nos informe seu endereço:");
            comprimento = Double.parseDouble(JOptionPane.showInputDialog(null,"Comprimento do Jardim: "));
            largura = Double.parseDouble(JOptionPane.showInputDialog(null,"Largura do Jardim: "));
            areas++;
            
            areaJardim = calcularArea(comprimento, largura);

            String tamanhoJardim = (areaJardim < 100) ? "Pequeno" : "Grande";
            if (areaJardim >= 100) {
                  areasGrandes++;
            }
            exibirDados(nome, endereco, areaJardim, tamanhoJardim);
            somaArea = somaArea + areaJardim;
            int loop = JOptionPane.showConfirmDialog(null, "Deseja Adicionar mais um Terreno? ");
            if (loop != JOptionPane.YES_OPTION) {     
                break;
            }
        }
        double mediaArea = calcularMedia(somaArea, areas);
        JOptionPane.showMessageDialog(null, "A média das Áreas:"+mediaArea+"m²"+"\nÁreas Grandes: "+areasGrandes);
    }
}
