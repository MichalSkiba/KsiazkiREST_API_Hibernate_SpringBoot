package pl.michalskiba.KsiazkiREST.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.michalskiba.KsiazkiREST.Model.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAll();

    Book findBookById(Integer id);

    Book findBooksByAutor(String autor);


}
