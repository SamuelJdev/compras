package mscompras.compra.controller.v1.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class EnderecoRequestDTO implements Serializable {

    private String cep;
}
