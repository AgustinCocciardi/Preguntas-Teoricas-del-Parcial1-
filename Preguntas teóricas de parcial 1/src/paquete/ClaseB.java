package paquete;

public class ClaseB extends ClaseA{

	public ClaseB() {
		super();
		System.out.println("B");
	}
	
	@Override
	public void saludarPersona(String persona) {
		System.out.println("Hola " + persona + " ¿Como estas?");
	}
	
}
