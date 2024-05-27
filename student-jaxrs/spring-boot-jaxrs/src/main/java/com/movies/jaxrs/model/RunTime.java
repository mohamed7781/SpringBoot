package com.movies.jaxrs.model;

public class RunTime {

	private Long id;
	private String totalDuration;
    private String withCreditTime;
	private String withoutCreditTime;
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
