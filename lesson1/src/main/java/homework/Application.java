package homework;

import animals.Animal;
import animals.AnimalFactory;

public class Application {
	public static void main(String[] args) {
		Animal dogBobik = AnimalFactory.dog("Бобик");
		Animal catMurzik = AnimalFactory.cat("Мурзик");
		
		dogBobik.run(700);
		catMurzik.run(30);
		
		dogBobik.swim(10);
		catMurzik.swim(100);
		
		System.out.println();
		System.out.println("Всего создано животных: " + AnimalFactory.getCountCreatedAnimals());
	}
}
