package com.ram.api.model.dto.response;

import com.ram.api.model.entity.Role;
import lombok.Data;

import java.util.UUID;

@Data
public class UserResponse {

    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Boolean active;
    private Role role;
}
