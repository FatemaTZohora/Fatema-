package hw11Q3Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class ColumbiaUniversity ------------------------\n");

		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		ColumbiaUniversity.medicalSchoolInfo();
		ColumbiaUniversity.columbiaUniversityInfo(); // static method from Regular class ColumbiaUniversity
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.anthropology();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.biology();
		columbiaUniversity.cafeteria();
		columbiaUniversity.caring();
		columbiaUniversity.classSize();
		columbiaUniversity.commonRoom();
		columbiaUniversity.computerLab();
		columbiaUniversity.dorm();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.gymnasium();
		columbiaUniversity.hygiene();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.lawInfo();
		columbiaUniversity.maths();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.morgue();
		columbiaUniversity.playGround();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.teacher();
		columbiaUniversity.vocationalInfo();
		// columbiaUniversity.columbiaUniversity(); // default method can't be executed
		// in regular class.

		System.out.println("\n--------------------- Interface University ------------------------\n");
		// Cannot instantiate the type University
		// an Interface can't be instantiated, it needs the help of a concrete class,
		// here ColumbiaUniversity is the concrete class
		University university = new ColumbiaUniversity();
		university.cafeteria();
		university.classSize();
		university.commonRoom();
		university.dorm();
		university.emergencyRoom();
		university.gymnasium();
		university.laboratory();
		university.languageClub();
		university.morgue();
		university.playGround();
		university.playGround();
		university.surgeryRoom();
		university.teacher();
		University.library(); // static method from Interface University

		System.out.println("\n--------------------- Abstract class MedicalSchool ------------------------\n");
		// Cannot instantiate the type MedicalSchool
		// an Interface can't be instantiated, it needs the help of a concrete class,
		// here ColumbiaUniversity is the concrete class
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.aeronauticalInfo();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.caring();
		medicalSchool.computerLab();
		medicalSchool.hygiene();
		medicalSchool.lawInfo();
		medicalSchool.maths();
		medicalSchool.mechanicalLab();
		MedicalSchool.medicalSchoolInfo(); // static method from Abstract class MedicalSchool.
		// medicalSchool.columbiaUniversity(); //default method can't be executed in
		// abstract class.
	}

}
