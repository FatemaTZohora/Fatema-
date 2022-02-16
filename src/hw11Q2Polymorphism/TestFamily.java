package hw11Q2Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n----------------This is from Sister--------------");
		Sister sister = new Sister();
		sister.sister();
		sister.sister(22, 23, 24);
		sister.sister("33", 44, 26);
		Sister.sister(14, 45, "34");
		sister.sister(18, 25);
		System.out.println("\n----------------This is from Niece--------------");
		Niece niece = new Niece();
		niece.sister();
		niece.sister(22, 23, 24);
	}
}
