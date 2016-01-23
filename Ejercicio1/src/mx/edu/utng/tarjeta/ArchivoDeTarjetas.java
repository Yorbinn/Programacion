package mx.edu.utng.tarjeta;

import java.util.ArrayList;
import java.util.List;

public class ArchivoDeTarjetas {
	private String nombre;
	
	private List<TarjetaAnimada> tarjetaAnimadas;
	
	public ArchivoDeTarjetas() {
		this.tarjetaAnimadas = new ArrayList<TarjetaAnimada>();
	}
	
	public String adicionar(String tarjeta){
		return tarjeta;
	}
	public String modificar(String tarjeta){
		return tarjeta;
	}
	public String eliminar(String tarjeta){
		return tarjeta;
	}
	public void getDatos() {
		return;
	}
	public void nroRegistro() {
		return;
	}
	public void generarCodigo() {
		return;
	}
	public void obtener(String codigo){
		return;
	}	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
