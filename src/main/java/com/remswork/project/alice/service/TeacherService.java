package com.remswork.project.alice.service;

import java.util.List;

import com.remswork.project.alice.model.Teacher;

public interface TeacherService {
	
	public Teacher getTeacherById(long id);
	public List<Teacher> getTeacherList();
	public Teacher addTeacher(Teacher teacher);
	public Teacher updateTeacherById(long id, Teacher newTeacher);
	public Teacher deleteTeacherById(long id);

}
