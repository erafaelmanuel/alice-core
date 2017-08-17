package com.remswork.project.alice.model;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private long id;
	private String name;
	private String description;
	private List<Link> links;
	
	public Department() {
		super();
		links = new ArrayList<Link>();
	}
	
	public Department(String name, String description) {
		this();
		this.name = name;
		this.description = description;
	}
	
	public Department(long id, String name, String description) {
		this(name, description);
		this.id = id;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
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

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public void addLink(Link link){
		links.add(link);
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
