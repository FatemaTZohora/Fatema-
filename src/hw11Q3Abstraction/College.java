package hw11Q3Abstraction;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {
		System.out.println("This is from default type method named as dorm.");
	}

	public static void studyRoom() {
		System.out.println("This is from static method named as studyRoom.");
	}
}
