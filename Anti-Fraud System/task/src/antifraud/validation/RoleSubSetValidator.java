package antifraud.validation;

import antifraud.model.Role;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class RoleSubSetValidator implements ConstraintValidator<RoleSubSet, Role> {

    private Role[] subset;

    @Override
    public void initialize(RoleSubSet constraint) {
        this.subset = constraint.anyOf();
    }

    @Override
    public boolean isValid(Role value, ConstraintValidatorContext context) {
        return value == null || Arrays.asList(subset).contains(value);
    }
}
