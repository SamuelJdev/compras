package mscompras.compra.domain.service.pedido;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import mscompras.compra.controller.v1.mapper.EnderecoMapper;
import mscompras.compra.domain.model.Pedido;
import com.fasterxml.jackson.databind.ObjectMapper;
import mscompras.compra.domain.repository.PedidoRepository;
import mscompras.compra.domain.service.EnderecoService;
import mscompras.compra.domain.service.rabbitmq.PedidoProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private EnderecoService enderecoService;
    @Autowired
    private EnderecoMapper enderecoMapper;
    @Autowired
    private PedidoProduceService producer;
    @SneakyThrows
    public Pedido Salvar(Pedido pedido) {
        ObjectMapper objectMapper = new ObjectMapper();
        var enderecoDTO = enderecoService.buscarCep(pedido.getEndereco().getCep());
        if (Objects.nonNull(enderecoDTO)) {
            pedido.setEndereco(enderecoMapper.toEndereco(enderecoDTO));
        }
        var pedidoSalvo =  pedidoRepository.save(pedidoRepository.save(pedido));
        producer.sendMessage(objectMapper.writeValueAsString(pedidoSalvo));
        return pedidoSalvo;
    }
}

