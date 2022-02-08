package hw9Q2Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Fatema Zohora");
		employee.setAge(22);
		employee.setSex('F');
		employee.setUsCitizen(true);
		System.out.println("Employee info: " + "\nEmployee name: " + employee.getName() + ",\nEmployee age: "
				+ employee.getAge() + ",\nEmployee sex: " + employee.getSex() + "\nEmployee is US citizen: "
				+ employee.isUsCitizen());
	}

}
