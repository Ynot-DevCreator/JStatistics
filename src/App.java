import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    System.out.println("Aula 3 - Switch & Loops");
    // O Switch é uma estrutura de seleção múltipla
    //Um if mais organizado
    //Escolha
       //Caso
    //Para resolver listas ou constantes.
        //Menu
           //opcao1
           //opcao2
    
    String Cont;
    do {
           int op = Integer.parseInt(JOptionPane.showInputDialog("Digite a Opção: \n1-Estatística Descritiva \n2-Probabilidade \n3-Modelos Probabilísticos"));
    //!= diferente
    if (op!=4) {
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Estatística Descritiva");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Probabilidade");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Modelos Probabilísticos");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
        }    
    } else {
        JOptionPane.showMessageDialog(null, "Encerrando Sistema");
    }
    Cont = JOptionPane.showInputDialog("Deseja Continuar? (S-Sim N-Não)");
} while (Cont.equalsIgnoreCase("S"));

    /*
    int contador = 1;
    while (contador <2) {
        JOptionPane.showMessageDialog(null, "Viva o SENAI!!!");
        contador++;
    }  
    
    int i= 1;
    while (i<=5) {
        System.out.println(i);
        i++;
    }

    for (int j=1;j<=5;j++) {
        System.out.println(j);
    }
    String sair;
    do {
        sair = JOptionPane.showInputDialog("Sair: S-Sim ou N");
    } while (sair.equalsIgnoreCase("N"));
    */
    }
}
