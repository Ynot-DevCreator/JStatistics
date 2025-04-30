import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        /*int op = Integer.parseInt(JOptionPane.showInputDialog("Qual o Resultado de uma população?\n 1-Parâmetro\n 2-Estatística"));
            if (op == 1) {
                JOptionPane.showMessageDialog(null, "Certa Resposta");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta Errada!", "JStatistics",JOptionPane.ERROR_MESSAGE);
            }*/
        
            //if else
            // Exercícios   (para cada pergunta crie um if)
            /*Considerando os números 30, 50, 80, 90 Digite o valor da média aritmética simples */
            //Gabarito: 62.5
            /*Considerando os valores 10, 40, 50, 80, 10. Digite qual é a moda? */
            //Gabarito: 10
            /*Qual a medida de tendência central que mostra o centro da amostra?  */
            //Gabarito: mediana

            // String nome;
            // if nome.equals("mediana")
        double media = Double.parseDouble(JOptionPane.showInputDialog("Considerando os números:\n 30, 50, 80, 90 \nDigite o valor da Média Aritmética simples"));
            if (media == 62.5) {
                JOptionPane.showMessageDialog(null, "Resposta Correta!");
            }else {
                JOptionPane.showMessageDialog(null, "Resposta Errada!", "JStatistics",JOptionPane.ERROR_MESSAGE);
            }
        int moda = Integer.parseInt(JOptionPane.showInputDialog("Considerando os valores: \n10, 40, 50, 80, 10 \nDigite qual é a moda?"));
        if (moda == 10) {
            JOptionPane.showMessageDialog(null, "Resposta Correta!");
        }else {
            JOptionPane.showMessageDialog(null, "Resposta Errada!", "JStatistics",JOptionPane.ERROR_MESSAGE);
        }
        String mediana = JOptionPane.showInputDialog("Qual a medida de tendência central que mostra o centro da amostra?");
        if (mediana.equalsIgnoreCase("mediana")) {
            JOptionPane.showMessageDialog(null, "Resposta Correta!");
        }else {
            JOptionPane.showMessageDialog(null, "Resposta Errada!", "JStatistics",JOptionPane.ERROR_MESSAGE);
        }

        if (media == 62.5 && moda == 10 && mediana.equalsIgnoreCase("mediana")) {
            JOptionPane.showMessageDialog(null, "Parabéns, Você Gabaritou o Quiz! ");
        }
    }
}
