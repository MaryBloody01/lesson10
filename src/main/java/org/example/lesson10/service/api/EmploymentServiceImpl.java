package org.example.lesson10.service.api;


import org.example.lesson10.dto.EmploymentSaveDTO;
import org.example.lesson10.mapper.EmploymentMapper;
import org.example.lesson10.mapper.PersonMapper;
import org.example.lesson10.model.Employment;
import org.example.lesson10.service.EmploymentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmploymentServiceImpl implements EmploymentService {

    private final ModelMapper mapper = new ModelMapper();
    @Autowired
    private EmploymentMapper employmentMapper;

    @Autowired
    private PersonMapper personMapper;

    @Override
    public void save(EmploymentSaveDTO saveDTO) {
        Employment newEmployment = mapper.map(saveDTO, Employment.class);
        personMapper.getById(newEmployment.getPersonId());

        employmentMapper.save(newEmployment);
    }
}