package com.springboot.hashworksnew.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hashworksnew.pojos.Employ;
import com.springboot.hashworksnew.services.PersonServices;


@RestController
public class PersonController {

	@Autowired
	PersonServices personServices;

	@RequestMapping("/getInfo")
	public List<Employ> getUserType() {
		return personServices.getUserInfo();
	}

	@RequestMapping("/getEmployById/{id}")
	public Employ getEmployById(@PathVariable int id) {
		return personServices.getEmployById(id);
	}

}
