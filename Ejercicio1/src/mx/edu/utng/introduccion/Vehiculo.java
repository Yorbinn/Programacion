package mx.edu.utng.introduccion;
/**
 * @version 08-01-2016
 * @author George
 *
 * Primera Clase de POO
 */
public class Vehiculo implements Movible{
	
	private String marca;
	private String modelo;
	private String color;
	private int anio;
	
	private Trabajador resguardante;
	
	/**
	 * Metodo que permite arrancar el Vehículo
	 */
	public void arrancar(){
		System.out.println("Arrancando...");
	}
	/**
	 * Metodo que permite Apagar el Vehículo
	 */
	public void apagar(){
		System.out.println("Apagando...");
	}
	/**
	 * Metodo que permite acelerar el Vehículo
	 */
	public void acelerar(){
		System.out.println("Acelerando...");
	}
	/**
	 * Metodo que permite frenar el Vehículo
	 */
	public void frenar(){
		System.out.println("Frenando...");
	}
	@Override
	public void mover() {
		System.out.println("Movible..");
	}
}
