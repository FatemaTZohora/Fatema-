package hw11Q3Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is a non abstract method named as biochemistryLab");
	}

	public MedicalSchool() {
	}

	public static void medicalSchoolInfo() {
		System.out.println("This is a static method named as medicalSchoolInfo.");
	}

	/*
	 * There are two keywords "extends" and "implements" are used for the
	 * inheritance in Java for Abstract Class. Yes, an Abstract Class can inherit an
	 * abstract Class or a regular class by "extends" keyword. Also an abstract
	 * class can inherit more than one Interface by "implements" keyword. an
	 * abstract class cannot inherit a regular class or abstract class by implements
	 * keyword.
	 */

	// we can't create default method in abstract class because Default methods are
	// allowed only in interfaces.
	// public default void medicalSchool() {
	//
	// }
}
