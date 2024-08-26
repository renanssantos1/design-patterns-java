import br.com.loja.desconto.CalculadoraDeDescontos;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 4);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadoraDeImpostos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento1));
        System.out.println(calculadoraDeImpostos.calcular(orcamento2));
    }
}