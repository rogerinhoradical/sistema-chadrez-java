package application;

import chadrez.PartidaDeChadrez;
import tabuleiro.Tabuleiro;

public class Program {

	public static void main(String[] args) {
		PartidaDeChadrez partida = new PartidaDeChadrez();
		UI.printarTabuleiro(partida.getPecas());
		
	}

}
