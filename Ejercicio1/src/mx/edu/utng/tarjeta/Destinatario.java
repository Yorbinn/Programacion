package mx.edu.utng.tarjeta;

public class Destinatario extends Persona{
	private String correo;
	private String apodoDestinatario;
	
	public Destinatario() {
		
	}

	public String getCorreo() {
		return correo;
	}

	public String getApodoDestinatario() {
		return apodoDestinatario;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setApodoDestinatario(String apodoDestinatario) {
		this.apodoDestinatario = apodoDestinatario;
	}
	

}
