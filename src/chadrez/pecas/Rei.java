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

	@Override
	public boolean[][] movimentosPossiveis() {
		boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		return mat;
	}

}
