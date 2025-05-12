import javax.swing.JOptionPane;

public class Cliente {
    private String nome, endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public void exibir() {
        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nEndereço: "+endereco);
    }
}
