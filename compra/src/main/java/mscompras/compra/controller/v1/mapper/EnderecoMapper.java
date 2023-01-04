package mscompras.compra.controller.v1.mapper;

import mscompras.compra.domain.model.Endereco;
import mscompras.compra.api.restclient.EnderecoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoMapper{
    Endereco toEndereco(EnderecoDTO enderecoDTO);
//    Endereco toEndereco(EnderecoDTO enderecoDTO);
//    Endereco toEndereco(EnderecoDTO enderecoDTO);
}
