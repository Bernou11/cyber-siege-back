package fr.mds.cybersiege.controllers;

import fr.mds.cybersiege.dto.AbilityDto;
import fr.mds.cybersiege.entities.AbilityEntity;
import fr.mds.cybersiege.services.AbilityService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CyberSiege/api/abilities")
public class AbilityController {
    @Autowired
    private AbilityService abilityService;

    @GetMapping()
    public List<AbilityEntity> getAbilities() {
        return abilityService.getAbilities();
    }

    @PostMapping()
    public ResponseEntity<String> createAbility(@RequestBody AbilityDto ability) {
        abilityService.createAbility(ability);

        return new ResponseEntity<>("La capacité " + ability.getAbility() + " a été créée", HttpStatus.CREATED);
    }
}
