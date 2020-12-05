package org.example.lesson10.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.lesson10.model.Person;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonMapper {
    @Insert("insert into person (person_id, first_name, last_name, middle_name, " +
            "birth_date, gender) " +
            "values (#{p.personId} ,#{p.firstname}, #{p.lastname}, #{p.middlename}, " +
            "#{p.birthdate}, #{p.gender}")
    void save(@Param("p") Person person);

    @Insert("update employment set first_name = #{p.firstname}, last_name=#{p.lastname}, " +
            "middle_name=#{p.middlename}, birth_date=#{p.birthdate}, gender=#{p.gender}) ")
    void update(@Param("p") Person person);
    @Select("select * from person where person_id = #{personId}")
    Person getById(Integer personId);
}
