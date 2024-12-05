package fr.mds.cybersiege.services;

import fr.mds.cybersiege.dto.GameDto;
import fr.mds.cybersiege.dto.RoleDto;
import fr.mds.cybersiege.entities.RoleEntity;

import java.util.*;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.mds.cybersiege.repositories.RolesRepository;

import java.util.stream.Collectors;

@Service
public class RoleService {
    private final RolesRepository roleRepository;

    @Autowired
    public RoleService(RolesRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<RoleEntity> getRoles() {
        return roleRepository.findAllRoles();
    }

    public void createRole(RoleDto newRole) {
        RoleEntity role = new RoleEntity();

        role.setRole(newRole.getRole());
        role.setGameType(newRole.getGameType());

        roleRepository.save(role);
    }

    public List<String> getGameTypes() {
        return roleRepository.findGameTypes();
    }

    @Transactional
    public List<String> getRolesByGameType(GameDto dto) {
        List<RoleEntity> roles = roleRepository.findRolesByGameType(dto.getGameType());

        return roles.stream().map(RoleEntity::getRole).collect(Collectors.toList());
    }
}
