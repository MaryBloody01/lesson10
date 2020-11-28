package org.example.rest.service;

import org.example.rest.dto.LocationSaveDTO;
import org.example.rest.model.Location;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LocationService {
    List<Location> getAll();
    void save(LocationSaveDTO saveDTO);
}
