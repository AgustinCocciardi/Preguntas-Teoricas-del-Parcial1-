package paquete;

public class Main {
	
	public static void main(String[] args) {
		//�Son validas las siguientes declaraciones? Si lo son, indicar salida por pantalla. 
		
		ClaseA c1 = new ClaseB();
		//V�lida. Salida por pantalla 
		//A
		//B
		
		c1.saludarPersona("Juan");
		
		ClaseA c2 = new ClaseC();
		//V�lida. Salida por pantalla 
		//A
		//B
		//C
		
		c2.saludarPersona("Jose");
		
		ClaseB c3 = new ClaseC();
		//V�lida. Salida por pantalla 
		//A
		//B
		//C
		
		c3.saludarPersona("Josefina");
		
//		ClaseC c4 = new ClaseA();
//		ClaseC c5 = new ClaseB();
//		ClaseB c6 = new ClaseA();
		//No v�lidas. Lanza una excepci�n por error de compilacion
		
		//ClaseC c7 = new ClaseD();
		//No v�lida. 
		
		ClaseD c8 = new ClaseC();
		//V�lida. Salida por pantalla
		//A
		//B
		//C
		
		//c8.saludarPersona("Josefa"); //No v�lido. saludarPersona es m�todo de la ClaseA
		
		//ClaseD c9 = new ClaseA();
		//No v�lido porque la ClaseA no implementa ClaseD
		
		//ClaseD c10 = new ClaseB();
		//No v�lido porque la ClaseB no implementa ClaseD
		
		//c1.saludar(); //No v�lido. Est� declarado como ClaseA y no contiene el m�todo saludar() 
		//c2.saludar(); //No v�lido. Est� declarado como ClaseA y no contiene el m�todo saludar()  
		//c3.saludar(); //No v�lido. Est� declarado como ClaseB y no contiene el m�todo saludar() 
		c8.saludar(); //V�lido. Est� declarado como ClaseD pero instanciado como ClaseC. 
	}
	
}
