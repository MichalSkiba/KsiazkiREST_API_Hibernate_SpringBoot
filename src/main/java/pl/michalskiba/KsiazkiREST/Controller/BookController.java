package pl.michalskiba.KsiazkiREST.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.michalskiba.KsiazkiREST.Model.Book;
import pl.michalskiba.KsiazkiREST.Service.BookService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> findAll() {
        return ResponseEntity.ok(bookService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id) {
        Optional<Book> product = bookService.findById(id);
        return ResponseEntity.ok(bookService.findById(id).get());
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
//    @PreAuthorize("hasRole('MODERATOR')")
    public ResponseEntity<Book> create(@RequestBody Book book) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.save(book));
    }

    @PutMapping("/{id}")
//    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Book> update(@PathVariable Long id, @RequestBody Book product) {
        return ResponseEntity.accepted().body(bookService.save(product));
    }

    @DeleteMapping("/{id}")
//    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity delete(@PathVariable Long id) {
        bookService.deleteById(id);
        return ResponseEntity.accepted().build();
    }


}

