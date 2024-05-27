package com.movies.jaxrs.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity // This tells Hibernate to make a table out of this class
public class MovieEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
    	private String movie;
	    private String actor;
    	private String director;
		private String yearReleased;
    	private String language;
		private String genre;
		
		@OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "runtime_id", referencedColumnName = "id")
		private RunTimeEntity runTime;
		
		@ManyToOne(cascade = CascadeType.ALL)
	    //Adding the name
	    @JoinColumn(name = "production_id")
	    private ProductionEntity production;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getMovie() {
			return movie;
		}

		public void setMovie(String movie) {
			this.movie = movie;
		}

		public String getActor() {
			return actor;
		}

		public void setActor(String actor) {
			this.actor = actor;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public String getYearReleased() {
			return yearReleased;
		}

		public void setYearReleased(String yearReleased) {
			this.yearReleased = yearReleased;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public RunTimeEntity getRunTime() {
			return runTime;
		}

		public void setRunTime(RunTimeEntity runTime) {
			this.runTime = runTime;
		}

		public ProductionEntity getProduction() {
			return production;
		}

		public void setProduction(ProductionEntity production) {
			this.production = production;
		}
    	
    	
 }