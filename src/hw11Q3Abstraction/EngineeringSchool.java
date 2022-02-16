package hw11Q3Abstraction;

public abstract class EngineeringSchool extends NYUniversity {
	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("This is a non abstract Class named as computerLab");
	}

}
