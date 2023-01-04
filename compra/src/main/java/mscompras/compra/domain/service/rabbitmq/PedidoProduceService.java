package mscompras.compra.domain.service.rabbitmq;

import lombok.SneakyThrows;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class PedidoProduceService implements Serializable {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Value("${rabbitmq.routingkey}")
    private String routingkey;

    @SneakyThrows
    public void sendMessage(String message){
        rabbitTemplate.convertAndSend(routingkey, message);
    }
}