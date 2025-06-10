package shoping.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import shoping.config.kafka.KafkaProcessor;
import shoping.domain.*;

@Service
public class PoductSearchViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private PoductSearchRepository poductSearchRepository;
    //>>> DDD / CQRS
}
