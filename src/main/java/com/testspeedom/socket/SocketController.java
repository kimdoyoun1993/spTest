package com.testspeedom.socket;
import com.testspeedom.repository.SpeedomRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Random;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@Slf4j
public class SocketController {
    private Random random = new Random();
    int randomNumber;
    @Autowired
    private SimpMessagingTemplate template;

    @Autowired
    SpeedomRepository speedomRepository;

    Integer SPData;


    public int setRandomNumber() {
        SPData = speedomRepository.getSpeedom();
        this.template.convertAndSend("/topic/random-number", SPData);
        return SPData;
    }

    @GetMapping("/random-number")
    public int getRandomNumber() {
        setRandomNumber();

//        try {
//            Thread.sleep(2000); // 2초 동안 일시 중지합니다.
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return SPData; // setRandomNumber() 메서드를 호출합니다.
    }
}
