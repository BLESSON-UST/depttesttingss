package com.UST.departmentservice.Services;

import com.UST.departmentservice.Model.Department;
import com.UST.departmentservice.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository repo;

    public Department saveDepartment(Department department) {
        return repo.save(department);

    }


    public Department findDepartmentById(Long departmentId) {
        return repo.findByDepartmentId(departmentId);
    }
}
