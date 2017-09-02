package com.remswork.projecct.alice.v1.service;

import com.remswork.projecct.alice.v1.model.Student;
import com.remswork.project.alice.exception.StudentException;

import java.util.List;

public interface StudentService {

    Student getStudentById(long id) throws StudentException;

    List<Student> getStudentList() throws StudentException;

    Student addStudent(Student student, long sectionId) throws StudentException;

    Student updateStudentById(long id, Student newStudent, long sectionId) throws StudentException;

    Student deleteStudentById(long id) throws StudentException;
}
