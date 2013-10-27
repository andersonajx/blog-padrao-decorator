package br.com.andersonajx;

import java.math.BigInteger;

public final class SubtracaoInteiro extends CalculoNumeroDecorator<BigInteger> {

	public SubtracaoInteiro(Numero<BigInteger> numero) {
		super(numero);
	}

	@Override
	public void calcular(BigInteger valor) {
		System.out.println("Decorado por Subtracao: " + getValor().subtract(valor));
	}

}
