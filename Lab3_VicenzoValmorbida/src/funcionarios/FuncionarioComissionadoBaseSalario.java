package funcionarios;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
	private double salario;
	
	public FuncionarioComissionadoBaseSalario(String nome, String cpf,double taxaComissao, double vendasBrutas,double salario) {
		super(nome, cpf, taxaComissao, vendasBrutas);
		this.salario = salario;
		
	}
	@Override
	public double getRendimentos() {
		return salario +(getVendasBrutas() * getTaxaComissao());
		
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
