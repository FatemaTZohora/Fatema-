package hw10Q2UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("This is a default constructor from Father Class.");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father's name: " + name + ",\nAge: " + age + ",\nSex: " + sex
				+ "\nIs Father UsCitizen? Ans: " + usCitizen);
	}

	public void father() {
		System.out.println("This is a void type method from Father Class");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father's name: " + name + " ,\nAge: " + age + " ,\nSex: " + sex
				+ "\nIs Father UsCitizen? Ans: " + usCitizen);

	}
}
