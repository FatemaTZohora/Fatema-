package hw4Q2JavaVariables;

public class AboutMe {

	// Here variables are declared.
	public String myName;
	public int mySalary;
	public char sex;
	public boolean usCitizen;
	public byte myAge;
	public short houseRent;
	public long myBankBalance;
	public float hight;
	public double myGrade;

	// Here constructor is declared.
	public AboutMe() {
		System.out.println("This is all about me:");
	}

	// Here method is implemented.
	public void aboutMe() {
		System.out.println("My name: " + myName + "," + " My Age: " + myAge + "," + " My gender: " + sex + ","
				+ " My hight: " + hight + "," + " My grade: " + myGrade + "," + " My salary: " + mySalary + ","
				+ " Am I US Citizen? Ans: " + usCitizen + "," + " My Bank Balance: " + myBankBalance + ","
				+ " My HouseRent: " + houseRent + ".");
	}
}
