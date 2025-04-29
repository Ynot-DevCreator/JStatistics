import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Aplicando Lógica de Programação (Aristóteles e George Boolean)
        Scanner leia = new  Scanner(System.in);
        // Variável: é um espaço reservado na mémoria do computador
        // Variável: serve para guardar valores
        // Variável: ela é um tipo(texto, número, lógico...)
        /*
         * Ex-1: Crie um Algoritmo para o JStatistics que leia
         * a opção desejada:
         * "Qual o conjunto de dados utilizado: 1- populacionak 2-amostral"
         *  
         */
        /*int opcao;
        String conjunto = ""; 
        System.out.println("\n#\t #\t JEstatistics \t # \t # \t");
         System.out.println("\nQual Conjunto de dados utilizado:\n-----------------\n1- Populacional\n2- Amostral\n----------------- ");
         System.out.print("OPÇÃO: ");
         opcao = leia.nextInt();
         
         while (opcao < 1 || opcao > 2) {
            System.out.print("Opção Inválida, Tente Novamente: ");
            opcao = leia.nextInt();
         }

         switch (opcao) {
            case 1:
                conjunto = "POPULACIONAL";
                break;          
            case 2:
                conjunto = "AMOSTRAL";
                break;
         }
         System.out.println("Opção Escolhida: "+conjunto);

         String opcaoVariavel = JOptionPane.showInputDialog("Que tipo de variável deseja cadastrar: \n 1-Quantitativa\n 2-Qualitativa");
         int opVar = Integer.parseInt(opcaoVariavel);
         JOptionPane.showMessageDialog(null,opVar);
        */

        int opcao;
        JOptionPane.showMessageDialog(null, "O Jogo da Estatística: JStatistics","JStatistics",JOptionPane.DEFAULT_OPTION);
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Vamos começar o Jogo? \n Escolha a Estratégia: \n 1-Populacional \n 2-Amostral"));
        JOptionPane.showMessageDialog(null, "Você Escolheu: "+opcao,"JStatistics",JOptionPane.DEFAULT_OPTION);


        String opcaoVariavel = JOptionPane.showInputDialog("Que tipo de variável deseja cadastrar: \n 1-Quantitativa\n 2-Qualitativa");
         int opVar = Integer.parseInt(opcaoVariavel);
         JOptionPane.showMessageDialog(null, "Você Escolheu: "+opVar,"JStatistics",JOptionPane.DEFAULT_OPTION);
         }
}
