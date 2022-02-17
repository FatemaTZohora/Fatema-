package hw11Q3Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	// public abstract void chemistry(); The abstract method chemistry cannot be
	// created inside a regular Class.
	public void biology() {
		System.out.println("This is a non abstract method named as biology");
	}

	// This is a default Constructor
	public ColumbiaUniversity() {
		System.out.println("This is from default constructor named as columbiaUniversity.");

	}

	// This is a static method
	public static void columbiaUniversityInfo() {
		System.out.println("This is from static method named as columbiaUniversityInfo.");
	}
	// we can't create default method in regular class because Default methods are
	// allowed only in interfaces.
	// public default void columbiaUniversity() {
	//
	// }
	/*
	 * There are two keywords "extends" and "implements" are used for the
	 * inheritance in Java for Regular Class. Yes, a Regular Class can inherit only
	 * one Abstract Class or a regular class by extends keyword. A Regular class can
	 * also inherit more than one Interface by "implements" keyword.
	 */

	@Override
	public void commonRoom() {
		System.out.println("This is from void type method named as commonRoom.");

	}

	@Override
	public void laboratory() {
		System.out.println("This is from void type method named as laboratory.");

	}

	@Override
	public void languageClub() {
		System.out.println("This is from void type method named as languageClub.");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("This is from void type method named as emargencyRoom.");
	}

	@Override
	public void surgeryRoom() {
		System.out.println("This is from void type method named as surgeryRoom.");

	}

	@Override
	public void cafeteria() {
		System.out.println("This is from void type method named as cafeteria.");

	}

	@Override
	public void lawInfo() {
		System.out.println("This is from void type method named as lawInfo.");

	}

	@Override
	public void vocationalInfo() {
		System.out.println("This is from void type method named as vocationalInfo.");

	}

	@Override
	public void classSize() {
		System.out.println("This is from void type method named as classSize.");

	}

	@Override
	public void playGround() {
		System.out.println("This is from void type method named as playGround.");

	}

	@Override
	public void teacher() {
		System.out.println("This is from void type method named as teacher.");

	}

	@Override
	public void anatomyLab() {
		System.out.println("This is from void type method named as anatomyLab.");

	}

	@Override
	public void hygiene() {
		System.out.println("This is from void type method named as hygiene.");

	}
}
