package springbootkafka.kafkaConsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import springbootkafka.kafkaConsumer.model.User;

@Service
public class KafkaConsumerListener {


    @KafkaListener(topics = "KafkaTestTopic", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

    @KafkaListener(topics = "KafkaTestTopicJson", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
    public void consume(User user) {
        System.out.println("Consumed message: " + user);
    }
}
