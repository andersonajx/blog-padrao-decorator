package br.com.andersonajx;

import java.math.BigDecimal;

public final class Decimal extends Numero<BigDecimal> {

	private final BigDecimal valor;

	public Decimal(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public void calcular(BigDecimal valor) {
		System.out.println(this.valor.add(valor));
	}

	@Override
	public BigDecimal getValor() {
		return valor;
	}

}
