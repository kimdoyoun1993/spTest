package com.testspeedom.service;

import com.testspeedom.repository.SpeedomRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class SpeedomService {
    @Autowired
    SpeedomRepository speedomRepository;

    public int speedGetService(){

        log.debug("get Service");


        return speedomRepository.getSpeedom();

    }

    public int speedSetService(){

        log.debug("Set Service");



        return  speedomRepository.insertSpeedom();

    }

    public int speedUpdateService(){


        log.debug("Update Service");



        return speedomRepository.updateSpeedom();
    }
}
