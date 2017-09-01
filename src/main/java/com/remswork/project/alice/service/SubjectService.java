package com.remswork.project.alice.service;

import java.util.List;

import com.remswork.project.alice.exception.SubjectException;
import com.remswork.project.alice.model.Subject;

public interface SubjectService {

    Subject getSubjectById(long id) throws SubjectException;

    Subject getSubjectByClassAndTeacherId(long classId, long teacherId) throws SubjectException;

    Subject getSubjectByScheduleId(long scheduleId) throws SubjectException;

    List<Subject> getSubjectList() throws SubjectException;

    List<Subject> getSubjectListByTeacherId(long teacherId) throws SubjectException;

    List<Subject> getSubjectListByStudentId(long studentId) throws SubjectException;

    Subject addSubject(Subject subject) throws SubjectException;

    Subject updateSubjectById(long id, Subject newSubject) throws SubjectException;

    Subject deleteSubjectById(long id) throws SubjectException;
}
