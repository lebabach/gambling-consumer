package microservices.gambling.consumer.service;

import microservices.gambling.consumer.message.channel.SellingOrderChannel;
import microservices.gambling.consumer.service.dto.SellingOrderDTO;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;
import org.springframework.messaging.Message;

@Component
public class SellingOrderService {

    @StreamListener(SellingOrderChannel.INPUT)
    public void subscribeSellingOrder(Message<SellingOrderDTO> sellingOrderMessage) {
        SellingOrderDTO sellingOrderDTO = sellingOrderMessage.getPayload();
        System.out.println("sellingDTO : " + sellingOrderDTO.getOrder());
    }

}
