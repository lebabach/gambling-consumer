package microservices.gambling.consumer.message.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface SellingOrderChannel {
    String INPUT = "sellingOrderInputChannel";

    @Input(INPUT)
    MessageChannel sellingOrderInputChannel();
}
