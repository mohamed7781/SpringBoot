package com.movies.jaxrs.model;



public class Production {
	
	private Long id;
	private String production_name;
    private String producer_name;
	private String production_details;
	
	public Long getId() {
    		return id;
    	}
    	public void setId(Long id) {
    		this.id = id;
    	}
    	public String getProduction_name() {
    		return production_name;
    	}
    	public void setProduction_name(String production_name) {
    		this.production_name = production_name;
    	}
    	public String getProducer_name() {
    		return producer_name;
    	}
    	public void setProducer_name(String producer_name) {
    		this.producer_name = producer_name;
    	}
    	public String getProduction_details() {
    		return production_details;
    	}
    	public void setProduction_details(String production_details) {
    		this.production_details = production_details;
    	}
}
