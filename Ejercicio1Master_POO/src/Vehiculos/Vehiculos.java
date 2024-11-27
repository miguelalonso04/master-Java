package Vehiculos;

public abstract class Vehiculos {

	String marca;
	String nombre;
	int numMaxPasajeros;
	int cv;
	
	protected Vehiculos() {
		this.marca = "";
		this.nombre = "";
		this.numMaxPasajeros = 4;
		this.cv = 0;
	}
	
	protected Vehiculos(String marca, String nombre, int num, int cv) {
		this.marca = marca;
		this.nombre = nombre;
		this.numMaxPasajeros = num;
		this.cv = cv;
	}
	
	public abstract void arrancar();
	
	public abstract void conducir();
	
}
