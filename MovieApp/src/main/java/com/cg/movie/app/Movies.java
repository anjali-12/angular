package com.cg.movie.app;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.FetchMode;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.CascadeType;

import java.util.*;


	

	@Entity
	@Table(name = "movies")
	public class Movies {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "Movie_Name")
		private String name;
		@Column(name = "Rating")
		private int rate;
		@Column(name="genre")
		private String genre;
		
		String getGenre() {
			return genre;
		}
		void setGenre(String genre) {
			this.genre = genre;
		}
		public Movies(String name, int rate, String genre) {
			super();
			this.name = name;
			this.rate = rate;
			this.genre = genre;
		}
		public Movies(String name, int rate) {
			super();
			this.name = name;
			this.rate = rate;
		}
		String getName() {
			return name;
		}
		void setName(String name) {
			this.name = name;
		}
		int getRate() {
			return rate;
		}
		void setRate(int rate) {
			this.rate = rate;
		}
		
		@Override
		public String toString() {
			return "Movies [name=" + name + ", rate=" + rate + ", Genre=" + genre + "]";
		}

}
