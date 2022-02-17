package hw11Q3Abstraction;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public default void morgue() {
		System.out.println("This is from default type method named as morgue.");
		
	}

	public static void pharmacy() {
		System.out.println("This is from static method named as pharmacy.");
		
	}
}
