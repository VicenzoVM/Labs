package teste;
import banco.Conta;

public class TesteConta {
	
	public static void main(String[] args) {
		Conta c = new Conta(0,"12345");
	System.out.println(c);
	c.depositar(200);
	System.out.println(c);
	c.sacar(300);
	System.out.println(c);
	c.sacar(200);
	System.out.println(c);
	c.conta("vicenzo"); 

	}
	
	

}
