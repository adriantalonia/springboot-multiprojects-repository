package com.ram.api.mapper;

import com.ram.api.model.dto.request.RoleRequest;
import com.ram.api.model.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoleMapper {
    RoleMapper MAPPER = Mappers.getMapper( RoleMapper.class );

    Role toEntity(RoleRequest user);
    RoleRequest toResponse(Role user);
}
