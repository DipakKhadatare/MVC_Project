package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.rt.entity.Student;
import com.rt.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService stdServices;
	
	@RequestMapping("/")
	public String homePage() {

		return "home";

	}
	
	@RequestMapping("/registerForm")
	public String registration() {

		return "register";
	}
	
//	********************************************************************************************************

	@RequestMapping("/register")
	public String registrtionform(@ModelAttribute Student e, Model m) {

		boolean isadded = stdServices.register(e);
		m.addAttribute("e", e);
		
		if (isadded) {
			m.addAttribute("successMsg","Employee Added Successfully...");
			
		} else {
			m.addAttribute("errMsg","Unable to Add...");
		}
		 return "register";
		
	}
	
//	********************************************************************************************************
	
	@RequestMapping("/updateForm")
	public String updateForm() {
		
			return "update";
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute Student e, Model m) {

		boolean isupdate = stdServices.update(e);
		
		if (isupdate) {
			m.addAttribute("successMsg","Employee Updated Successfully...");
			
		} else {
			m.addAttribute("errMsg","Unable to Update...");
		}
		
		 return "update";
		
	}
	
//	********************************************************************************************************
	
	@RequestMapping("/deleteForm")
	public String deleteform() {
		
			return "delete";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int id, Model m) {

		boolean isdeleted = stdServices.delete(id);
		
		m.addAttribute(id);
		
//		if (isdeleted) {
//			m.addAttribute("successMsg","Employee deleted Successfully...");
//			
//		} else {
//			
//			m.addAttribute("errMsg","Unable to delete...");
//		}
		
		 return "delete";
		
	}
	
	
//	********************************************************************************************************
	
	@RequestMapping("/selectStudentForm")
	public String selectStudentForm() {
		
			return "selectstudentbyid";
	}
	
	@RequestMapping("/selectStudentById")
	public String selectstudentbyid(@RequestParam int id, Model m) {

	Student e =	stdServices.selectstudentbyid(id);
			
	
		m.addAttribute("stddata", e);
		
		 return "displayonly";
		
	}

//	********************************************************************************************************
	@RequestMapping("/selectAllStudent")
	public String selectAllEmployees(Model m) {
		
		List<Student> list = stdServices.selectAllEmployees();
		
		m.addAttribute("stdlist", list);
		
		return "displayall";
	}
}
