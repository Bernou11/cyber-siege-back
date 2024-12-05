package fr.mds.cybersiege.repositories;

import fr.mds.cybersiege.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolesRepository extends JpaRepository<RoleEntity, Long> {
    List<RoleEntity> findRolesByGameType(String gameType);

    @Query("SELECT r FROM RoleEntity r")
    List<RoleEntity> findAllRoles();

    @Query(nativeQuery = true, value = "SELECT DISTINCT game_type FROM CyberSiege.roles")
    List<String> findGameTypes();
}
