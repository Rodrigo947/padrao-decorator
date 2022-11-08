import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IFormaPagamentoTest {
    @Test
    void deveRetornarValorBoleto() {
        IFormaPagamento formaPagamento = new Boleto(500.0F);
        Assertions.assertEquals(500.0F, formaPagamento.getValor());
    }

    @Test
    void deveRetornarValorBoletoMaisJuros() {
        IFormaPagamento formaPagamento = new Juros(new Boleto(500.0F),10);
        Assertions.assertEquals(550.00F, formaPagamento.getValor());
    }

    @Test
    void deveRetornarValorBoletoMaisMulta() {
        IFormaPagamento formaPagamento = new Multa(new Boleto(500.0F));
        Assertions.assertEquals(510.00F, formaPagamento.getValor());
    }

    @Test
    void deveRetornarValorBoletoMaisJurosMaisMulta() {
        IFormaPagamento formaPagamento = new Multa(new Juros(new Boleto(500.0F),10));
        Assertions.assertEquals(560.00F, formaPagamento.getValor());
    }

    @Test
    void deveRetornarEstruturaBoleto() {
        IFormaPagamento formaPagamento = new Boleto();
        Assertions.assertEquals("Boleto", formaPagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoletoMaisJuros() {
        IFormaPagamento formaPagamento = new Juros(new Boleto(500.0F),10);
        Assertions.assertEquals("Boleto/Juros", formaPagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoletoMaisMulta() {
        IFormaPagamento formaPagamento = new Multa(new Boleto(500.0F));
        Assertions.assertEquals("Boleto/Multa", formaPagamento.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoletoMaisJurosMaisMulta() {
        IFormaPagamento formaPagamento =  new Multa(new Juros(new Boleto(500.0F),10));
        Assertions.assertEquals("Boleto/Juros/Multa", formaPagamento.getEstrutura());
    }
}