package homework;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Food amount: " + food);
    }
    
    public boolean decreaseFood(int amount) {
    	if (amount > food) {
    		return false;
    	}
        food -= amount;
        return true;
    }
    
    public void putFood(int amount) {
    	food += amount;
    }

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}
    
    
}
