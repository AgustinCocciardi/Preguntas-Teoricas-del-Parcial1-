package paquete;

public class Main {
	
	public static void main(String[] args) {
		//¿Son validas las siguientes declaraciones? Si lo son, indicar salida por pantalla. 
		
		ClaseA c1 = new ClaseB();
		//Válida. Salida por pantalla 
		//A
		//B
		
		c1.saludarPersona("Juan");
		
		ClaseA c2 = new ClaseC();
		//Válida. Salida por pantalla 
		//A
		//B
		//C
		
		c2.saludarPersona("Jose");
		
		ClaseB c3 = new ClaseC();
		//Válida. Salida por pantalla 
		//A
		//B
		//C
		
		c3.saludarPersona("Josefina");
		
//		ClaseC c4 = new ClaseA();
//		ClaseC c5 = new ClaseB();
//		ClaseB c6 = new ClaseA();
		//No válidas. Lanza una excepción por error de compilacion
		
		//ClaseC c7 = new ClaseD();
		//No válida. 
		
		ClaseD c8 = new ClaseC();
		//Válida. Salida por pantalla
		//A
		//B
		//C
		
		//c8.saludarPersona("Josefa"); //No válido. saludarPersona es método de la ClaseA
		
		//ClaseD c9 = new ClaseA();
		//No válido porque la ClaseA no implementa ClaseD
		
		//ClaseD c10 = new ClaseB();
		//No válido porque la ClaseB no implementa ClaseD
		
		//c1.saludar(); //No válido. Está declarado como ClaseA y no contiene el método saludar() 
		//c2.saludar(); //No válido. Está declarado como ClaseA y no contiene el método saludar()  
		//c3.saludar(); //No válido. Está declarado como ClaseB y no contiene el método saludar() 
		c8.saludar(); //Válido. Está declarado como ClaseD pero instanciado como ClaseC. 
	}
	
}
