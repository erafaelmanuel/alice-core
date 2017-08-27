package com.remswork.project.alice.model;


import java.util.ArrayList;
import java.util.List;

import com.remswork.project.alice.model.support.Link;

public class Section {

    private long id;
    private String name;
    private Department department;
    private List<Link> links;

    public Section() {
    	links = new ArrayList<Link>();
    }

    public Section(String name) {
        this();
        this.name = name;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public void addLink(Link link) {
        links.add(link);
    }
}
