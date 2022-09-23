package cinema;

public class Mapa {
	Assento [] [] assentos;
	
		
	
public Mapa()	{
	this.assentos = new Assento[12][14];
	for (int i = 0; i <12; i++){
	     for (int j = 0; j<14; j++){
	    	 assentos[i][j] = new Assento();
	     }
	}

}

public Assento[][] getAssentos() {
	return assentos;
}

public void setAssentos(Assento[][] assentos) {
	this.assentos = assentos;
}

}
