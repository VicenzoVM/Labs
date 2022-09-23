package funcionalidades;
import java.util.Scanner;
import cinema.Mapa;


public class Opcoes {
	Mapa mapa;
	

	public Opcoes() {
		this.mapa = new Mapa();
		}
	
	public void reservaAssentos(int nreservas) { 
		int linha, coluna;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		while(i < nreservas) {
			System.out.print("insira a linha do assento desejado \n");
			linha = sc.nextInt();
			System.out.println("insira a coluna do assento desejado \n");
			coluna = sc.nextInt();
			
				if(mapa.getAssentos()[linha -1][coluna-1].getOcupado()== 'L') {
					mapa.getAssentos()[linha-1][coluna-1].setOcupado('O');
					System.out.println("reserva" + " n " +(i + 1) + " realizada com sucesso");
					i++;
					
				}
				
				else if(mapa.getAssentos()[linha-1][coluna-1].getOcupado() =='O')  { 
					   System.out.println("reserva" + " n " +(i + 1) + " falhou: lugar ocupado (tente outro lugar)");
					  
				}
					
					
				
				
			
				}
		
				
		sc.close();
		}
		
				
	
	
	public void cancelaReserva(int linha, int coluna) { 
		if(mapa.getAssentos()[linha][coluna].getOcupado()== 'O') {
			mapa.getAssentos()[linha][coluna].setOcupado('L');
			System.out.println("Reserva cancelada com sucesso");
		}
		else
			System.out.println("Nao existe nenhuma reserva neste local");
			
		
	}
	public void mostraMapa() { 
		System.out.println("MARCADOS COM L = LIVRE, MARCADOS COM O = OCUPADOS");
		char letra = 'A';
		
		
		System.out.println(" 1  2  3  4  5  6  7  8  9 10 11 12 13 14");
		
		for (int i = 0; i<12; i++){
		     for (int j = 0; j<14; j++){
		
			
					System.out.print("["+mapa.getAssentos()[i][j].getOcupado()+"]");
		
			
			}		
			System.out.println(" " + letra++);	
		    	
		    }
		    	
		}
	public void quantidades() {
		int livres =0 ;
		int ocupados = 0;
		
		for (int i = 0; i<12; i++) {
		     for (int j = 0; j<14; j++) {
		    	 if(mapa.getAssentos()[i][j].getOcupado()=='O') {
		    		 ocupados++;
		    	 }
		    	 else 
		    		 livres++;
		    	 
		     }
		} 
		System.out.println("OCUPADOS: " + ocupados + " " + "LIVRES: " + livres);
	}	     
	
		 
	

	public Mapa getMapa() {
		return mapa;
	}

	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}
	
	
	

}
