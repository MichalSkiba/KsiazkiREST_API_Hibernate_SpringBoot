package pl.michalskiba.KsiazkiREST.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.michalskiba.KsiazkiREST.Model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
