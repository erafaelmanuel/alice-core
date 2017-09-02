package com.remswork.projecct.alice.v1.service;

import com.remswork.projecct.alice.v1.model.Activity;
import com.remswork.project.alice.exception.GradingFactorException;

import java.util.List;

public interface ActivityService {

    Activity getActivityById(long id) throws GradingFactorException;

    List<Activity> getActivityList() throws GradingFactorException;

    List<Activity> getActivityListByStudentAndSubjectId(long studentId, long subjectId) throws GradingFactorException;

    Activity addActivity(Activity activity, long studentId, long subjectId) throws GradingFactorException;

    Activity updateActivityById(long id, Activity newActivity, long studentId, long subjectId)
            throws GradingFactorException;

    Activity deleteActivityById(long id) throws GradingFactorException;
}
