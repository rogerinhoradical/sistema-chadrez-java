package chadrez;

import tabuleiro.Posicao;

public class PosicaoChadrez {

	private char coluna;
	private int linha;
	
	public PosicaoChadrez(char coluna, int linha) {
		if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new ChessException("Erro instanciando PosicaoChadrez. Valores validos são de a1 à h8");
		}
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}

	protected Posicao toPosicao() {
		return new Posicao(8 - linha, coluna - 'a');
	}
	
	protected static PosicaoChadrez fromPosicao(Posicao posicao) {
		return new PosicaoChadrez((char)('a' - posicao.getColuna()), 8 - posicao.getLinha());
	}
	
	@Override
	public String toString() {
		return "" + coluna + linha;
	}
}
