package chadrez;

import chadrez.pecas.Rei;
import chadrez.pecas.Torre;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class PartidaDeChadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaDeChadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		setupInicial();
	}
	
	public PecaDeChadrez[][] getPecas(){
		PecaDeChadrez[][] mat = new PecaDeChadrez[tabuleiro.getLinha()][tabuleiro.getColuna()];
		for(int i = 0; i < tabuleiro.getLinha(); i++) {
			for(int j = 0; j < tabuleiro.getColuna(); j++) {
				mat[i][j] = (PecaDeChadrez) tabuleiro.peca(i, j);
			}
		}
		return mat;
	}
	
	private void setupInicial() {
		tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2, 1));
		tabuleiro.colocarPeca(new Rei(tabuleiro,Cor.PRETO), new Posicao(0, 4));
		tabuleiro.colocarPeca(new Rei(tabuleiro,Cor.BRANCO), new Posicao(7, 4));
	}
}
