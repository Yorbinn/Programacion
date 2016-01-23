package mx.edu.utng.asociaciones;

import java.util.List;

public class Account {
	private String name;
	private String emailAddress;
	private List<AddressBook>isAccessBy;
	
	//pasar como parametro el anterior para ser agregacion
	public Account() {
		this.isAccessBy=isAccessBy;   //con esto se convierte en una agregacion.
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}
