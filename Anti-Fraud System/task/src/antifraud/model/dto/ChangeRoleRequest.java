package antifraud.model.dto;

import antifraud.model.Role;
import antifraud.validation.RoleSubSet;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ChangeRoleRequest {
    @NotBlank
    String username;
    @NotNull
    @RoleSubSet(anyOf = {Role.MERCHANT, Role.SUPPORT})
    Role role;
}
