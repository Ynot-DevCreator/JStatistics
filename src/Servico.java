public class Servico {
    private double valor;

    public Servico(double valor) {
        this.valor = valor;
    }

    public double aplicarDesconto(double porcentagem) {
        return valor - (valor *porcentagem /100);
    }
}
