package Vehiculos;

public class Aereos extends Vehiculos implements Mecanico {

	int numHelices;
	
	public Aereos() {
		super();
		this.numHelices = 0;
	}

	public Aereos(String marca, String nombre, int num, int cv, int numHelices) {
		super(marca, nombre, num, cv);
		this.numHelices = numHelices;
	}

	public int getNumHelices() {
		return numHelices;
	}

	public void setNumHelices(int numHelices) {
		this.numHelices = numHelices;
	}

	@Override
	public void arrancar() {
		System.out.println("Arrancando vehiculo aereo. "+this.nombre);		
	}

	@Override
	public void conducir() {
		System.out.println("Conduciendo vehiculo aereo.");
		
	}

	@Override
	public void reparar() {
		System.out.println("El mecanico esta reparando vehiculo aereo. "+this.nombre);
		
	}
	

}
