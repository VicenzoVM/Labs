package ui;
import java.util.Scanner;

import funcionalidades.Opcoes;

public class Menu {
	Opcoes opcoes;

public Menu() {
	this.opcoes = new Opcoes();
}
	
	public void exibirMenu() {
		Scanner sc = new Scanner(System.in);
		int escolha = 0;
		do {
			
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("BEM VINDO AO CINEMA ESCOLHA UMA DAS OPCOES");
		System.out.println("1- RESERVAR");
		System.out.println("2 - CANCELAR RESERVA");
		System.out.println("3 - MOSTRAR MAPA");
		System.out.println("4 - QUANTIDADES OCUPADOS E LIVRES");
		System.out.println("5 sair");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		escolha = sc.nextInt();
		
		switch(escolha) {
		case 1:
			System.out.println("digite o numero de assentos");
			int assentos = sc.nextInt();
			opcoes.reservaAssentos(assentos);
			break;
			
		case 2:
			System.out.println("digite a linha e a coluna da reserva para cancelar");
			int linha = sc.nextInt();
			int coluna = sc.nextInt();
			opcoes.cancelaReserva(linha, coluna);
			break;
			
		case 3:
			opcoes.mostraMapa();
			break;
		
		case 4:
			opcoes.quantidades();
		}
		
		} while (escolha != 5);
	
		sc.close();
	}
		
}
