package com.CRUD.sboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.CRUD.sboot.dto.Student;
import com.CRUD.sboot.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	StudentRepository repository;

	@GetMapping("/")
	public String loadMain(ModelMap map) {
		List<Student> student = repository.findAll();
		if (student.isEmpty()) {
			map.put("fetch failure", "Data not found");
			return "main.html";
		} else {
			map.put("list", student);
			return "main.html";
	}
	}

	@GetMapping("Insert")
	public String loadInsert() {
		return "insert.html";
	}

	@PostMapping("Insert")
	public String insertStudentData(Student student, ModelMap map) {
		repository.save(student);
		map.put("success", student.getName() + " your Data Inserted Successfully");
		return "main.html";
	}

	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, ModelMap map) {
		repository.deleteById(id);
		map.put("success", "Record deleted success");
		return loadMain(map);
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, ModelMap map) {
		 Student student = repository.findById(id).orElseThrow();
		 map.put("student", student);
		 map.put("update", "update");
		 return loadMain(map);
	}
	
	@PostMapping("/update")
	public String update(Student student, ModelMap map){
		repository.save(student);
		map.put("success", "Record Updated Successfully");
		return loadMain(map);
	}
}
