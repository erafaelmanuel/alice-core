package com.remswork.project.alice.service;

import java.util.List;

import com.remswork.project.alice.model.Department;

public interface DepartmentService {
	
	public Department getDepartmentById(long id);
	public List<Department> getDepartmentList();
	public Department addDepartment(Department department);
	public Department updateDepartment(long id, Department newDepartment);
	public Department deleteDepartment(long id);

}
