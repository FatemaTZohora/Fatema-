package hw8Q2Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("\n----------------------------------------------------\n");

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		/*
		 * Here BullDog is child class and Dog is Parent class.
		 * "BullDog extends Dog"--This is an example of single Inheritance.
		 * "BullDog extends Dog, Dog extends Mammal, Mammal extends Animal"--this is an example of Multi-level Inheritance.
		 * "Dog extends Animal, BullDog extends Animal, Mammal extends Animal"--this is an example of Hierarchical Inheritance.
		 */
		System.out.println("\n----------------------------------------------------\n");

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		/*
		 * Here Cobra is a Child Class and Snake is a Parent Class.
		 * "Cobra extends Snake"--This is an example of single Inheritance.
		 * "Cobra extends Snake, Snake extends Reptile, Reptile extends Animal"-- this is an example of Multi-level Inheritance.
		 * Cobra extends Animal, Snake extends Animal, Reptile extends Animal"-- this is an example of Hierarchical Inheritance.
		 */
		System.out.println("\n----------------------------------------------------\n");

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		/*
		 * Here Robin is a Child Class and Birds is a Parent Class.
		 * "Robin extends Birds" --This is an example of single Inheritance.
		 * "Robin extends Birds, Birds extends Animal"--this is an example of Multi-level Inheritance.
		 * "Robin extends Animal, Birds extends Animal"-- this is an example of Hierarchical Inheritance.
		 */
		System.out.println("\n----------------------------------------------------\n");

		Dog dog = new Dog();
		dog.dogInfo();
		System.out.println("\n----------------------------------------------------\n");

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		System.out.println("\n----------------------------------------------------\n");

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		System.out.println("\n----------------------------------------------------\n");

		Snake snake = new Snake();
		snake.snakeInfo();
		System.out.println("\n----------------------------------------------------\n");

		Birds birds = new Birds();
		birds.birdsInfo();
	}
}
