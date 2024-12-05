package fr.mds.cybersiege.repositories;

import fr.mds.cybersiege.entities.AbilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbilitiesRepository extends JpaRepository<AbilityEntity, Long> {
}
