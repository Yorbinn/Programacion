package utng.edu.mx;

/**
 * @author George Tejeda Llamas March-05-2016
 * @version 1
 *
 */
public class Cliente {
	//Constructor donde se realizan las relaciones
	public Cliente() {
		AVerificador aVerificador = new AVerificador() {
			
			@Override
			public void getCredito() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void getBanco() {
				// TODO Auto-generated method stub
				
			}
		};
		IBanco iBanco = new IBanco() {
			
			@Override
			public void operacionesBancarias() {
				// TODO Auto-generated method stub
				
			}
		};
		ICredito iCredito = new ICredito() {
			
			@Override
			public void estadoCrediticio() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
