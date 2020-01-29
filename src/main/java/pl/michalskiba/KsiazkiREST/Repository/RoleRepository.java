package pl.michalskiba.KsiazkiREST.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.michalskiba.KsiazkiREST.Model.ERole;
import pl.michalskiba.KsiazkiREST.Model.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
