package hw4Q2JavaVariables;


public class AboutMe {
	
	//Here variables are declared.
	
	public String myName;
	public int mySalary;
	public char sex ;
	public boolean usCitizen;
	public byte myAge ;
	public short houseRent;
	public long myBankBalance;
	public float hight ;
	public double myGrade;
	
	//Here constructor is declared.
	
	public AboutMe() {
		System.out.println("This is all about me");
}
	// Here method is implemented.
	
	public void aboutMe() {
		System.out.println("My name is "+ myName +"\nMy Age: "+myAge+"\nMy gender:"+sex+"\nMy hight:"+hight+"\nMy grade :"+myGrade+"\nMy salary :"+mySalary+"\nAm I US Citizen? Ans: " + usCitizen+ "\nMy Bank Balance:" + myBankBalance  + "\nMy HouseRent: " + houseRent);
		
	}

}	
	
	
	
	
	
	
	
	
	
	
	
	
	
