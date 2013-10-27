package br.com.andersonajx;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class DivisaoDecimal extends CalculoNumeroDecorator<BigDecimal> {

	public DivisaoDecimal(Numero<BigDecimal> numero) {
		super(numero);
	}

	@Override
	public void calcular(BigDecimal valor) {
		System.out.println("Decorado por Divisao: " + getValor().divide(valor, 2, RoundingMode.HALF_EVEN));
	}
}
