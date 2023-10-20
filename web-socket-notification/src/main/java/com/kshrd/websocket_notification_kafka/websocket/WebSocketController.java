package com.kshrd.websocket_notification_kafka.websocket;

import com.kshrd.websocket_notification_kafka.kafka.KafkaConsumerService;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
//@RequestMapping(path = "district")
public class WebSocketController {

    private final KafkaConsumerService kafkaConsumerService;

    public WebSocketController(KafkaConsumerService kafkaConsumerService) {
        this.kafkaConsumerService = kafkaConsumerService;
    }

    @GetMapping("/message")

    public String receiveMessage(){
        kafkaConsumerService.sendMessage("Hello");
        return "Success";
    }


}
