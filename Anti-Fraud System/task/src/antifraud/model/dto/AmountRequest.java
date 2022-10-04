package antifraud.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
public class AmountRequest {
    @Positive
    @NotNull
    Long amount;
}
