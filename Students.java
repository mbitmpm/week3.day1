package org.college;

public class Students {

	public void getStudentInfo(int Id) {
		System.out.println("Student_ID :" + Id);
	}

	public void getStudentInfo(int Id, String Name) {
		System.out.println("STUDENT_ID :" + Id + " " + " Student_name : " + Name);
	}

	public void getStudentInfo(int Id, String Name, String Emailid) {
		System.out.println("ID :" + Id + " " + "   StudSt_name : " + Name + " " + "   Student Email : " + Emailid);
	}

	public void getStudentInfo(int Id, String Name, String Emailid, long Phonenumer) {
		System.out.println("ID :" + Id + "   St_name : " + Name + " " + "   Student Email : " + Emailid + " "
				+ "   Student phonenumber : " + Phonenumer);
	}

	public static void main(String[] args) {
		Students Studentinfo = new Students();
		Studentinfo.getStudentInfo(1000);
		Studentinfo.getStudentInfo(1001, "Balaji Murugadoss");
		Studentinfo.getStudentInfo(1002, "Malini", "malini@gmail.com");
		Studentinfo.getStudentInfo(1003, "Jeshu", "Jeshu@gmail.com", 9566155699L);

	}

	
}
