package ch04;

public class SutdentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "경기도 고양시";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentID = 54321;
		studentKim.setStudentName("Kim");
		studentKim.address = "서울 은평구";
		
		studentKim.showStudentInfo();
		System.out.println(studentKim);
		System.out.println(studentLee);
	}

}
