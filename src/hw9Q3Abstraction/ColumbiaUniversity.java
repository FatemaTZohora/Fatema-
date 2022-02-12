package hw9Q3Abstraction;

public class ColumbiaUniversity extends MedicalSchool {

//public abstract void chemistry(); The abstract method chemistry cannot be created inside a regular Class.
	public void biology() {
		System.out.println("This is a non abstract method named as biology");
	}

// This is a default Constructor
	public ColumbiaUniversity() {

	}

	/*
	 * Only One keyword "extends" is used for the inheritance in Java for Regular
	 * Class. Yes, a Regular Class can inherit only one Abstract Class or a regular
	 * class by "extends" keyword but a Regular class cannot inherit an Interface by
	 * "extends" keyword. A Regular class can inherit only one abstract class or
	 * regular class by "extends" keyword.
	 */
	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

}
