package com.web.ThymeSpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService{
	
	@Autowired
	StudentRepository strepo;
	@Override
	public
	List<Student>getAllStudent()
	{
		return strepo.findAll();
	}
	
	@Override
	public Student savestudent(Student student)
	{
		return strepo.save(student);
	}
	@Override
	public Student getStudentById(int id)
	{
		return strepo.findById(id).get();
	}
	
	@Override
	public Student updateStudent(Student student)
	{
		return strepo.save(student);
	}
	
	@Override
	public void deleteStudentById(int id)
	{
		 strepo.deleteById(id);
	}
	
}
