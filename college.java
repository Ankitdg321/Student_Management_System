package service;// must look 

import modal.student; // import is essential

public class college {
	
  
	public static student addStudentDetails() {

		student s = new student();
		s.name = " ankit";
		s.studentID = 1;
		s.address = "pune";
		s.cgpa = (float) 9.16;

		student s1 = new student();
		s1.name = "aniket";
		s1.studentID = 2;
		s1.address = "satara";
		s1.cgpa = (float) 9.0;

		student s2 = new student();
		s2.name = "bhagyesh";
		s2.studentID = 3;
		s2.address = "benguluru";
		s2.cgpa = (float) 7.8;

		return s;
	}// if i woud had created main() here so college ka hi object banana padta na
		// acces karne ke liye methid ko college ke
	

}
