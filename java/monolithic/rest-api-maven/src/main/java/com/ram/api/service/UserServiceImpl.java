package com.ram.api.service;

import com.ram.api.exception.ResourceNotFoundException;
import com.ram.api.mapper.UserMapper;
import com.ram.api.model.dto.request.UserRequest;
import com.ram.api.model.dto.response.UserResponse;
import com.ram.api.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponse getUserById(UUID id) {
        var userDB = userRepository.findById(id).orElseThrow(() -> {
            log.info("User {} not found", id);
            return new ResourceNotFoundException("User " + id + " not found");
        });
        return UserMapper.MAPPER.toResponse(userDB);
    }

    @Override
    public UserResponse getUserByEmail(String email) {
        return null;
    }

    @Override
    public UserResponse create(UserRequest user) {
        var userEntity = UserMapper.MAPPER.toEntity(user);
        var userDB = userRepository.save(userEntity);
        return UserMapper.MAPPER.toResponse(userDB);
    }

    @Override
    public UserResponse update(UserRequest user, String id) {
        var currentUserDB = userRepository.findById(UUID.fromString(id)).orElseThrow(() -> {
            log.info("User {} not found", id);
            return new ResourceNotFoundException("User " + id + " not found");
        });

        currentUserDB.setFirstName(user.getFirstName());
        currentUserDB.setLastName(user.getLastName());
        currentUserDB.setEmail(user.getEmail());
        currentUserDB.setPhone(user.getPhone());
        currentUserDB.setPassword(user.getPassword());
        userRepository.save(currentUserDB);

        return  UserMapper.MAPPER.toResponse(currentUserDB);
    }

    @Override
    public void deleteUser(UUID id) {

    }
}
