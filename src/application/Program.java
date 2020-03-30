package application;

import java.util.Scanner;

import chadrez.PartidaDeChadrez;
import chadrez.PecaDeChadrez;
import chadrez.PosicaoChadrez;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		PartidaDeChadrez partida = new PartidaDeChadrez();
		
		while(true) {
			UI.printarTabuleiro(partida.getPecas());
			System.out.println();
			System.out.print("Inicial: ");
			PosicaoChadrez inicial =  UI.lerPosicaoChadrez(ler);
			
			System.out.println();
			System.out.print("Destino: ");
			PosicaoChadrez destino =  UI.lerPosicaoChadrez(ler);
			
			PecaDeChadrez pecaCapturadda = partida.executarMovimentacaoPeca(inicial, destino);
			
		}
		
	}

}
