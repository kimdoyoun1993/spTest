package com.testspeedom.repository;

import com.testspeedom.dto.SpeedomDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SpeedomRepository {

    Integer insertSpeedom();

    Integer  updateSpeedom();

    SpeedomDto getSpeedom();
}
