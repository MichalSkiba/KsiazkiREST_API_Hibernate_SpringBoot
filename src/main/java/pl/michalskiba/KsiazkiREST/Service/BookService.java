package pl.michalskiba.KsiazkiREST.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.michalskiba.KsiazkiREST.Model.Book;
import pl.michalskiba.KsiazkiREST.Repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    public Book save(Book stock) {
        return bookRepository.save(stock);
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
