package controller;// must look

import modal.student;
import service.college;

public class university {
	
	public static void main(String[] args) {
		
		college c  = new college();// college object bcz i want to access method of college itself
		System.out.println("**///---Student Management System---///**");
		student std =college.addStudentDetails();// here student datatype used bcz data is not of specific int fload etc it is of student type
		System.out.println(std.name);
		System.out.println(std.studentID);
		System.out.println(std.address);
		System.out.println(std.cgpa);
		
	}

}
