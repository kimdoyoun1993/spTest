package com.testspeedom.socket;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Random;

@Controller
public class SocketController {
    @MessageMapping("/number")
    @SendTo("/topic/number")
    public int generateNumber() {
        Random random = new Random();
        return 1 + random.nextInt(99);
    }
}
