package com.movies.jaxrs.model;

public class Movie {

	private Long id;
	private String movie;
    private String actor;
	private String director;
	private String yearReleased;
	private String language;
	private String genre;
	private Production production;
	private RunTime runTime;
	
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
	public Production getProduction() {
		return production;
	}
	public void setProduction(Production production) {
		this.production = production;
	}
	public RunTime getRunTime() {
		return runTime;
	}
	public void setRunTime(RunTime runTime) {
		this.runTime = runTime;
	}
	
	/*
	 * public Movie(Long id, String movie , String actor , String director , String
	 * yearReleased , String language , String genre , double movieRating ) {
	 * super(); this.id = id; this.movie = movie; this.actor = actor; this.director=
	 * director; this.yearReleased = yearReleased; this.language = language;
	 * this.genre = genre; }
	 */
	
	
}
