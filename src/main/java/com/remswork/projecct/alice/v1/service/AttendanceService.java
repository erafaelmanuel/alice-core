package com.remswork.projecct.alice.v1.service;

import com.remswork.projecct.alice.v1.model.Attendance;
import com.remswork.project.alice.exception.GradingFactorException;

import java.util.List;

public interface AttendanceService {

    Attendance getAttendanceById(long id) throws GradingFactorException;

    List<Attendance> getAttendanceList() throws GradingFactorException;

    List<Attendance> getAttendanceListByStudentAndSubjectId(long studentId, long subjectId)
            throws GradingFactorException;

    Attendance addAttendance(Attendance attendance, long studentId, long subjectId) throws GradingFactorException;

    Attendance updateAttendanceById(long id, Attendance newAttendance, long studentId, long subjectId)
            throws GradingFactorException;

    Attendance deleteAttendanceById(long id) throws GradingFactorException;
}
