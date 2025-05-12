public class Jardim {
    private double comprimento, largura;

    public Jardim(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea(double comprimento, double largura) {
        return comprimento * largura;
    }
}
