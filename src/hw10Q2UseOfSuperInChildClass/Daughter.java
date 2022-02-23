package hw10Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super("Anwar Karim", 62, 'M', false);
		super.fatherInfo("Anwar Karim", 62, 'M', false);
		super.familyName = "Karim Family";
		System.out.println("The family name is: " + familyName);
		System.out.println("This is a default constructor from Daughter Class.");

	}

	public Daughter(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth month is " + birthMonth + " and Age is " + age);
	}

	public void daughter() {
		System.out.println("This is a void type method from Daughter Class");
	}

	public void daughterInfo(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth month is " + birthMonth + " and Age is " + age);
	}
}
