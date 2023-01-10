package com.ram.api.model.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

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
}
