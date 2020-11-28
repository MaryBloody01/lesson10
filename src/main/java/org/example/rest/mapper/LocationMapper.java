package org.example.rest.mapper;

import org.apache.ibatis.annotations.*;
import org.example.rest.model.Location;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LocationMapper {

//    @SelectKey(resultType = Long.class, keyProperty = "location_id", before = true,
//            statement = "select nextval('location_seq')")
    @Insert("insert into locations (street_address, city) " +
            "values (#{l.streetAddress} ,#{l.city})")
    void save(@Param("l") Location location);

//    @Select("select * from locations where location_id=#{locationId}")
//    Location getLocationById(Integer locationId);

    @Select("select * from locations")
    List<Location> getAll();
}
