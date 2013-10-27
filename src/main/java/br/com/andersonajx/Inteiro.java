package br.com.andersonajx;

import java.math.BigInteger;

public final class Inteiro extends Numero<BigInteger> {

	private final BigInteger valor;

	public Inteiro(BigInteger valor) {
		this.valor = valor;
	}

	@Override
	public void calcular(BigInteger valor) {
		System.out.println(this.valor.add(valor));
	}

	@Override
	public BigInteger getValor() {
		return valor;
	}

}
