package org.example.rest.controller;

import org.example.rest.dto.DepartmentSaveDTO;
import org.example.rest.model.Department;
import org.example.rest.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<Department> getAll() {
        return departmentService.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody DepartmentSaveDTO saveDTO) {
        departmentService.save(saveDTO);
    }
}
