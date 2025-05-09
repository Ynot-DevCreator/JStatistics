import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import javax.swing.JOptionPane;
import java.io.IOException;

public class App {

    public static String plural(int contagem) {
        return contagem <= 1 ? "vez" : "vezes";
    }
    public static void main(String[] args) throws Exception {
        int[] espacoAmostral = {1, 2, 3, 4 ,5 ,6}; 
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int cont6 = 0;
        String messagem = "\nProbabilidade de 16.67%\npara qualquer lado do dado\n=======================\nDeseja lançar os dados?\n=======================";
        Random random = new Random();
        while (true) {
            int opcao = JOptionPane.showConfirmDialog(null, messagem, "Lançamento de Dados", JOptionPane.YES_NO_OPTION);     
            if (opcao != JOptionPane.YES_OPTION) {
                String estatisticas = "Jogo Finalizado!\nTotal de Lançamentos: "+(cont1+cont2+cont3+cont4+cont5+cont6)+
                "\nLado Um: "+cont1+" "+plural(cont1)+
                "\nLado Dois: "+cont2+" "+plural(cont2)+
                "\nLado Três: "+cont3+" "+plural(cont3)+
                "\nLado Quatro: "+cont4+" "+plural(cont4)+
                "\nLado Cinco: "+cont5+" "+plural(cont5)+
                "\nLado Seis: "+cont6+" "+plural(cont6);
                JOptionPane.showMessageDialog(null,estatisticas, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
                int fim = JOptionPane.showConfirmDialog(null, "Deseja Salvar as Estatísticas?");
                if (fim == JOptionPane.YES_OPTION) {
                try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Estatisticas.txt"), StandardCharsets.UTF_8))){
                    JOptionPane.showMessageDialog(null, "As Estatísticas do Jogo foram salvas no Arquivo Estatisticas.txt", "Obrigado por Jogar!", JOptionPane.INFORMATION_MESSAGE);
                    writer.write(estatisticas);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"Ocorreu um erro ao tentar gravar arquivos");
                }    
                }
                JOptionPane.showMessageDialog(null,"Obrigado Por Jogar!!", "Jogo Finalizado", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            int resultado = random.nextInt(6);
            switch (resultado + 1) {
                case 1: cont1++; break;
                case 2: cont2++; break;
                case 3: cont3++; break;
                case 4: cont4++; break;
                case 5: cont5++; break;
                case 6: cont6++; break;  
            }
            String saida = "Você jogou o Dado e caiu no: "+espacoAmostral[resultado];
            JOptionPane.showMessageDialog(null, saida, "Resultado",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
