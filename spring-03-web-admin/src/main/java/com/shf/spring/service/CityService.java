package com.shf.spring.service;

import com.shf.spring.bean.City;
import com.shf.spring.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    CityMapper cityMapper;

    public City getCityById(Long id){
        return cityMapper.getCityById(id);
    }

    public void saveCity(City city) {
        cityMapper.inset(city);
    }
}
