package hw10Q3Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

//public abstract void chemistry(); The abstract method chemistry cannot be created inside a regular Class.
	public void biology() {
		System.out.println("This is a non abstract method named as biology");
	}

// This is a default Constructor
	public ColumbiaUniversity() {

	}
	/*
	 * There are two keywords "extends" and "implements" are used for the
	 * inheritance in Java for Regular Class. Yes, a Regular Class can inherit only
	 * one Abstract Class or a regular class by extends keyword. A Regular class can
	 * also inherit more than one Interface by "implements" keyword.
	 */

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}
}
