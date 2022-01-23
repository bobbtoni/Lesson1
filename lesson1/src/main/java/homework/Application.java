package homework;

import java.math.BigDecimal;

public class Application {
	
	public static void main(String[] args) {
		Person[] persons = fillPerons();
		printPersonsOldThen(persons, 40);
	}
	
	private static Person[] fillPerons() {
		Person[] persArray = new Person[5];
		persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", new BigDecimal(30000), 30);
		persArray[1] = new Person("Ivanov Sergey", "Engineer", "ivser@mailbox.com", "892312313", new BigDecimal(40000), 31);
		persArray[2] = new Person("Ivanov Nikolay", "Engineer", "ivivan@mailbox.com", "892312312", new BigDecimal(50000), 40);
		persArray[3] = new Person("Ivanov Alexandr", "Engineer", "ivivan@mailbox.com", "892312312", new BigDecimal(60000), 30);
		persArray[4] = new Person("Ivanov Alexey", "Engineer", "ivivan@mailbox.com", "892312312", new BigDecimal(70000), 41);
		return persArray;
	}
	
	private static void printPersonsOldThen(Person[] persons, int ageLine) {
		for(int i = 0; i < persons.length; i++) {
			if (persons[i].getAge() >= ageLine) {
				System.out.println(persons[i].toString());
			}
		}
	}
}
