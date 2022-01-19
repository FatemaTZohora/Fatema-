/*02) Create a package name "hw5Q2Constructor" in your Home Work project. 
 * Inside the package, a) Create a class "Computer". Declare some variable -- brand, 
 * model, operating system, price, madeInUSA, grade (grade as char). Declare default constructor and one parameterized constructor. Use only one System.out.println() in each constructor. b) Create another class ComputerTest. Create object from Computer class, as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as -> This is from default Constructor of Computer class. Second outcome as-> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: A and Made in USA? Ans: false. I want the third outcome in console for your configuration. (Assume you are a Windows user even you are not). Organize your code. Push in the github. Paste your github link below.*/

package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;

//default constructor (no argument constructor) declared

	public Computer() {
		System.out.println("This default Constructor is from Computer class");
	}

//Parameterized Constructor  declared

	public Computer(String brand, String model, String operatingSystem, int price, boolean madeInUSA, char grade) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.madeInUSA = madeInUSA;
		this.grade = grade;

		System.out.println("\nMy brand: " + brand + "\nmodel: " + model + "\nOperating system: " + operatingSystem
				+ "\nPrice:$" + price + "\nGrade: " + grade + "\nMade in USA? Ans: " + madeInUSA);

	}
}
