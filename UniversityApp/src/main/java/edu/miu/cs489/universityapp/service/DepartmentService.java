package edu.miu.cs489.universityapp.service;

import edu.miu.cs489.universityapp.model.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> getDepartmentsWithCoursesOrderedByName();

}
