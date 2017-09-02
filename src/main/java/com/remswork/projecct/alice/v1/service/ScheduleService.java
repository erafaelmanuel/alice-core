package com.remswork.projecct.alice.v1.service;

import java.util.List;
import java.util.Set;

import com.remswork.projecct.alice.v1.model.Schedule;
import com.remswork.project.alice.exception.ScheduleException;

public interface ScheduleService {

    Schedule getScheduleById(long id) throws ScheduleException;

    List<Schedule> getScheduleList() throws ScheduleException;

    Set<Schedule> getScheduleListByTeacherId(long teacherId) throws ScheduleException;

    Schedule addSchedule(Schedule schedule) throws ScheduleException;

    Schedule updateScheduleById(long id, Schedule newSchedule) throws ScheduleException;

    Schedule deleteScheduleById(long id) throws ScheduleException;
}
