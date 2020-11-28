package org.example.rest.service.api;

import org.example.rest.dto.LocationSaveDTO;
import org.example.rest.mapper.LocationMapper;
import org.example.rest.model.Location;
import org.example.rest.service.LocationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private final ModelMapper mapper = new ModelMapper();
    @Autowired
    private LocationMapper locationMapper;

    @Override
    public List<Location> getAll() {
        return locationMapper.getAll();
    }

    @Override
    public void save(LocationSaveDTO saveDTO) {
        Location location = mapper.map(saveDTO, Location.class);
        locationMapper.save(location);
    }
}
