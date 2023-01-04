package mscompras.compra.controller.v1.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class EnderecoRequestDTO implements Serializable {
    @ApiModelProperty(value = "cep", example = "69080-121", required = true)
    private String cep;
}
