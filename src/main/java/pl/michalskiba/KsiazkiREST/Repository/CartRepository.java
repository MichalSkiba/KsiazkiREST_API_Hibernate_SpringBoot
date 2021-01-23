package pl.michalskiba.KsiazkiREST.Repository;

import org.hibernate.loader.plan.build.internal.returns.SimpleEntityIdentifierDescriptionImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.michalskiba.KsiazkiREST.Model.Cart;
import pl.michalskiba.KsiazkiREST.Model.Status;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    Boolean existsCartBy ();
    Cart findCartById(Long id);
    List<Cart> findCartByStatus (Status status);


}
