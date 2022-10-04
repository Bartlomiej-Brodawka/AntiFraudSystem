package antifraud.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    MERCHANT, ADMINISTRATOR, SUPPORT;

    final String role = "ROLE_" + name();

    @Override
    public String getAuthority() {
        return role;
    }
}
