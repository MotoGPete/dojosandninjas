package com.codingdojo.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.repositories.DojoRepository;


@Service
public class DojoService {
 // adding the book repository as a dependency
	private final DojoRepository dojoRepository;
 
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	// returns all 
	public List<Dojo> allDojos() {
		return dojoRepository.findAll();
	}
	// creates
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	// retrieves one
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
         return optionalDojo.get();
     } else {
         return null;
     }
 }
//	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
//		Book bookToUpdate = bookRepository.findById(id).get();
//		bookToUpdate.setTitle(title);
//		bookToUpdate.setDescription(desc);
//		bookToUpdate.setLanguage(lang);
//		bookToUpdate.setNumberOfPages(numOfPages);
//		return bookRepository.save(bookToUpdate);
		 
	
	public void deleteDojo(Long id) {
		dojoRepository.deleteById(id);
		
		
	}
	public Dojo updateDojo(Dojo dojo) {
		
		// TODO Auto-generated method stub
		return dojoRepository.save(dojo);
	}
}
