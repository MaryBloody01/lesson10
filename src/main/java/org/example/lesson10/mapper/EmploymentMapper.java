package org.example.lesson10.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.lesson10.model.Employment;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EmploymentMapper {
    @Insert("insert into employment (employment_id, version, startDt, endDt, " +
            "organizationName, positionName) " +
            "values (#{dep.departmentName} ,#{dep.managerId}, #{dep.locationId}) ")
    void save(@Param("emp") Employment employment);

    @Insert("insert into employment (department_name, manager_id, location_id) " +
            "values (#{dep.departmentName} ,#{dep.managerId}, #{dep.locationId}) ")
    void update(@Param("emp") Employment employment);

    @Select("select * from employment where person_id=#{personId}")
    Employment getByPersonId(Integer personId);

}