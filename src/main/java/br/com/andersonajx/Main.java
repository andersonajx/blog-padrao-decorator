package br.com.andersonajx;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

	public static void main(String[] args) {
		BigDecimal resultado1 = calcular(TipoOperacaoMatematica.ADICAO, new BigDecimal(50), new BigDecimal(25));
		BigDecimal resultado2 = calcular(TipoOperacaoMatematica.ADICAO, new BigDecimal(12), new BigDecimal(25));
		BigDecimal resultado3 = calcular(TipoOperacaoMatematica.SUBTRACAO, new BigDecimal(10), new BigDecimal(5));
		BigDecimal resultado4 = calcular(TipoOperacaoMatematica.DIVISAO, new BigDecimal(20), new BigDecimal(2));

		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4);
	}

	public static BigDecimal calcular(TipoOperacaoMatematica tipo, BigDecimal valor1, BigDecimal valor2) {
		switch (tipo) {
			case ADICAO:
				return valor1.add(valor2);
			case SUBTRACAO:
				return valor1.subtract(valor2);
			case MULTIPLICACAO:
				return valor1.multiply(valor2);
			case DIVISAO:
				return valor1.divide(valor2, 2, RoundingMode.HALF_EVEN);
		}
		return BigDecimal.ZERO;
	}

	enum TipoOperacaoMatematica {
		ADICAO,
		SUBTRACAO,
		MULTIPLICACAO,
		DIVISAO
	}

}
