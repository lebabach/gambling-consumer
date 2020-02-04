package microservices.gambling.consumer.service.dto;

import lombok.Getter;

@Getter
public class SellingOrderDTO
    extends AbstractEntityDTO {
    private String order;
}
