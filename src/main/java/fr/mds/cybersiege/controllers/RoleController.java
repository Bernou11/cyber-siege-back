package fr.mds.cybersiege.controllers;

import fr.mds.cybersiege.dto.GameDto;
import fr.mds.cybersiege.dto.RoleDto;
import fr.mds.cybersiege.entities.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import fr.mds.cybersiege.services.RoleService;

import java.util.List;

@RestController
@RequestMapping("/CyberSiege/api/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/{gameType}")
    public List<String> getRolesByGameType(@PathVariable String gameType) {
        return roleService.getRolesByGameType(new GameDto(gameType, null));
    }

    @GetMapping()
    public List<RoleEntity> getRoles() {
        return roleService.getRoles();
    }

    @PostMapping("/createRole")
    public ResponseEntity<String> createRole(@RequestBody RoleDto role) {
        roleService.createRole(role);
        return new ResponseEntity<>("Le role " + role.getRole() + " a été créé", HttpStatus.CREATED);
    }

    @GetMapping("/gameTypes")
    public List<String> getGameTypes() {
        return roleService.getGameTypes();
    }
}
