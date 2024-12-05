package fr.mds.cybersiege.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "roles", schema = "CyberSiege")
@EqualsAndHashCode
@NoArgsConstructor
public class RoleEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "game_type", nullable = false)
    private String gameType;
}
