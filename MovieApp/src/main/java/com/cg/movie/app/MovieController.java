package com.cg.movie.app;





import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.bean.Hospital;

@CrossOrigin(origins="http://localhost:4200")
@RestController


@RequestMapping({"/movie"})
public class MovieController {
	@Autowired
	private MovieService service;
	@GetMapping("/movies")
	public List<Movies> list() {
	    return service.listAll();
	}
	
	@PostMapping
	public void add(@RequestBody Movies hos) {
	    service.save(hos);
	}

	@PutMapping("/center/{id}")
	public ResponseEntity<?> update(@RequestBody Movies hos, @PathVariable String name ) {
	    try {
	        Movies existProduct = service.get(name);
	        service.save(hos);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) { 
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	

	}