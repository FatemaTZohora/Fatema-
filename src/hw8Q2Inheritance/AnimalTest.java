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
		 * "BullDog extends Dog, Dog extends Mammal, Mammal extends Animal " They are
		 * Multi-level Inheritance. "BullDog extends Dog" This is single Inheritance.
		 * "Mammal extends Animal, Birds extends Animal, Reptile extends Animal they are
		 * called Hierarchical Inheritance.
		 */
		System.out.println("\n----------------------------------------------------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		/*
		 * Here Cobra is a Child Class and Snake is a Parent Class "Cobra extends Snake"
		 * --This is single Inheritance.
		 * "Cobra extends Snake, Snake extends Reptile, Reptile extends Animal"-- they
		 * are called Multi-level Inheritance. Cobra extends Animal, Snake extends
		 * Animal, Reptile extends Animal"-- they are called Hierarchical Inheritance.
		 */
		System.out.println("\n----------------------------------------------------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		/*
		 * Here Robin is a Child Class and Birds is a Parent Class "Robin extends Birds"
		 * --This is single Inheritance. "Robin extends Birds, Birds extends Animal"--
		 * they are called Multi-level Inheritance. "Robin, Birds extends Animal"-- they
		 * are called Hierarchical Inheritance.
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
