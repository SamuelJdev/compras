package mscompras.compra.controller.v1.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModelProperty;
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

    @ApiModelProperty(value = "email", example = "samuel.23@gmail.com", required = true)
    private String email;

    @ApiModelProperty(value = "nome", example = "samuel lisboa", required = true)
    private String nome;

    @ApiModelProperty(value = "produto", example = "1", required = true)
    private Long produto;

    @ApiModelProperty(value = "valor", example = "100", required = true)
    private BigDecimal valor;

    @ApiModelProperty(value = "dataCompra", example = "2023-02-02", required = true)
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dataCompra;

    @ApiModelProperty(value = "cpfCliente", example = "000.000.000-59", required = true)
    private String cpfCliente;

    private EnderecoRequestDTO endereco;

    private CartaoRequestDTO cartao;
}
