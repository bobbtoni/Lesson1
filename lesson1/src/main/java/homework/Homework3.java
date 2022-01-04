package homework;

import java.util.Arrays;

public class Homework3 {
	public static void main(String[] args) {
		// Задание 1
		System.out.println("Задание 1");
		int[] array = new int[] {1, 1, 0};
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(upendArray(array)));
		
		// Задание 2
		System.out.println("Задание 2");
		System.out.println(Arrays.toString(createArray()));
		
		// Задание 3
		System.out.println("Задание 3");
		int[] array1 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		System.out.println(Arrays.toString(doubleNumberLessSix(array1)));
		
		// Задание 4
		System.out.println("Задание 4");
		int[][] array2 = createArrayAndFillDiagonals(9);
		for (int i = 0; i < array2.length; i++) {
			System.out.println(Arrays.toString(array2[i]));
		}
		
		// Задание 5
		System.out.println("Задание 5");
		System.out.println(Arrays.toString(createAndFillArray(10, 3)));
		
		// Задание 6
		System.out.println("Задание 6");
		int[] array3 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		printMaxAndMinElements(array3);
		
		// Задание 7
		System.out.println("Задание 7");
		int[] array4 = new int[] {2, 2, 2, 1, 2, 2, 10, 1};
		System.out.println(checkBalance(array4));
		
		// Задание 8
		System.out.println("Задание 8");
		int[] array5 = new int[] {3, 5, 6, 1};
		shiftArray(array5, 2);
		System.out.println(Arrays.toString(array5));
	}
	
	public static int[] upendArray(int[] array) {
		int[] result = new int[array.length];
		for (int i=0; i < array.length; i++) {
			result[i] = array[i] == 1 ? 0 : 1;
		}
		return result;
	}
	
	public static int[] createArray() {
		int[] result = new int[100];
		for (int i=0; i<100; i++) {
			result[i] = i+1;
		}
		return result;
	}
	
	public static int[] doubleNumberLessSix(int[] array) {
		for (int i=0; i < array.length; i++) {
			if (array[i] < 6) {
				array[i] = array[i] * 2;
			}
		}
		return array;
	}
	
	public static int[][] createArrayAndFillDiagonals(int size) {
		int[][] array = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j=0; j < size; j++) {
				array[i][i] = 1;
				array[i][size-i-1] = 1;
			}
		}
		return array;
	}
	
	public static int[] createAndFillArray(int len, int initialValue) {
		int[] array = new int[len];
		for (int i=0; i < len; i++) {
			array[i] = initialValue;
		}
		return array;
	}
	
	public static void printMaxAndMinElements(int[] array) {
		if (array.length == 0) {
			System.out.println("Array is empty");
		}
		
		int max = array[0];
		int min = max;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}
	
	public static boolean checkBalance(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int leftSum = 0;
			for (int j=0; j <= i; j++) {
				leftSum += array[j];
			}
			int rightSum = 0;
			for (int j=i+1; j < array.length; j++) {
				rightSum += array[j];
			}
			if (leftSum == rightSum) {
				return true;
			}
		}
		return false;
	}
	
	public static void shiftArray(int[] array, int offset) {
		if (offset == 0) {
			return;
		} else if (offset > 0) {
			for (int i = 0; i < offset; i++) {
				shiftToRight(array);
			}
		} else {
			for (int i = 0; i < -offset; i++) {
				shiftToLeft(array);
			}
		}
	}
	
	public static void shiftToRight(int[] array) {
		int lastElement = array[array.length-1];
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i-1];
		}
		array[0] = lastElement;
	}
	
	public static void shiftToLeft(int[] array) {
		int firstElement = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i+1];
		}
		array[array.length - 1] = firstElement;
	}
	
}

