package mx.edu.utng.tarjeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Tarjeta {
	private String tipo;
	private String dedicatoria;
	private String remitente;
	private int noDestinatarios;
	private String destinatario[];
	//private Destinatario[] destinatario;
	private List<Remitente>remitentes;
	private List<Destinatario> destinatarios;
	Dedicatoria[]dedicatorias = new Dedicatoria[1];
	//Destinatario[]destinatarios = new Destinatario[1];
	
	public Tarjeta(){//List<Remitente>remitentes,List<Destinatario>destinatarios) {
		this.destinatarios = new ArrayList<Destinatario>();
		this.remitentes=new ArrayList<Remitente>();
		//this.remitentes=remitentes;
	//	this.destinatarios=destinatarios;
	}
	
	public String adicionarRemitente(String remitente){
		return remitente;
	}
	public String adicionarDestinatario(String destinatarios){
		return destinatarios;
		
	}

	public String getTipo() {
		return tipo;
	}

	public String getDedicatoria() {
		return dedicatoria;
	}

	public String getRemitente() {
		return remitente;
	}

	public int getNoDestinatarios() {
		return noDestinatarios;
	}

//	public Destinatario[] getDestinatario() {
//		return destinatario;
//	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setDedicatoria(String dedicatoria) {
		this.dedicatoria = dedicatoria;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public void setNoDestinatarios(int noDestinatarios) {
		this.noDestinatarios = noDestinatarios;
	}

	public void setDestinatario(String[] destinatario) {
		this.destinatario = destinatario;
	}
	public String[] getDestinatario() {
		return destinatario;
	}
//	public void setDestinatario(Destinatario[] destinatario) {
//		this.destinatario = destinatario;
//	}
	

}
