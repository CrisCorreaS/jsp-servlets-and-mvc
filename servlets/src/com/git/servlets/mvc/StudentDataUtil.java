package com.git.servlets.mvc;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	public static List<Student> getStudents() {
		
		// create an empty list
		List<Student> students = new ArrayList<>();
		
		// add sample data
		students.add(new Student("Elisa", "Corral", "elisacorral54@gmail.com"));
		students.add(new Student("Paul", "Rodríguez", "paulro@gmail.com"));
		students.add(new Student("Cris", "Feal", "crisfeal@gmail.com"));
		
		// return the list
		return students;
	}
}







