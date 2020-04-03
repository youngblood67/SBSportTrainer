package training.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "topictrainer", group = "grouptrainer")
    public void consume(String message){
            System.out.println(message);
    }
}
