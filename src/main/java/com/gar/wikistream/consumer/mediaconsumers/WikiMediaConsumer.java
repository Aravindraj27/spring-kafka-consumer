package com.gar.wikistream.consumer.mediaconsumers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class WikiMediaConsumer {

    @Value("${kafka.topic}")
    private String topic;

    @KafkaListener(topics = "my-test-topic-wikistream", groupId = "wikmedia-test-consumer-group")
    public void consumerMessage(String message) {
        log.info(format("Consuming message :: %s from topic :: %s", message, topic));

    }
}
