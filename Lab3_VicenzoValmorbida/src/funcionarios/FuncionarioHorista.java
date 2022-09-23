package funcionarios;

public class FuncionarioHorista extends Funcionario {
	private double horasTrabalhadas;
	private double salarioPorHora;
	private double salario;
	
	public FuncionarioHorista(String nome, String cpf, double horasTrabalhadas,double salarioPorHora ) {
		super(nome, cpf);
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioPorHora = salarioPorHora;
		
		if(this.horasTrabalhadas < 40)
			this.salario = this.salarioPorHora * this.horasTrabalhadas;
		
	    if (this.horasTrabalhadas > 40) {
			this.salario = 40 * this.salarioPorHora + (this.horasTrabalhadas - 40) * salarioPorHora * 1.5;
			
	    }
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
