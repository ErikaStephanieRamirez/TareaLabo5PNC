package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dao.StudentDAO;
import com.uca.capas.domain.Student;

@Controller
public class MainController {
	
	@Autowired
	private StudentDAO studentDao;
	
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		List<Student> students = null;
		try {
			students = studentDao.findAll();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		mav.addObject("students",students);
		mav.setViewName("main");
		
		return mav;
	}
	
	@RequestMapping("/form")
	public ModelAndView formData(@RequestParam(value ="id")int id_stdnt) {
		ModelAndView mav = new ModelAndView();
		Student student2 = null;
		try {
			student2 = studentDao.findOne(id_stdnt);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		mav.addObject("student2", student2);
		mav.setViewName("form");
		return mav;
	}
}
