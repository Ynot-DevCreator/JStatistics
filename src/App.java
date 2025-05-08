import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //Classe é um conjunto de objetos
        //Nosso objetivo nesse código é entender a diferença
        //entre método com o tipo void e método com o tipo String
        Mamifero m1 = new Mamifero();
        Mamifero m2 = new Mamifero();
        Mamifero m3 = new Mamifero();
        m1.setNomeCientifico("Bos Taurus");
        m2.setNomeCientifico("Macropus");
        m3.setNomeCientifico("Trichechus");
        JOptionPane.showMessageDialog(null, "Nome Científico:\n"+m1.getNomeCientifico()+"\n"+m2.getNomeCientifico()+"\n"+m3.getNomeCientifico());
        //Exercício
        /* 
         * Considerando a utilização de métodos set e get
         * Considerando a aula de hoje
         * Diferença entre função e método
         */

    }
}
