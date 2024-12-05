package fr.mds.cybersiege.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "abilities", schema = "CyberSiege")
@EqualsAndHashCode
@NoArgsConstructor
public class AbilityEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "ability", nullable = false)
    private String ability;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private RoleEntity role;
}
