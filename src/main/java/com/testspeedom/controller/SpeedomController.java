package com.testspeedom.controller;

import com.testspeedom.service.SpeedomService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/admin")
public class SpeedomController {

    @Autowired
    SpeedomService service;

    @GetMapping("/get")
    public int getSpeedom(){
        log.debug("get");
        return service.speedGetService();
    }

    @PostMapping("/set")
    public int setSpeedom(){
        log.debug("set");
        return service.speedSetService();
    }

    @PutMapping("/update")
    public int updateSpeedom(){
        log.debug("update");
        return service.speedUpdateService();
    }
}
