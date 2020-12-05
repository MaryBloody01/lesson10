package org.example.lesson10.controller;

import org.example.lesson10.dto.EmploymentSaveDTO;
import org.example.lesson10.service.EmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employment")
public class EmploymentController {

    @Autowired
    private EmploymentService employmentService;

    @PostMapping("/save")
    public void save(@RequestBody EmploymentSaveDTO saveDTO) {
        employmentService.save(saveDTO);
    }

    @PostMapping("/records/update")
    public void update(@RequestBody EmploymentSaveDTO saveDTO) {
        employmentService.update(saveDTO);
    }
}
