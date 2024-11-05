package edu.miu.cs489.universityapp.service.impl;

import edu.miu.cs489.universityapp.model.Department;
import edu.miu.cs489.universityapp.repository.DepartmentRepo;
import edu.miu.cs489.universityapp.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepo departmentRepo;

    @Override
    public List<Department> getDepartmentsWithCoursesOrderedByName() {
        return departmentRepo.findAllWithCoursesOrderedByDepartmentName();
    }
}
