package cinema;

public class Assento {
	private char ocupado;
	private String posicao;
	
	public Assento() {
		this.ocupado = 'L';
		
	}
	
	public char getOcupado() {
		return ocupado;
	}
	public void setOcupado(char ocupado) {
		this.ocupado = ocupado;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	

}
