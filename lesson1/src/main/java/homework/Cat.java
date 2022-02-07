package homework;

public class Cat {
    private String name;
    private int appetite;
    private Saturation saturation = Saturation.HUNGRY;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    
	public String getName() {
		return name;
	}

	public int getAppetite() {
		return appetite;
	}
    
	public void eat(Plate p) {
		saturation = p.decreaseFood(appetite) ? Saturation.FULL : Saturation.HUNGRY;
    }
	
	public String info() {
		return "Кот " + name + ", состояние: " + saturation.ruTitle();
	}
    
	public static enum Saturation {
		FULL("Сыт"), HUNGRY("Голоден");
		
		private String title;
		
		Saturation(String title) {
			this.title = title;
		}
		
		public String ruTitle() {
			return title;
		}
	}
}