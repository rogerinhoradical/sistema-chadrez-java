package chadrez.pecas;

import chadrez.Cor;
import chadrez.PecaDeChadrez;
import tabuleiro.Tabuleiro;

public class Rei extends PecaDeChadrez{

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
