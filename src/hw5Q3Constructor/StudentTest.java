package hw5Q3Constructor;

public class StudentTest {

	public static void main(String[] args) {
		// default Constructor is initialized:
		Student student01 = new Student();

		System.out.println("---------------------------------------------");
		
		Student student02 = new Student("Fatema Tuj Zohora", 455 ,'f' , true , 3.976f);
		
		System.out.println("---------------------------------------------");
		
		Student student03 = new Student("Fabiha Islam", 955 ,'f' , false , 2.906f);
		
		System.out.println("---------------------------------------------");
		
		Student student04 = new Student("Shoaib Islam", 345 ,'m' , false , 2.916f);
		
		System.out.println("---------------------------------------------");
		
		
		Student student05 = new Student("Mohammed Islam", 422 ,'m' , true , 1.976f);
		
		
	}

}
