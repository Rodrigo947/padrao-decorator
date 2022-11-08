public class Juros extends BoletoDecorator {

    private int diasDeAtraso;

    public Juros(IFormaPagamento formaPagamento, int diasDeAtraso) {
        super(formaPagamento);
        this.diasDeAtraso = diasDeAtraso;
    }

    public int getDiasDeAtraso() {
        return diasDeAtraso;
    }

    public void setDiasDeAtraso(int diasDeAtraso) {
        this.diasDeAtraso = diasDeAtraso;
    }

    public float getAumento() {
        return (float) (this.getValorInicial() * this.getDiasDeAtraso() * 0.01);
    }

    public String getNomeEstrutura() {
        return "Juros";
    }

}
