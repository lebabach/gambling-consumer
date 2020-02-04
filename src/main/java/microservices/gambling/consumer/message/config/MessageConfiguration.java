package microservices.gambling.consumer.message.config;

import microservices.gambling.consumer.message.channel.SellingOrderChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(value = {SellingOrderChannel.class})
public class MessageConfiguration {

}
