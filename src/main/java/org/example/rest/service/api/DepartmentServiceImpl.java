package org.example.rest.service.api;


import org.example.rest.dto.DepartmentSaveDTO;
import org.example.rest.dto.LocationSaveDTO;
import org.example.rest.mapper.DepartmentMapper;
import org.example.rest.mapper.LocationMapper;
import org.example.rest.model.Department;
import org.example.rest.model.Location;
import org.example.rest.service.DepartmentService;
import org.example.rest.service.LocationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final ModelMapper mapper = new ModelMapper();
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAll() {
        return departmentMapper.getAll();
    }

    @Override
    public void save(DepartmentSaveDTO saveDTO) {
        Department department = mapper.map(saveDTO, Department.class);
        departmentMapper.save(department);
    }
}
