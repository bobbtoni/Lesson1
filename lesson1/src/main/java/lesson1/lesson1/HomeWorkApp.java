package lesson1.lesson1;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp {
	public static void main(String[] args) {
		// to do something
	}
	
	private static void printThreeWords() {
		Arrays.asList("Orange", "Banana", "Apple").forEach(System.out::println);
	}
	
	private static void checkSumSign() {
		int a = new Random().nextInt();
		int b = new Random().nextInt();
		System.out.println(a + b < 0 ? "Сумма отрицательная" : "Сумма положительная");
	}
	
	private static void printColor() {
		int value = new Random().nextInt();
		System.out.println(Color.getTitleColor(value));
	}
	
	private static void compareNumbers() {
		int a = new Random().nextInt();
		int b = new Random().nextInt();
		System.out.println(a >= b ? "a >= b" : "a < b");
	}
	
	private enum Color {
		RED("Красный"), YELLOW("Желтый"), GREEN("Зеленый");
		
		private String ruTitle;
		
		Color(String ruTitle) {
			this.ruTitle = ruTitle;
		}
		
		private static String getTitleColor(int value) {
			String title;
			if (value <= 0) {
				title = RED.ruTitle;
			} else if (value <= 100) {
				title = YELLOW.ruTitle;
			} else {
				title = GREEN.ruTitle;
			}
			return title;
		}
	}
}