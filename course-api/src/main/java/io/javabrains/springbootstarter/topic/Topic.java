package io.javabrains.springbootstarter.topic;

public class Topic {
	
	String name;
	String description;
	int id;
	
	
	public Topic() {
		
	}
	
	public Topic(String name, String description, int id) {
		this.name = name;
		this.description = description;
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
