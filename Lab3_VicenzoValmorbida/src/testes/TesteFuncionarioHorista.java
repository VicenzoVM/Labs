package testes;
import funcionarios.FuncionarioHorista;

public class TesteFuncionarioHorista {
	public static void main(String[] args) {
		FuncionarioHorista fc = new FuncionarioHorista("MARIO","232.232.232-98",20,2);
		System.out.println(fc.getSalario());
		
		FuncionarioHorista fc2 = new FuncionarioHorista("MARIO","232.232.232-98",45,2);
		System.out.println(fc2.getSalario());
	} 

}
