package fr.mds.cybersiege.services;

import fr.mds.cybersiege.dto.AbilityDto;
import fr.mds.cybersiege.entities.AbilityEntity;
import fr.mds.cybersiege.entities.RoleEntity;
import fr.mds.cybersiege.mappers.AbilityMapper;
import fr.mds.cybersiege.repositories.AbilitiesRepository;
import fr.mds.cybersiege.repositories.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbilityService {
    private final AbilitiesRepository abilitiesRepository;
    private final RolesRepository rolesRepository;

    @Autowired
    public AbilityService(AbilitiesRepository abilitiesRepository, RolesRepository rolesRepository) {
        this.abilitiesRepository = abilitiesRepository;
        this.rolesRepository = rolesRepository;
    }

    public List<AbilityEntity> getAbilities() {
        return abilitiesRepository.findAll();
    }

    public void createAbility(AbilityDto abilityDto) {
        RoleEntity role = rolesRepository.findById(abilityDto.getRoleId()).
            orElseThrow(() -> new RuntimeException("Role not found"));

        AbilityEntity ability = new AbilityEntity();

        ability.setAbility(abilityDto.getAbility());
        ability.setDescription(abilityDto.getDescription());
        ability.setRole(role);

        abilitiesRepository.save(ability);
    }
}
