package com.movies.jaxrs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity // This tells Hibernate to make a table out of this class
public class RunTimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
    	private String totalDuration;
	    private String withCreditTime;
    	private String withoutCreditTime;
    	
    	@OneToOne(mappedBy = "runTime")
    	private MovieEntity movie;
    	
    	public Long getId() {
        		return id;
        	}
    	public void setId(Long id) {
    		this.id = id;
    	}
        	public String getTotalDuration() {
        		return totalDuration;
        	}
        	public void setTotalDuration(String totalDuration) {
        		this.totalDuration = totalDuration;
        	}
        	public String getWithCreditTime() {
        		return withCreditTime;
        	}
        	public void setWithCreditTime(String withCreditTime) {
        		this.withCreditTime = withCreditTime;
        	}
        	public String getWithoutCreditTime() {
        		return withoutCreditTime;
        	}
        	public void setWithoutCreditTime(String withoutCreditTime) {
        		this.withoutCreditTime = withoutCreditTime;
        	}
 }