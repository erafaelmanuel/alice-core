package com.remswork.projecct.alice.v1.service;

import com.remswork.projecct.alice.v1.model.Assignment;
import com.remswork.project.alice.exception.GradingFactorException;

import java.util.List;

public interface AssignmentService {

    Assignment getAssignmentById(long id) throws GradingFactorException;

    List<Assignment> getAssignmentList() throws GradingFactorException;

    List<Assignment> getAssignmentListByStudentAndSubjectId(long studentId, long subjectId)
            throws GradingFactorException;

    Assignment addAssignment(Assignment assignment, long studentId, long subjectId) throws GradingFactorException;

    Assignment updateAssignmentById(long id, Assignment newAssignment, long studentId, long subjectId)
            throws GradingFactorException;

    Assignment deleteAssignmentById(long id) throws GradingFactorException;
}
