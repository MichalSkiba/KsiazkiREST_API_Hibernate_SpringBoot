package pl.michalskiba.KsiazkiREST.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.michalskiba.KsiazkiREST.Repository.BookRepository;

@Service("bookService")
public class BookService {


    @Autowired
    private BookRepository bookRepository;





}
