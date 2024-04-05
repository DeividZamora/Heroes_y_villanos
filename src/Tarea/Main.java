package Tarea;

public class Main {

	public static void main(String[] args) 
	{
		System.out.println("Lista de heroes");

	//-------------------------------------------
		
		Persona Tony_Stark = new Persona("Tony stark", 35);
		System.out.println(Tony_Stark.name +": "+ Tony_Stark.edad);
		
		SuperHeroe iron_man = new SuperHeroe(Tony_Stark.name, Tony_Stark.edad );
	
		iron_man.heroName= "iron man";
		iron_man.powers= new String []{"volar", "pelear"};
		iron_man.MostrarPoderes();

		iron_man.setCity("Bucaramanga");
		System.out.println(iron_man.city + ": "+ iron_man.heroName);
		System.out.println("------------------------------");

	//------------------------------------------
	
		Persona goku = new Persona("Goku", 30);
		System.out.println(goku.name + ": "+ goku.edad);
	
		SuperHeroe Goku = new SuperHeroe(goku.name, goku.edad );
	
		Goku.heroName= "Goku";
		Goku.powers= new String []{"volar", "pelear"};
		Goku.MostrarPoderes();
		Goku.setCity("Japón");
		System.out.println(Goku.city + ": "+ Goku.heroName);
		System.out.println("------------------------------");

	//------------------------------------------
	Persona ClarkKent = new Persona("Clark Kent", 40);
		SuperHeroe superman = new SuperHeroe(ClarkKent.name, ClarkKent.edad );
		System.out.println(ClarkKent.name +": "+ ClarkKent.edad);
	
		superman.heroName= "Super man";
		superman.powers= new String []{"volar", "pelear"};
		superman.MostrarPoderes();
		superman.setCity("EEUU");
		System.out.println(superman.city + ": "+ superman.heroName);
		System.out.println("------------------------------");

	//------------------------------------------
		Persona CharlesOcoro = new Persona("Charles Ocoro", 62);
		SuperHeroe ProfesorSuperO = new SuperHeroe(CharlesOcoro.name, CharlesOcoro.edad );
		System.out.println(CharlesOcoro.name +": "+ CharlesOcoro.edad);
	
		ProfesorSuperO.heroName= "profesor super o";
		ProfesorSuperO.powers= new String []{"corregir", "enseñar"};
		ProfesorSuperO.MostrarPoderes();
		ProfesorSuperO.setCity("Quibdó");
		System.out.println(ProfesorSuperO.city + ": "+ ProfesorSuperO.heroName);
		System.out.println("------------------------------");

	//------------------------------------------
		Persona Bellota = new Persona("Bellota", 5);
		SuperHeroe bellota = new SuperHeroe(Bellota.name, Bellota.edad );
		System.out.println(Bellota.name +": "+ Bellota.edad);
	
		bellota.heroName= "bellota";
		bellota.powers= new String []{"volar", "pelear"};
		bellota.MostrarPoderes();

		bellota.setCity("Saltadilla");
		System.out.println(bellota.city + ": "+ bellota.heroName);
		System.out.println("------------------------------");

	//------------------------------------------
		Persona burbuja = new Persona("Burbuja", 6);
		SuperHeroe Burbuja = new SuperHeroe(burbuja.name, burbuja.edad );
		System.out.println(burbuja.name +": "+ burbuja.edad);

		Burbuja.heroName= "burbuja";
		Burbuja.powers= new String []{"volar", "pelear"};
		Burbuja.MostrarPoderes();

		bellota.setCity("Saltadilla");
		System.out.println(Burbuja.city + ": "+ Burbuja.heroName);
		System.out.println("------------------------------");

	//------------------------------------------
		Persona bombon = new Persona("Bombon", 11);
		SuperHeroe Bombon = new SuperHeroe(bombon.name, bombon.edad );
		System.out.println(bombon.name +": "+ bombon.edad);

		Bombon.heroName= "burbuja";
		Bombon.powers= new String []{"volar", "pelear"};
		Bombon.MostrarPoderes();

		Bombon.setCity("Saltadilla");
		System.out.println(Bombon.city + ": "+ Bombon.heroName);
		System.out.println("------------------------------");

	//------------------------------------------
	Persona PeterParker = new Persona("Peter Parker",22);
		SuperHeroe Spiderman = new SuperHeroe(PeterParker.name, PeterParker.edad );
		System.out.println(PeterParker.name +": "+ PeterParker.edad);
	
		Spiderman.heroName= "Spiderman";
		Spiderman.powers= new String []{"telaraña", "pelear"};
		Spiderman.MostrarPoderes();

		Spiderman.setCity("New York");
		System.out.println(Spiderman.city + ": "+ Spiderman.heroName);
		System.out.println("------------------------------");

	//------------------------------------------
		Persona BruceBaner = new Persona("Bruce Baner", 38);
		SuperHeroe Hulk = new SuperHeroe(BruceBaner.name, BruceBaner.edad );
		System.out.println(Hulk.name +": "+ Hulk.edad);
	
		Hulk.heroName= "Hulk";
		Hulk.powers= new String []{"super fuerza", "pelear"};
		Hulk.MostrarPoderes();

		Hulk.setCity("Barrancabermeja");
		System.out.println(Hulk.city + ": "+ Hulk.heroName);
		System.out.println("------------------------------");
	
	
	//------------------------------------------
		Persona SteveRogers = new Persona("Steve Rogers", 42);
		SuperHeroe CapitanAmerica = new SuperHeroe(SteveRogers.name, SteveRogers.edad );
		System.out.println(CapitanAmerica.name +": "+ CapitanAmerica.edad);
	
		CapitanAmerica.heroName= "capitan america";
		CapitanAmerica.powers= new String []{"pegar", "pelear"};
		CapitanAmerica.MostrarPoderes();

		CapitanAmerica.setCity("Boyacá");
		System.out.println(CapitanAmerica.city + ": "+ CapitanAmerica.heroName);
		System.out.println("------------------------------");

	//------------------------------------------
		
		System.out.println("Lista de villanos");
		
		//-------------------------------------------
		
				Persona EddieBrock = new Persona("Eddie Brock", 28);
				System.out.println(EddieBrock.name +": "+ EddieBrock.edad);
				
				Villano venom = new Villano(EddieBrock.name, EddieBrock.edad );
			
				venom.heroName= "Venom";
				venom.powers= new String []{"Telaraña", "pelear"};

				venom.setCity("Cityblable");
				System.out.println(venom.city + ": "+ venom.heroName);
				System.out.println("------------------------------");

			
		
	
	}


}
