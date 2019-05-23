package pl.michalskiba.KsiazkiREST.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.michalskiba.KsiazkiREST.Model.Book;

import java.util.List;

@Repository("bookRepository")
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAll();

    Book findBookById(Integer id);

    List<Book> findBooksByAutorContains(String autor);


}
