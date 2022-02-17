package hw11Q3Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {
	public void maths() {
		System.out.println("This is a non abstract or implemented method named as maths");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("This is from void type method named as aeronauticalInfo.");

	}

	@Override
	public void mechanicalLab() {
		System.out.println("This is from void type method named as mechanicalLab.");

	}
}
