package org.example.lesson10.mapper;

import org.apache.ibatis.annotations.*;
import org.example.rest.model.Department;
import org.example.rest.model.Location;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {

    //    @SelectKey(resultType = Long.class, keyProperty = "location_id", before = true,
//            statement = "select nextval('location_seq')")
    @Insert("insert into departments (department_name, manager_id, location_id) " +
            "values (#{dep.departmentName} ,#{dep.managerId}, #{dep.locationId}) ")
    void save(@Param("dep") Department department);

//    @Select("select * from locations where location_id=#{locationId}")
//    Location getLocationById(Integer locationId);

    @Select("select * from departments")
    List<Department> getAll();
}