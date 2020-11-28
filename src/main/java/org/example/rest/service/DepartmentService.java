package org.example.rest.service;

import org.example.rest.dto.DepartmentSaveDTO;
import org.example.rest.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAll();
    void save(DepartmentSaveDTO saveDTO);
}
