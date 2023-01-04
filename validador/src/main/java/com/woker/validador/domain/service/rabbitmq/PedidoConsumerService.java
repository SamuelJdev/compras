package com.woker.validador.domain.service.rabbitmq;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.woker.validador.api.exception.LimiteIndisponivelException;
import com.woker.validador.api.exception.SalvoInsuficienteException;
import com.woker.validador.domain.model.Pedido;
import com.woker.validador.domain.service.ValidadorService;
import org.springframework.amqp.core.Message;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PedidoConsumerService {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private ValidadorService validadorService;

    @SneakyThrows
    @RabbitListener(queues = {"${rabbitmq.queue.name-pendente}"})
    public void consumer(@Payload Message payload) {
        var pedido = objectMapper.readValue(payload.getBody(), Pedido.class);
        log.info("Payload recebido no validador" + pedido);

        try {
            validadorService.Pedido(pedido);
        } catch (LimiteIndisponivelException | SalvoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}