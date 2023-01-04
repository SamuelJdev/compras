package mscompras.compra.controller.v1.mapper;

import mscompras.compra.controller.v1.dto.PedidoRequestDTO;
import mscompras.compra.controller.v1.dto.PedidoResponseDTO;
import mscompras.compra.domain.model.Pedido;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PedidoMapper {
    Pedido toPedido(PedidoRequestDTO pedidoRequestDTO);
    PedidoResponseDTO toPedidResponseDTO(Pedido pedido);
}
