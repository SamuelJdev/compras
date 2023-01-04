package com.woker.validador.domain.service;

import com.woker.validador.api.exception.LimiteIndisponivelException;
import com.woker.validador.api.exception.SalvoInsuficienteException;
import com.woker.validador.domain.model.Cartao;
import com.woker.validador.domain.model.Pedido;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ValidadorService {
    public void Pedido(Pedido pedido) {
        validarLimiteDisponivel(pedido.getCartao());
        validarCompraComLimite(pedido);
    }

    private void validarCompraComLimite(Pedido pedido) {
        if (pedido.getValor().longValue() > pedido.getCartao().getLimite_disponivel().longValue()) {
            log.error("Valor do pedido: {}. Limite disponivel: {}", pedido.getValor(), pedido.getCartao().getLimite_disponivel());
            throw new SalvoInsuficienteException("Você não tem limite para efetuar essa compra");
        }
    }
    private void validarLimiteDisponivel(Cartao cartao) {
        if (cartao.getLimite_disponivel().longValue() <= 0) {
            throw new LimiteIndisponivelException("Limite indisponivel");
        }
    }
}
