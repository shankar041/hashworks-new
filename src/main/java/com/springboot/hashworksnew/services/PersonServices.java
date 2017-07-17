package com.springboot.hashworksnew.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.hashworksnew.pojos.Employ;

@Service
public class PersonServices {
	List<Employ> listOfEmploy = Arrays.asList(new Employ(1, "shankar", 100000.56f), new Employ(2, "mohan", 399999.78f),
			new Employ(3, "harish", 4544444.34f));

	public List<Employ> getUserInfo() {
		return listOfEmploy;
	}

	public Employ getEmployById(int id) {
		for (Employ employ : listOfEmploy) {
			if (employ.getId() == id) {
				return employ;
			}

		}
		return null;
	}

}
