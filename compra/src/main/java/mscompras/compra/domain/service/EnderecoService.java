package mscompras.compra.domain.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import mscompras.compra.api.restclient.EnderecoDTO;
import mscompras.compra.api.restclient.ViaCepClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    @Autowired
    private ViaCepClient viaCepClient;

    public EnderecoDTO buscarCep(String cep){
        String json = viaCepClient.getCeps(cep);
        ObjectMapper mapper = new ObjectMapper();
        EnderecoDTO enderecoDTO = null;
        try {
        enderecoDTO = mapper.readValue(json, EnderecoDTO.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return enderecoDTO;
    }
}