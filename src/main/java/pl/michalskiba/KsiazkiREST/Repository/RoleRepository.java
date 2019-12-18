package pl.michalskiba.KsiazkiREST.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.michalskiba.KsiazkiREST.Model.Role;
import pl.michalskiba.KsiazkiREST.Model.RoleName;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
