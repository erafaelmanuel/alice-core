package com.remswork.project.alice.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.remswork.project.alice.model.support.Link;

@XmlRootElement
public class Subject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private String code;
	private String description;
	private int unit;
	private List<Link> links;
	
	public Subject() {
		super();
		links = new ArrayList<>();
	}
	
	public Subject(String name, String code, String description, int unit) {
		this();
		this.name = name;
		this.code = code;
		this.description = description;
		this.unit = unit;
	}
	
	public Subject(long id, String name, String code, String description, int unit) {
		this(name, code, description, unit);
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public void addLink(Link link){
		boolean isExist = false;
		for (Link eachLink : links) {
			if(eachLink.getRel().equalsIgnoreCase(link.getRel())) {
				isExist = true;
				break;
			}
		}
		if(!isExist)
			links.add(link);
	}
}
