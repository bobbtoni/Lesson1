package homework;

public class Homework2 {
	
	public static boolean checkIntervalSum(int a, int b) {
		int sum = a + b;
		return sum >= 10 && sum <= 20;
	}
	
	public static void printNumberSign(int a) {
		System.out.println(a < 0 ? "Отрицательное" : "Положительное");
	}
	
	public static boolean isValueNegative(int value) {
		return value < 0;
	}
	
	public static void printLineMultipleTimes(String line, int times) {
		for (int i=0; i<times; i++) {
			System.out.println(line);
		}
	}
	
	public static boolean isHighGrowthYear(int year) {
		boolean yearIsHighGrowth = false;
		if (year % 400 == 0) {
			yearIsHighGrowth = true;
		} else if (year % 100 == 0) {
			yearIsHighGrowth = false;
		} else if (year % 4 == 0) {
			yearIsHighGrowth = true;
		}
		return yearIsHighGrowth;
	}
}
