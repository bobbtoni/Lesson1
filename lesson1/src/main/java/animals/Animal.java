package animals;

public abstract class Animal {
	protected final String name;
	protected final int maxDistanceRun;
	protected final int maxDistanceSwim;
	
	protected Animal(String name, int maxDistanceRun, int maxDistanceSwim) {
		this.name = name;
		this.maxDistanceRun = maxDistanceRun;
		this.maxDistanceSwim = maxDistanceSwim;
	}
	
	public void run(int distance) {
		System.out.println(name + " пробежал " + (distance > maxDistanceRun ? maxDistanceRun : distance));
	}
	
	public void swim(int distance) {
		if (maxDistanceSwim > 0) {
			System.out.println(name + " проплыл " + (distance > maxDistanceSwim ? maxDistanceSwim : distance));
		} else {
			System.out.println("Увы, но " + name + " не умеет плавать");
		}
	}
}
