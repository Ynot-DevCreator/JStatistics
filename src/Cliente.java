public class Cliente {
    
    private String nomeCliente, endereco;
    private double comprimento, largura, areaJardim ;

    public Cliente(String nomeCliente,String endereco, double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.endereco = endereco;
        this.nomeCliente = nomeCliente;
   
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }


    
    
}
