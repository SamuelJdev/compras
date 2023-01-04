package mscompras.compra.domain.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Embeddable
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Cartao implements Serializable {
    private String numero;
    private BigDecimal limite_disponivel;
}
