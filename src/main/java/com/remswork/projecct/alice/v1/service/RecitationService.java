package com.remswork.projecct.alice.v1.service;

import com.remswork.projecct.alice.v1.model.Recitation;
import com.remswork.project.alice.exception.GradingFactorException;

import java.util.List;

public interface RecitationService {

    Recitation getRecitationById(long id) throws GradingFactorException;

    List<Recitation> getRecitationList() throws GradingFactorException;

    List<Recitation> getRecitationListByStudentAndSubjectId(long studentId, long subjectId)
            throws GradingFactorException;

    Recitation addRecitation(Recitation recitation, long studentId, long subjectId) throws GradingFactorException;

    Recitation updateRecitationById(long id, Recitation newRecitation, long studentId, long subjectId)
            throws GradingFactorException;

    Recitation deleteRecitationById(long id) throws GradingFactorException;
}
