package hw4Q2JavaVariables;

public class AboutMeTest {

	// AboutMe class is instantiated.

	public static void main(String[] args) {
		AboutMe me = new AboutMe(); // Here Constructor is initialized.
		me.myName = "Fatema Zohora";
		me.mySalary = 1000000000;
		me.sex = 'F';
		me.usCitizen = true;
		me.myAge = 22;
		me.houseRent = 2000;
		me.myBankBalance = 80000000000l;
		me.hight = 5.5f;
		me.myGrade = 4.67879;
		me.aboutMe();

//Here method is initialized.

		System.out.println("\n********************************************\n");

// Here Constructor is initialized.

		AboutMe alex = new AboutMe();
		alex.myName = "Alex";
		alex.mySalary = 2000000000;
		alex.sex = 'M';
		alex.usCitizen = false;
		alex.myAge = 55;
		alex.houseRent = 7000;
		alex.myBankBalance = 9000000000l;
		alex.hight = 6.5f;
		alex.myGrade = 3.67879;
		alex.aboutMe();

// Here method is initialized.

	}

}
