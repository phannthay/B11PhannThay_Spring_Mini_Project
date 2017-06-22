package com.hrd.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hrd.test.model.Student;

@Controller
public class mainController {
	List<Student> ls=new ArrayList<Student>();
	
//	@RequestMapping("/stu")
//	public String Showdata(Model model){
//		ls.add(new Student(1,"sok","male"));
//		ls.add(new Student(2,"sao", "male"));
//		ls.add(new Student(3,"songheang","female"));
//		ls.add(new Student(4,"thay","male"));
//		ls.add(new Student(5,"tola","female"));
//		ls.add(new Student(6,"raksmey","female"));
//		ls.add(new Student(7,"channat","male"));
//		
//		model.addAttribute("STU",ls);
//		
//		return "home";
//	}
	@RequestMapping("/")
	public String home(){
		return "home";
	}
	
	@RequestMapping("/user")
	public String changeLanguage(){
		return "home";
	}


}
