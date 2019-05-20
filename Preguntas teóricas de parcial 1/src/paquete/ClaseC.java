package paquete;

public class ClaseC extends ClaseB implements ClaseD{

	public ClaseC() {
		super();
		System.out.println("C");
	}

	@Override
	public void saludarPersona(String persona) {
		System.out.println("Hola " + persona + " ¿Como estas? Yo estoy bien");
	}
	
	@Override
	public void saludar() {
		System.out.println("Hola a todos");
	}
	
}
