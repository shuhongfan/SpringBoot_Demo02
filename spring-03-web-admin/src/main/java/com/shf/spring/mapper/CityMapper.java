package com.shf.spring.mapper;

import com.shf.spring.bean.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface CityMapper {
    @Select("select * from city where id=#{id}")
    public City getCityById(Long id);

    @Insert("insert into city(name,state,country) values (#{name},#{state},#{country})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public void inset(City city);
}