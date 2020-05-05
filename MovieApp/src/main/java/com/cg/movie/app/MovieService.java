package com.cg.movie.app;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hospital.bean.Hospital;




@Service
@Transactional
public class MovieService {
	@Autowired
	private MovieDao moviesDao;
	
	//...

	public List<Movies> listAll() {
		
		return moviesDao.findAll();
	}

	public void save(Movies hos) {
		
	        moviesDao.save(hos);
	      
	    }
		// TODO Auto-generated method stub
		
	

	public Movies get(String name) {
		return moviesDao.findByName(name);
		// TODO Auto-generated method stub
	
	}
	

    
	
	     
	    
	     
	   
	
}
