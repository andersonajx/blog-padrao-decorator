package br.com.andersonajx;

import java.math.BigInteger;

public final class MultiplicacaoInteiro extends CalculoNumeroDecorator<BigInteger> {

	public MultiplicacaoInteiro(Numero<BigInteger> numero) {
		super(numero);
	}

	@Override
	public void calcular(BigInteger valor) {
		System.out.println("Decorado por Multiplicacao: " + getValor().multiply(valor));
	}

}
