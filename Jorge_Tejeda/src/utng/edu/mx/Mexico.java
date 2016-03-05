package utng.edu.mx;
/**
 * @author George Tejeda Llamas March-05-2016
 * @version 1
 *
 */
public class Mexico extends AVerificador {
	//Método Constructor
	public Mexico() {
		BancoMexico bancoMexico = new BancoMexico();
		CreditoMexico creditoMexico = new CreditoMexico();
	}

	//Metodos Heredados de AVerificador
	public void getBanco() {
		System.out.println("BBVA");	
	}

	public void getCredito() {
		System.out.println("Bancario");	
	}

	
}
