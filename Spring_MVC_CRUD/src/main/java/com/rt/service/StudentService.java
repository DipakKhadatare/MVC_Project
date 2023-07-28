package com.rt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rt.dao.StudentDao;
import com.rt.entity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao stdDao;

	public boolean register(Student e) {
		return stdDao.register(e);
		
	}

	public boolean update(Student e) {
		return stdDao.update(e);
		

	}

	public boolean delete(int id) {
		
	 	return stdDao.delete(id);
	}
	
	
	public Student selectstudentbyid(int id) {

	 	return stdDao.selectstudentbyid(id);
	}

	public List<Student> selectAllEmployees() {
		
		return stdDao.selectAllEmployees();
	}

	




}
