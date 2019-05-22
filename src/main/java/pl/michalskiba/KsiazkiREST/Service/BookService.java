package pl.michalskiba.KsiazkiREST.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.michalskiba.KsiazkiREST.Model.Book;
import pl.michalskiba.KsiazkiREST.Repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

//    public Iterable<Book> list(){
//        return bookRepository.findAll();
//    }
}
