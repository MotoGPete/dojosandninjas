package com.codingdojo.dojosandninjas.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.services.DojoService;





@Controller
public class DojoController {
	@Autowired
	DojoService dojoService;
	
	

	
	
		//**************update*****************
//		@GetMapping("/dojo/{id}/edit")
//		public String dojoEdit(@PathVariable("id") Long id, Model model) {
//			Dojo dojo = dojoService.findDojo(id); 
//			model.addAttribute("dojo", dojo);
//			return "dojoEdit.jsp";
//		} 

//		@PutMapping("dojo/{id}/edit")
//		public String processEditForm(@Valid @ModelAttribute("newjo")Dojo newDojo, BindingResult result, @PathVariable("id") Long id ) {
//			if(result.hasErrors()) {
//				return "editDojo.jsp";
//			}else {
//				dojoService.createDojo(newDojo);
//				return "redirect:/dojos";
//			}
//
//		}
		
		//*********show one******************
		@GetMapping("/dojo/{id}")
		public String dojosShow(@PathVariable("id") Long id, Model model) {
			Dojo dojo = dojoService.findDojo(id); 
			model.addAttribute("dojo", dojo);
			return "dojoShow.jsp";
		} 
		
		
		//*****************delete********************
//		@DeleteMapping("/dojos/{id}/delete")
//		public String processDeleteDojo(@PathVariable("id")Long id) {
//			dojoService.deleteDojo(id);
//			return "redirect:/dojos";
//		}
		
		//***************combined create dash*************
		@GetMapping("/dojo/new")
		public String combined(Model model) {
			Dojo newDojo = new Dojo();
			model.addAttribute("newDojo", newDojo);
			List<Dojo> dojos = dojoService.allDojos();
			model.addAttribute("dojos", dojos);
			return "dojoNew.jsp";
		}

		
		@PostMapping("/dojo/new")
		public String processCombined(@Valid @ModelAttribute("newDojo")Dojo newDojo, BindingResult result,Model model) {
			if(result.hasErrors()) {
				List<Dojo> dojos= dojoService.allDojos();
				model.addAttribute("dojos", dojos);
				return "dojoNew.jsp";
			}else {
				dojoService.createDojo(newDojo);
				return "redirect:/dojo/new";
			}
			
		}
    }


