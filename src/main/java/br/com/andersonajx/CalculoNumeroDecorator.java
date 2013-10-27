package br.com.andersonajx;

public abstract class CalculoNumeroDecorator<T> extends Numero<T> {

	private Numero<T> numero;

	CalculoNumeroDecorator(Numero<T> numero) {
		this.numero = numero;
	}

	@Override
	public T getValor() {
		return numero.getValor();
	}

}
