package testes;
import funcionarios.FuncionarioComissionado;

public class TesteFuncionarioComissionado {
	public static void main(String[] args) {
		FuncionarioComissionado fc = new FuncionarioComissionado("Henrique","258.228.595-18",0.05,10000);
		System.out.println(fc.getRendimentos());
	}

}
