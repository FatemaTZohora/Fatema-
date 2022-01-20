package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		// default Constructor is initialized:
		Computer computer01 = new Computer();

		System.out.println("______________________________________");

		
		//2 Parameterized Constructors initialized here:
		
		Computer computer02 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, false, 'A');

		System.out.println("__________________________________________");

		Computer computer03 = new Computer("Dell", "Inspiron 15", "Windows 11 Pro", 899, false, 'A');

	}

}
