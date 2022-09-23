package testes;
import funcionalidades.Opcoes;


public class TesteOpcoes {
	public static void main(String[] args) {
		Opcoes o = new Opcoes();
		o.reservaAssentos(1);
		o.cancelaReserva(1, 1);
		o.mostraMapa();
		o.quantidades();
		
	}

}
