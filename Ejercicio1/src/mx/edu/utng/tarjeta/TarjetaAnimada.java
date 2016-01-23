package mx.edu.utng.tarjeta;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import mx.edu.utng.asociaciones.Contact;
import mx.edu.utng.asociaciones.ContactGroup;

public class TarjetaAnimada extends Tarjeta{
	private String codigo;
	private String fondo;
	private String dedicatoria;
	private File imagen;
	
	private List<Imagen>imagens;
	private List<Dedicatoria>dedicatorias;
	private List<Fondo>fondos;
	
	
	
	public TarjetaAnimada(List<Dedicatoria> dedicatorias) {
		this.dedicatorias = dedicatorias;//new ArrayList<Dedicatoria>();
		this.imagens=new ArrayList<Imagen>();
		this.fondos=new ArrayList<Fondo>();
	}

	public String getCodigo() {
		return codigo;
	}

	public String getFondo() {
		return fondo;
	}

	public String getDedicatoria() {
		return dedicatoria;
	}

	public File getImagen() {
		return imagen;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setFondo(String fondo) {
		this.fondo = fondo;
	}

	public void setDedicatoria(String dedicatoria) {
		this.dedicatoria = dedicatoria;
	}

	public void setImagen(File imagen) {
		this.imagen = imagen;
	}
	

}
