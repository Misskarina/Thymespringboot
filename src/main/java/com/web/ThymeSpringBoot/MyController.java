package com.web.ThymeSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class MyController {
	
	public StudentService studentservice;

	public MyController(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}

	@GetMapping("/student")
	public String listStudent(Model model)
	{
		model.addAttribute("student",studentservice.getAllStudent());
		return "student";
	}
	@GetMapping("/student/new")
	public String createStudentform(Model model)
	{
		Student student=new Student();
		model.addAttribute("student", student);
		return"create_student";
	}
	@PostMapping("/student")
	public String savestudent(@ModelAttribute("student") Student student)
	{
		studentservice.savestudent(student);
		return"redirect:/student"; 
	}
	
	@GetMapping("/student/edit/{id}")
	public String editStudentform(@PathVariable int id, Model model )
	{
		model.addAttribute("student",studentservice.getStudentById(id));
		return "edit_studentform";
	}
	
	@PostMapping("/student/{id}")
	public String updateStudent(@PathVariable int id,
			@ModelAttribute("student") Student student,
			Model model)
	{
		//get student from database by id
		Student existingstudent=studentservice.getStudentById(id);
		existingstudent.setId(id);
		existingstudent.setFirstname(student.getFirstname());
		existingstudent.setLastname(student.getLastname());
		existingstudent.setEmail(student.getEmail());
				
		//save updated data
		studentservice.updateStudent(student);
		return"redirect:/student";
		
	}
	//
	@GetMapping("student/delete/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		studentservice.deleteStudentById(id);
		return "redirect:/student";
	}

}
