package org.example.lesson10.controller;


import org.example.lesson10.dto.PersonSaveDTO;
import org.example.lesson10.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/save")
    public void save(@RequestBody PersonSaveDTO saveDTO) {
        personService.save(saveDTO);
    }
}