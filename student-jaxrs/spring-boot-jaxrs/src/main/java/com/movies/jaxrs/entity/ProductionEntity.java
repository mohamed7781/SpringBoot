package com.movies.jaxrs.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity // This tells Hibernate to make a table out of this class
public class ProductionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
    	private String production_name;
	    private String producer_name;
    	private String production_details;
		
    	@OneToMany(mappedBy="production")
        private Set<MovieEntity> movies;
    	
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