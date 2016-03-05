package utng.edu.mx;
/**
 * @author George Tejeda Llamas March-05-2016
 * @version 1
 *
 */
public class USA extends AVerificador {
	//Método Constructor
	public USA() {
		BancoUSA bancoUSA = new BancoUSA();
		CreditoUSA creditoUSA = new CreditoUSA();
	}
	//Metodos Heredados de AVerivicador

	public void getBanco() {
		System.out.println("BBVA");	
	}

	public void getCredito() {
		System.out.println("Bancario");	
	}


}
