package model;

public class ArrayGeneric<T> implements IArray<T> {
	
	private final int DEFAULT_SIZE = 20;
	private Object dados[];
	private int tamanhoMaximo;
	private int qtdElementos;
	
	public ArrayGeneric() {
		this.tamanhoMaximo = DEFAULT_SIZE;
		init();
	}
	
	public ArrayGeneric(int tamanho) {
		if(tamanho > 0) {
			this.tamanhoMaximo = tamanho;
		}else {
			this.tamanhoMaximo = DEFAULT_SIZE;
		}
		init();
	}
	
	private void init() {
		this.qtdElementos = 0;
		this.dados = new Object[this.tamanhoMaximo];
	}
	
	@Override
	public boolean add(T coisa) {
		boolean deuCerto = false;
		if(coisa != null) {
			if(this.qtdElementos == this.tamanhoMaximo) {
				dobrarArray();
			}
			dados[qtdElementos] = coisa;
			qtdElementos++;
			deuCerto = true;
		}
		return deuCerto;
	}

	private void dobrarArray() {
		Object novo[] = new Object[this.tamanhoMaximo*2];
		for(int i=0; i<this.tamanhoMaximo; i++) {
			novo[i] = dados[i];
		}
		this.tamanhoMaximo *= 2;
		this.dados = novo;
	}
	
	@Override
	public void clear() {
		for(int i=0; i<qtdElementos; i++) {
			dados[i] = null;
		}
		this.qtdElementos = 0;
	}

	@Override
	public boolean contains(T coisa) {
		boolean existe = false;
		for(int i=0; i<qtdElementos && !existe; i++) {
			if(dados[i].equals(coisa)) {
				existe = true;
			}
		}
		return existe;
	}

	@Override
	public T get(int posicao) {
		Object coisa = null;
		if(posicao >= 0 && posicao < qtdElementos) {
			coisa = dados[posicao];
		}
		return (T)coisa;
	}

	@Override
	public boolean isEmpty() {
		return this.qtdElementos == 0;
	}

	@Override
	public T remove(int posicao) {
		Object coisa = null;
		if(posicao >= 0 && posicao < qtdElementos) {
			coisa = dados[posicao];
			for(int i=posicao; i < qtdElementos-1; i++) {
				dados[i] = dados[i+1];
			}
			qtdElementos--;
		}
		return (T) coisa;
	}

	@Override
	public boolean remove(T coisa) {
		boolean deuCerto = false;
		boolean existe = false;
		int i, posicao = -1;
		for(i=0; i<qtdElementos && !existe; i++) {
			if(dados[i].equals(coisa)) {
				existe = true;
				posicao = i;
			}
		}
		if(existe) {
			remove(posicao);
			deuCerto = true;
		}
		return deuCerto;
	}

	@Override
	public int size() {
		return this.qtdElementos;
	}

}
