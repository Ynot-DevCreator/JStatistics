import javax.swing.JOptionPane;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        //Cara ou Coroa - Probabilidade
        // 50% cara
        // 50% coroa
        //Variável que receba a interação do jogo
        //Random
        //Switch
        //For, do-While e While

        String[] espacoAmostral = {"cara", "Coroa"}; // vetor ou Matriz unidimensional
        // Contadores para verificar a Distribuição
        int contCara = 0;
        int contCoroa = 0;
        String messagem = "Espaço amostral:{Cara ou Coroa}\n"+"Probabilidade de Cara: 50%\n"+"Probabilidade de Coroa 50%\n"+"Deseja lançar a moeda?";
        // sorteio
        Random random = new Random();
        while (true) {
            int opcao = JOptionPane.showConfirmDialog(null, messagem, "Lancamento moedas",JOptionPane.YES_NO_OPTION);
            if (opcao != JOptionPane.YES_OPTION) {
                //Estatísticas
                String estatisticas = "Jogo Finalizado!\n"+"Total de Lançmentos: "+(contCara+contCoroa)+"\nCaras: "+contCara+"\nCoroas: "+contCoroa;
                JOptionPane.showMessageDialog(null, estatisticas, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
                break;
                
            }
           int resultado = random.nextInt(2); //0-cara 1-coroa
            if (resultado==0) {
                contCara++;
            }else{
                contCoroa++;
            }
            String saida= "Resultado do Lançamento: "+espacoAmostral[resultado]+"\n(Índice gerado: "+resultado+")";
            JOptionPane.showMessageDialog(null, saida, "resultado",JOptionPane.INFORMATION_MESSAGE);

        }
        

    }
}
