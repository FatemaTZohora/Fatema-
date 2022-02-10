package hw9Q3Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is a non abstract method named as biochemistryLab");
	}

	public MedicalSchool() {
	}
	/*
	 * Only One keyword "extends" is used for the inheritance in Java for Abstract
	 * Class. Yes, an Abstract Class can inherit other Abstract Class or a regular
	 * class by extends keyword but abstract class cannot inherit an Interface by
	 * extends keyword. An abstract class can inherit only one abstract class or
	 * regular class by extends keyword.
	 */
}
