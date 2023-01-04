package com.wokercompras.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Pedido implements Serializable {

    private Long id;
    private String nome;
    private String email;
    private Long produto;
    private BigDecimal valor;
    private Date dataCompra;
    private String cpfCliente;
    private Endereco endereco;
    private Cartao cartao;
}
