package com.ram.api.service;

import com.ram.api.exception.ResourceNotFoundException;
import com.ram.api.model.dto.request.UserRequest;
import com.ram.api.model.dto.response.UserResponse;
import com.ram.api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponse getUserById(UUID id) {
        var userDB = userRepository.findById(id).orElseThrow(() -> {
            log.info("User {} not found", id);
            return new ResourceNotFoundException("User " + id + " not found");
        });
        return null;
    }

    @Override
    public UserResponse getUserByEmail(String email) {
        return null;
    }

    @Override
    public UserResponse create(UserRequest user) {
        return null;
    }

    @Override
    public UserResponse update(UserRequest user) {
        return null;
    }
}
