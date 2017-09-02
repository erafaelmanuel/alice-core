package com.remswork.projecct.alice.v1.service;

import com.remswork.projecct.alice.v1.model.Department;
import com.remswork.project.alice.exception.DepartmentException;

import java.util.List;

public interface DepartmentService {

    Department getDepartmentById(long id) throws DepartmentException;

    List<Department> getDepartmentList() throws DepartmentException;

    Department addDepartment(Department department) throws DepartmentException;

    Department updateDepartmentById(long id, Department newDepartment) throws DepartmentException;

    Department deleteDepartmentById(long id) throws DepartmentException;
}
