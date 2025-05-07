import java.util.Random;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        

        int[] espacoAmostral = {1, 2, 3, 4 ,5 ,6}; 
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int cont6 = 0;
        String messagem = "Deseja lançar os dados? ";
        Random random = new Random();
        while (true) {
            int opcao = JOptionPane.showConfirmDialog(null, messagem, "Lançamento de Dados", JOptionPane.YES_NO_OPTION);     
            if (opcao != JOptionPane.YES_OPTION) {
                String estatisticas = "Jogo Finalizado!\n Total de Lançamentos: "+(cont1+cont2+cont3+cont4+cont5+cont6)+"\nLado Um: "+cont1+"\nLado Dois: "+cont2+"\nLado Três: "+cont3+"\nLado Quatro: "+cont4+"\nLado Cinco: "+cont5+
                "\nLado Seis: "+cont6;
                JOptionPane.showMessageDialog(null,estatisticas, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Saindo...");
                break;
            }
            int resultado = random.nextInt(6);
            switch (resultado) {
                case 1:
                    cont1++;
                    break;
                case 2: 
                    cont2++;
                    break;
                case 3: 
                    cont3++;
                    break;
                case 4: 
                    cont4++;
                    break;
                case 5: 
                    cont5++;
                    break;
                case 6: 
                    cont6++;
                    break;
                
            }
            String saida = "Resultado do Lançamento: "+espacoAmostral[resultado];
            JOptionPane.showMessageDialog(null, saida, "Resultado",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
