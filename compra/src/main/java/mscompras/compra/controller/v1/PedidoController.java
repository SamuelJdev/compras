package mscompras.compra.controller.v1;

import lombok.RequiredArgsConstructor;
import mscompras.compra.controller.v1.dto.PedidoRequestDTO;
import mscompras.compra.controller.v1.dto.PedidoResponseDTO;
import mscompras.compra.controller.v1.mapper.PedidoMapper;
import mscompras.compra.domain.service.EnderecoService;
import mscompras.compra.domain.service.pedido.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/v1/pedidos")
public class PedidoController {
    @Autowired
    private final PedidoMapper pedidoMapper;

    @Autowired
    private final PedidoService pedidoService;

    @Autowired
    private EnderecoService enderecoService;

    public PedidoController(PedidoService pedidoService, PedidoMapper pedidoMapper) {
        this.pedidoService = pedidoService;
        this.pedidoMapper = pedidoMapper;
    }
    @PostMapping
    public ResponseEntity<PedidoResponseDTO> salvar(@RequestBody @Valid PedidoRequestDTO pedidoRequestDTO){
        return ResponseEntity.ok(pedidoMapper.toPedidResponseDTO(pedidoService.Salvar(pedidoMapper.toPedido(pedidoRequestDTO))));
    }
}


