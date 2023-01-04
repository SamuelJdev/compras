package mscompras.compra.controller.v1.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PedidoRequestDTO implements Serializable {

    private String email;
    private String nome;
    private Long produto;
    private BigDecimal valor;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dataCompra;
    private String cpfCliente;
    private EnderecoRequestDTO endereco;
    private CartaoRequestDTO cartao;
}
