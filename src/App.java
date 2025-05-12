import java.util.Arrays;

import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        double areaJardim=0, comprimento, largura;
        double somaArea =0;
        int areas=0;
        int areasGrandes=0;
        double[] areasCalculadas = new double[100];
        int indice = 0;
        String todasAreas = "";
        while (true) {
            comprimento = Double.parseDouble(JOptionPane.showInputDialog(null,"Comprimento do Jardim: "));
            largura = Double.parseDouble(JOptionPane.showInputDialog(null,"Largura do Jardim: "));
            areas++;
            String[] tamanho = {"Pequeno","Grande"};
            areaJardim = comprimento*largura;

            areasCalculadas[indice] = areaJardim;
            indice++;

            if (areaJardim < 100) {
                JOptionPane.showMessageDialog(null, "Area do Jardim: "+areaJardim+"\nTamanho: "+tamanho[0]);
            }else {
                JOptionPane.showMessageDialog(null, "Area do Jardim: "+areaJardim+"\nTamanho: "+tamanho[1]);
                areasGrandes++;
            }
            somaArea = somaArea + areaJardim;
            int loop = JOptionPane.showConfirmDialog(null, "Deseja Adicionar mais um Terreno? ");
            if (loop != JOptionPane.YES_OPTION) {     
                break;
            }

        }
        double mediaArea = somaArea/areas;
        double moda =0;
        int maiorFrequencia =0;
        for (int i = 0; i < indice; i++) {
            todasAreas += "Área " + (i+1) + ": "+areasCalculadas[i] +"m²"+"\n";
        }
        JOptionPane.showMessageDialog(null, todasAreas);
        for (int i = 0; i < areas; i++) {
            int frequencia=0;
            for (int j = 0; j < areas; j++) {
                if (Math.round(areasCalculadas[i]) == Math.round(areasCalculadas[j])) {
                    frequencia++;
                }
            }
            if (frequencia > maiorFrequencia) {
                maiorFrequencia =frequencia;
                moda =areasCalculadas[i];
            } 
        }
        double[] vetorOrdenado = Arrays.copyOf(areasCalculadas, areas); // Copia só os valores usados
        Arrays.sort(vetorOrdenado);

        // Montar string com áreas ordenadas
        StringBuilder ordenadas = new StringBuilder();
        for (double area : vetorOrdenado) {
            ordenadas.append(String.format("%.2f", area)+"m²").append(" | ");
        }
        JOptionPane.showMessageDialog(null, "Moda das Áreas: " + String.format("%.2f", moda)+"m²");
        JOptionPane.showMessageDialog(null, ordenadas.toString());
        JOptionPane.showMessageDialog(null, "A média das Áreas: "+String.format("%.2f",mediaArea)+"m²"+"\nÁreas Grandes: "+areasGrandes);
        
    }
}
