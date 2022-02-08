package hw9Q2Encapsulation;

public class Employee {
	private String Name;
	private int Age;
	private char Sex;
	private boolean UsCitizen;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public char getSex() {
		return Sex;
	}

	public void setSex(char sex) {
		Sex = sex;
	}

	public boolean isUsCitizen() {
		return UsCitizen;
	}

	public void setUsCitizen(boolean usCitizen) {
		this.UsCitizen = usCitizen;
	}
}
