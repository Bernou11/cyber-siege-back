package fr.mds.cybersiege.mappers;

import fr.mds.cybersiege.dto.RoleDto;
import fr.mds.cybersiege.entities.RoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoleMapper {
    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    @Mapping(source = "gameType", target = "gameType")
    @Mapping(source = "role", target = "role")
    RoleEntity dtoToEntity(RoleDto dto);

    @Mapping(source = "gameType", target = "gameType")
    @Mapping(source = "role", target = "role")
    RoleDto entityToDto(RoleEntity entity);
}
