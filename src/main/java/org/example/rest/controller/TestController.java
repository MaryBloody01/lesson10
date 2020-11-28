package org.example.rest.controller;

import org.example.rest.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test1")
    public Location getLocation() {
        return new Location();
    }

    @GetMapping("/test2")
    public Employee getEmployee() {
        return new Employee();
    }

    @GetMapping("/test3")
    public Job getJob() {
        return new Job();
    }

    @GetMapping("/test4")
    public JobHistory getJob_history() {
        return new JobHistory();
    }

    @GetMapping("/test5")
    public Department getDepartment() {
        return new Department();
    }
}
