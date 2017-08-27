package com.remswork.project.alice.model;

import java.util.ArrayList;
import java.util.List;

import com.remswork.project.alice.model.support.Link;

public class Student {

    private long id;
    private long studentNumber;
    private String firstName;
    private String lastName;
    private String middleName;
    private String gender;
    private int age;
    private String imageSrc;
    private UserDetail userDetail;
    private Section section;
    private List<Link> links;

    public Student(){
        super();
        links = new ArrayList<Link>();
    }

    public Student(long studentNumber, String firstName, String lastName, String middleName,
                   String gender, int age, String imageSrc) {
        this();
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
        this.age = age;
        this.imageSrc = imageSrc;
    }

    public Student(long id, long studentNumber, String firstName, String lastName, String middleName,
                   String gender, int age, String imageSrc) {
        this(studentNumber, firstName, lastName, middleName, gender, age, imageSrc);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
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
