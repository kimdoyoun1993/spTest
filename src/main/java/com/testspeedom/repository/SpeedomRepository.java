package com.testspeedom.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SpeedomRepository {

    Integer insertSpeedom();

    Integer updateSpeedom();

    Integer  getSpeedom();
}
