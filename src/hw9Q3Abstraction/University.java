package hw9Q3Abstraction;

public interface University extends College, Hospital {
	public void classSize();

	public void playGround();

	public void teacher();

	// public University(); this default Constructor cannot be created because an
	// Interface cannot have Constructor.
	public default void gymnasium() {

	}

	public static void library() {

	}
	/*
	 * Only one keyword "extends" is used for the inheritance in Interface. An
	 * Interface can inherit one or more than one Interfaces by extends keyword. an
	 * Interface cannot inherit an abstract class or a regular class by extends keyword.
	 */
}
