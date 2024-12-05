package fr.mds.cybersiege.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class GameDto {
    private String gameType;

    private List<String> roles;

    public GameDto(String gameType, List<String> roles) {
        this.gameType = gameType;
        this.roles = roles;
    }
}
