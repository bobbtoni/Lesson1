package homework;

import java.math.BigDecimal;

public class Person {
	private String fullName;
	private String position;
	private String email;
	private String phone;
	private BigDecimal wage;
	private int age;
	
	public Person(String fullName, String position, String email, String phone, BigDecimal wage, int age) {
		this.fullName = fullName;
		this.position = position;
		this.email = email;
		this.phone = phone;
		this.wage = wage;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(fullName);
		builder.append(" {");
		builder.append("\n");
		builder.append("    position: ");
		builder.append(position);
		builder.append("\n");
		builder.append("    email:    ");
		builder.append(email);
		builder.append("\n");
		builder.append("    phone:    ");
		builder.append(phone);
		builder.append("\n");
		builder.append("    wage:     ");
		builder.append(wage);
		builder.append("\n");
		builder.append("    age:      ");
		builder.append(age);
		builder.append("\n");
		builder.append("}");
		builder.append("\n");
		return builder.toString();
	}
}
