package edu.miu.cs489.universityapp.service.impl;

import edu.miu.cs489.universityapp.model.Course;
import edu.miu.cs489.universityapp.model.Department;
import edu.miu.cs489.universityapp.repository.CourseRepo;
import edu.miu.cs489.universityapp.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;

    @Override
    public Map<Department, List<Course>> getCoursesByDepartment() {
        List<Course> courses = courseRepo.findAllByOrderByDepartmentNameAsc();

        return courses.stream().collect(Collectors.groupingBy(Course::getDepartment));
    }
}
