package mscompras.compra.service;

import mscompras.compra.model.Pedido;
import mscompras.compra.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido Salvar(Pedido pedido){
        return pedidoRepository.save(pedido);
    }
}
