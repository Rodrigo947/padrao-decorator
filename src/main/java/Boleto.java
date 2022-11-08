public class Boleto implements IFormaPagamento {

    public float valorBoleto;

    public Boleto() {
    }

    public Boleto(float valorBoleto) {
        this.valorBoleto = valorBoleto;
    }

    public float getValor() {
        return valorBoleto;
    }

    public float getValorInicial(){
        return valorBoleto;
    }

    public String getEstrutura() {
        return "Boleto";
    }

}
