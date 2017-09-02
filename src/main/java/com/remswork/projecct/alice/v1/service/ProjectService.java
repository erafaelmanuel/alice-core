package com.remswork.projecct.alice.v1.service;

import com.remswork.projecct.alice.v1.model.Project;
import com.remswork.project.alice.exception.GradingFactorException;

import java.util.List;

public interface ProjectService {

    Project getProjectById(long id) throws GradingFactorException;

    List<Project> getProjectList() throws GradingFactorException;

    List<Project> getProjectListByStudentAndSubjectId(long studentId, long subjectId) throws GradingFactorException;

    Project addProject(Project project, long studentId, long subjectId) throws GradingFactorException;

    Project updateProjectById(long id, Project newProject, long studentId, long subjectId) throws GradingFactorException;

    Project deleteProjectById(long id) throws GradingFactorException;
}