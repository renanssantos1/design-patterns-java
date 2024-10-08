package br.com.loja.desconto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItems(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));


        return desconto.calcular(orcamento);
    }

}
