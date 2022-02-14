package hw10Q2UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("---------- default constructor initialized for Father Class ----------");
		Father father = new Father();

		System.out.println("---------- parameterized constructor initialized for Father Class ----------");
		Father fatherInfo = new Father("Anwar Karim", 62, 'M', false);

		System.out.println("\n---------- void type method initialized for Father Class ----------");
		father.father();

		System.out.println("---------- parameterized method initialized for Father Class ----------");
		father.fatherInfo("Anwar Kaim", 62, 'M', false);

		System.out.println("---------- default constructor initialized for Daughter Class ----------");
		Daughter daughter = new Daughter();

		System.out.println("---------- parameterized constructor initialized for Daughter Class ----------");
		Daughter daughterInfo = new Daughter("January", 22);

		System.out.println("---------- void type method initialized for Daughter Class ----------");
		daughter.daughter();

		System.out.println("---------- parameterized method initialized for Daughter Class ----------");
		daughter.daughterInfo("January", 22);

	}
}
