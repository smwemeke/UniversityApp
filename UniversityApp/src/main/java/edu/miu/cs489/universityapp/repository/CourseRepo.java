package edu.miu.cs489.universityapp.repository;

import edu.miu.cs489.universityapp.model.Course;
import edu.miu.cs489.universityapp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepo extends JpaRepository<Course, Integer> {
    List<Course> findAllByOrderByDepartmentNameAsc();
}
