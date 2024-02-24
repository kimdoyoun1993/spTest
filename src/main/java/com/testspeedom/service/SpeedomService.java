package com.testspeedom.service;

import com.testspeedom.dto.SpeedomDto;
import com.testspeedom.repository.SpeedomRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Log4j2
public class SpeedomService {
    @Autowired
    SpeedomRepository speedomRepository;

    public SpeedomDto speedGetService(){

        log.debug("get Service");

        SpeedomDto spData = speedomRepository.getSpeedom();
        return spData;

    }

    public int speedSetService(){

        log.debug("Set Service");

        return  speedomRepository.insertSpeedom();

    }

    @Transactional
    public SpeedomDto speedUpdateService(){


        log.debug("Update Service");

        speedomRepository.updateSpeedom();

        SpeedomDto SPData = speedomRepository.getSpeedom();

        log.info("업데이트");

        return SPData;
    }
}
