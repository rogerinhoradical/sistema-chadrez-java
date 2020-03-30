package chadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaDeChadrez extends Peca{
	
	private Cor cor;

	public PecaDeChadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

}	
