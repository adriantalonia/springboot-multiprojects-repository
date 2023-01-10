package com.ram.api.mapper;

import com.ram.api.model.dto.request.UserRequest;
import com.ram.api.model.dto.response.UserResponse;
import com.ram.api.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper MAPPER = Mappers.getMapper( UserMapper.class );

    User toEntity(UserRequest user);
    UserResponse toResponse(User user);
}
