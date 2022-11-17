package com.example.accessingdatajpa.cotrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TheamLeafCoontroller {
	
	   @GetMapping("/theam")
	   public String listByPage(Model model) {
		   //operation over 
		   List lst = new ArrayList<String> ();
		   lst.add("kailash");
		   lst.add("suresh");
				   
		   model.addAllAttributes(lst);
			return "login/enterLoginId";
	   }


}
