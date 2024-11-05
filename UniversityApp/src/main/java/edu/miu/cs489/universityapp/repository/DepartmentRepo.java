package edu.miu.cs489.universityapp.repository;

import edu.miu.cs489.universityapp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepo extends JpaRepository<Department, Long> {
    @Query("SELECT d FROM Department d JOIN FETCH d.courses ORDER BY d.name")
    List<Department> findAllWithCoursesOrderedByDepartmentName();
}
