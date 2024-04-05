package Tarea;

public class Villano extends Persona {

	public Villano(String name, int edad) {
		super(name, edad);
	}
	String heroName;
	String powers[];
	
	private void MostrarPoderes()
	{
		for(int i = 0; i<powers.length; i++)
		{System.out.println(powers[i]);}
		
	}
}
