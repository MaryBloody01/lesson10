package org.example.lesson10.service.api;

import org.example.lesson10.dto.PersonSaveDTO;
import org.example.lesson10.mapper.PersonMapper;
import org.example.lesson10.model.Person;
import org.example.lesson10.service.PersonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private final ModelMapper mapper = new ModelMapper();
    @Autowired
    private PersonMapper personMapper;

    @Override
    public void save(PersonSaveDTO saveDTO) {
        Person person = mapper.map(saveDTO, Person.class);
        personMapper.save(person);
    }
}