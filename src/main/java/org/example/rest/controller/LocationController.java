package org.example.rest.controller;

import org.example.rest.dto.LocationSaveDTO;
import org.example.rest.model.Location;
import org.example.rest.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping
    public List<Location> getAll() {
        return locationService.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody LocationSaveDTO saveDTO) {
        locationService.save(saveDTO);
    }
}
