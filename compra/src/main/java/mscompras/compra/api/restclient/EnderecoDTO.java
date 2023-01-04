package mscompras.compra.api.restclient;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnderecoDTO {

    @JsonAlias("cep")
    private String cep;

    @JsonAlias("logradouro")
    private String logradouro;

    @JsonAlias("complemento")
    private String complemento;

    @JsonAlias("bairro")
    private String bairro;

    @JsonAlias("localidade")
    private String localidade;

    @JsonAlias("uf")
    private String uf;

    @JsonAlias("ibge")
    private String ibge;

    @JsonAlias("gia")
    private String gia;

    @JsonAlias("ddd")
    private String ddd;

    @JsonAlias("siafi")
    private String siafi;
}
