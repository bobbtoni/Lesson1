package animals;

public abstract class AnimalFactory {
	private static int counterAnimals = 0;
	
	public static Animal dog(String name) {
		counterAnimals++;
		return new Dog(name);
	}
	
	public static Animal cat(String name) {
		counterAnimals++;
		return new Cat(name);
	}
	
	public static int getCountCreatedAnimals() {
		return counterAnimals;
	}
} 
