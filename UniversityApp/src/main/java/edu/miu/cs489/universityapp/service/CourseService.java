package edu.miu.cs489.universityapp.service;

import edu.miu.cs489.universityapp.model.Course;
import edu.miu.cs489.universityapp.model.Department;

import java.util.List;
import java.util.Map;

public interface CourseService {
    public Map<Department, List<Course>> getCoursesByDepartment();
}
