package homework;

public class Application {
	public static void main(String[] args) {
		Cat[] cats = new Cat[10];
		for (int i=0; i<10; i++) {
			cats[i] = new Cat("Cat №" + (i+1), i);
		}
        Plate plate = new Plate(5);
        for (int i = 0; i < cats.length; i++) {
        	cats[i].eat(plate);
        	System.out.println(cats[i].info());
        }
    }
}
