package com.ram.api.model.dto.request;

import com.ram.api.model.entity.Role;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class UserRequest {

    @NotBlank(message = "First name cannot be blank")
    @Size(min = 4, message = "Firstname must not be less than 2 characters")
    private String firstName;
    @NotBlank(message = "Last name cannot be blank")
    @Size(min = 4, message = "Firstname must not be less than 2 characters")
    private String lastName;
    @NotBlank(message = "Email cannot be blank")
    @Email
    private String email;
    @Pattern(regexp="(^$|[0-9]{10})", message = "Phone must be only numbers and has 10 digits")
    private String phone;
    @NotBlank(message = "Password cannot be blank")
    @Size(min = 4, message = "Password must not be less than 8 characters")
    private String password;
    @NotNull(message = "The user must have a role assigned")
    private Set<Role> roles = new HashSet<>();
}
