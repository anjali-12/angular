package com.cg.movie.app;




import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDao extends JpaRepository<Movies, String> {

	Object findByName(String name);

	


	
}




