package mvc_course.controllers;

import mvc_course.models.Student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
@RequestMapping(value = "setup.mvc")
public String setUpStudents()
{
	Student s;
	s = new Student();
	s.setFirstName("Matt");
	s.setLastName("Smith");
	s.setGender("Male");
	s.setUniversity("UUJ");
	Student.list.add(s);
	return "redirect:listStudents.mvc";
}

@RequestMapping(value = "listStudents.mvc")
public ModelAndView listStudents(ModelAndView mav)
{
	mav.setViewName("studentList");
	mav.addObject("studentList", Student.list);
	return mav;
}

}
