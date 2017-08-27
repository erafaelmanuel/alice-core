package com.remswork.project.alice.model;

import java.util.ArrayList;
import java.util.List;

import com.remswork.project.alice.model.support.Link;

public class Schedule {

    private long id;
    private String day;
    private String time;
    private String period;
    private List<Link> links;

    public Schedule() {
        super();
        links = new ArrayList<Link>();
    }

    public Schedule(String day, String time, String period) {
        this();
        this.day = day;
        this.time = time;
        this.period = period;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
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
