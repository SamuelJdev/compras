package mscompras.compra.service.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitmqConfig {

    @Value("${queue.name}")
    private String queueName;

    public Queue queue(){
        return new Queue(,true) {

        }
    }
}
