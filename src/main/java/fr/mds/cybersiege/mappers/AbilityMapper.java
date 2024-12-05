package fr.mds.cybersiege.mappers;

import fr.mds.cybersiege.dto.AbilityDto;
import fr.mds.cybersiege.entities.AbilityEntity;
import fr.mds.cybersiege.entities.RoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AbilityMapper {
    AbilityMapper INSTANCE = Mappers.getMapper(AbilityMapper.class);

    @Mapping(source = "ability", target = "ability")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "roleId", target = "role")
    AbilityEntity dtoToEntity(AbilityDto dto);

    @Mapping(source = "ability", target = "ability")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "role", target = "roleId")
    AbilityDto entityToDto(AbilityEntity entity);

    default RoleEntity map(Long roleId) {
        if (roleId == null) {
            return null;
        }
        RoleEntity role = new RoleEntity();
        role.setId(roleId);
        return role;
    }

    // Custom mapping method for RoleEntity -> Long
    default Long map(RoleEntity role) {
        return (role == null) ? null : role.getId();
    }
}
