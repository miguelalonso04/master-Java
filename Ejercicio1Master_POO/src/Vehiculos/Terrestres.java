package Vehiculos;

public class Terrestres extends Vehiculos implements Mecanico {

	int numRuedas;
	
	public Terrestres() {
		super();
		this.numRuedas = 4;
	}
	
	

	public Terrestres(String nombre, String marca, int num, int cv,int numRuedas) {
		super(nombre,marca,num,cv);
		this.numRuedas = numRuedas;
	}
	
	public void setNumRuedas(int num) {
		this.numRuedas = num;
	}
	
	public int getNumRuedas() {
		return this.numRuedas;
	} 



	@Override
	public void arrancar() {
		System.out.println("Arrancando vehiculo terrestre. "+this.nombre);
		
	}

	@Override
	public void conducir() {
		System.out.println("Conduciendo vehiculo terrestre. "+this.nombre + " con "+this.cv+" CV de potencia");
	}



	@Override
	public void reparar() {
		System.out.println("El mecanico esta reparando vehiculo terrestre. "+this.nombre);
		
	}

}
