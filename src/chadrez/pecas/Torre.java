package chadrez.pecas;

import chadrez.Cor;
import chadrez.PecaDeChadrez;
import tabuleiro.Tabuleiro;

public class Torre extends PecaDeChadrez{

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "R";
	}
}
