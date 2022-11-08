public class Multa extends BoletoDecorator {

    public Multa(IFormaPagamento formaPagamento) {
        super(formaPagamento);
    }

    public float getAumento() {
        return (float) (this.getValorInicial() * 0.02);
    }

    public String getNomeEstrutura() {
        return "Multa";
    }
}
