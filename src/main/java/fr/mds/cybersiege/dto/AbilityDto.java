package fr.mds.cybersiege.dto;

import fr.mds.cybersiege.entities.RoleEntity;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class AbilityDto {
    private String ability;

    private String description;

    private Long roleId;
}
