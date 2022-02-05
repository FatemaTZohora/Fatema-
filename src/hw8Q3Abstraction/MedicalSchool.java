package hw8Q3Abstraction;

public abstract class MedicalSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is a non abstract method named as biochemistryLab");
	}

	public MedicalSchool() {
	}
}
