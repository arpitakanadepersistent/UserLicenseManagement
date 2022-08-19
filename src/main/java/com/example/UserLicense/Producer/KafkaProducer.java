package com.example.UserLicense.Producer;

import com.example.UserLicense.entity.UserLicense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
@RestController
public class KafkaProducer {

    @Autowired
    KafkaTemplate<String, UserLicense> kafkaTemplate;
    private static final String Topic="TopicKafka";
    public String publishMessage(UserLicense userLicense){
        kafkaTemplate.send(Topic, userLicense);
        return "published successfully";
    }
}