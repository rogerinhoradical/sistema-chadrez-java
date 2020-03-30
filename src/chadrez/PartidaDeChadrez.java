package chadrez;

import chadrez.pecas.Rei;
import chadrez.pecas.Torre;
import tabuleiro.Tabuleiro;

public class PartidaDeChadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaDeChadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		setupInicial();
	}
	
	public PecaDeChadrez[][] getPecas(){
		PecaDeChadrez[][] mat = new PecaDeChadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i = 0; i < tabuleiro.getLinhas(); i++) {
			for(int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaDeChadrez) tabuleiro.peca(i, j);
			}
		}
		return mat;
	}
	
	private void colocarNovaPeca(char coluna, int linha, PecaDeChadrez peca) {
		tabuleiro.colocarPeca(peca, new PosicaoChadrez(coluna, linha).toPosicao());
	}
	
	private void setupInicial() {
		colocarNovaPeca('c', 1, new Torre(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('c', 2, new Torre(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('d', 2, new Torre(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('e', 2, new Torre(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('e', 1, new Torre(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('d', 1, new Rei	 (tabuleiro, Cor.BRANCO));

        colocarNovaPeca('c', 7, new Torre(tabuleiro, Cor.PRETO));
        colocarNovaPeca('c', 8, new Torre(tabuleiro, Cor.PRETO));
        colocarNovaPeca('d', 7, new Torre(tabuleiro, Cor.PRETO));
        colocarNovaPeca('e', 7, new Torre(tabuleiro, Cor.PRETO));
        colocarNovaPeca('e', 8, new Torre(tabuleiro, Cor.PRETO));
        colocarNovaPeca('d', 8, new Rei	 (tabuleiro, Cor.PRETO));
	}
}
