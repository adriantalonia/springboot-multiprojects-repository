package com.ram.api.service;

import com.ram.api.model.dto.request.UserRequest;
import com.ram.api.model.dto.response.UserResponse;

import java.util.UUID;

public interface UserService {

    UserResponse getUserById(UUID id);
    UserResponse getUserByEmail(String email);
    UserResponse create(UserRequest user);
    UserResponse update(UserRequest user);
}
