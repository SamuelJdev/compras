package mscompras.compra.controller.v1.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EnderecoResponseDTO implements Serializable {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String uf;
    private String localidade;
}
