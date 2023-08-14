package com.web.ThymeSpringBoot;

import java.util.List;

public interface StudentService {
	List<Student>getAllStudent();
	
	Student savestudent(Student student);
	
	Student getStudentById(int id);

	Student updateStudent(Student student);

	void deleteStudentById(int id);
	
	
	}
