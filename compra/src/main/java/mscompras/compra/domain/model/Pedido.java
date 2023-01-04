package mscompras.compra.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
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
@Entity(name = "tb_pedido")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private String email;
    @NotNull
    @Min(1)
    private Long produto;
    @NotNull
    @Min(1)
    private BigDecimal valor;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dataCompra;
    @NotNull
    private String cpfCliente;
    @Embedded
    private Endereco endereco;
    @Embedded
    private Cartao cartao;
}
