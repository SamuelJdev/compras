package mscompras.compra.controller.v1.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CartaoRequestDTO implements Serializable {
    @ApiModelProperty(value = "cep", example = "69080-121", required = true)
    private String numero;

    @ApiModelProperty(value = "limite_disponivel", example = "1000", required = true)
    private BigDecimal limite_disponivel;
}
