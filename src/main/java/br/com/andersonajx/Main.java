package br.com.andersonajx;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		Numero<BigInteger> inteiro = new Inteiro(BigInteger.TEN);
		inteiro.calcular(BigInteger.TEN);

		inteiro = new SubtracaoInteiro(inteiro);
		inteiro.calcular(BigInteger.ONE);
		inteiro.calcular(new BigInteger("5"));

		inteiro = new MultiplicacaoInteiro(inteiro);
		inteiro.calcular(new BigInteger("5"));
		inteiro.calcular(new BigInteger("12"));

		Numero<BigDecimal> decimal = new Decimal(BigDecimal.TEN);
		decimal.calcular(BigDecimal.TEN);

		decimal = new DivisaoDecimal(decimal);
		decimal.calcular(new BigDecimal("2"));
		decimal.calcular(new BigDecimal("5"));
	}

}
