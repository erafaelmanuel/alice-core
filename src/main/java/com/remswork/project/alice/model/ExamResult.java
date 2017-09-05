package com.remswork.project.alice.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.remswork.project.alice.model.support.Link;

@XmlRootElement
public class ExamResult {

    private long id;
    private int score;
    private Exam exam;
    private Student student;
    private List<Link> links;

    public ExamResult() {
        links = new ArrayList<>();
    }

    public ExamResult(int score) {
        this.score = score;
    }

    public ExamResult(long id, int score) {
        this.id = id;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public void addLink(Link link) {
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
