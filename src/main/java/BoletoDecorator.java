public abstract class BoletoDecorator implements IFormaPagamento {

    private IFormaPagamento formaPagamento;
    public String estrutura;

    public BoletoDecorator(IFormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public IFormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(IFormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public abstract float getAumento();

    public float getValor() {
        return this.formaPagamento.getValor() + getAumento();
    }

    public float getValorInicial(){
        return this.formaPagamento.getValorInicial();
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.formaPagamento.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}


