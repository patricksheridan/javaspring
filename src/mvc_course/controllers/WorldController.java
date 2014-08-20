package mvc_course.controllers;

import mvc_data.IWorldMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorldController {

	@Autowired
	public IWorldMapper worldMapper;
	
	@RequestMapping("/continentlist.mvc")
	public String continents(Model m)
	{
		m.addAttribute("continents", worldMapper.getContinents());
		return "continents";
	}

}
