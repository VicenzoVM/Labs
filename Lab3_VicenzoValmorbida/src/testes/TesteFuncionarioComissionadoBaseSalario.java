package testes;
import funcionarios.FuncionarioComissionadoBaseSalario;


public class TesteFuncionarioComissionadoBaseSalario {
	public static void main(String[] args) {
		FuncionarioComissionadoBaseSalario fc = new FuncionarioComissionadoBaseSalario("Jessica","123.456.789-10",0.1,20000, 1000);
		System.out.println(fc.getRendimentos());
	}

}
