package com.codingdojo.dojosandninjas.services;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.codingdojo.dojosandninjas.models.Ninja;

import com.codingdojo.dojosandninjas.repositories.NinjaRepository;


@Service
public class NinjaService {
 // adding the repository as a dependency, this is the "@Autowired"
	private final NinjaRepository ninjaRepository;
 
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	// returns all 
	public List<Ninja> allNinjas() {
		return ninjaRepository.findAll();
	}
	// creates
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	// retrieves one
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
	        return optionalNinja.get();
	    }else{
	        return null;
	    }
	}

	//Delete	 
	public void deleteNinja(Long id) {
		ninjaRepository.deleteById(id);
		
	// Edits/Updates(Essentially the save function/service but passes whole object with id included)	
	}
	public Ninja updateNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
}

