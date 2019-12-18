package pl.michalskiba.KsiazkiREST.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pl.michalskiba.KsiazkiREST.Model.Book;
import pl.michalskiba.KsiazkiREST.Repository.BookRepository;
import pl.michalskiba.KsiazkiREST.Service.BookService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/apib/")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @GetMapping(value = "/books")
//    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public List<Book> list() {
        return bookRepository.findAll();
    }

    @GetMapping(value = "/books/{id}")
    public Book listByID(@PathVariable Integer id) {
        return bookRepository.findBookById(id);
    }

    @GetMapping(value = "/AutorBooks/{autor}")
    public List<Book> listByAutor(@PathVariable String autor) {
        return bookRepository.findBooksByAutorContains(autor);
    }


//
//    @POST
//    @Path("/add")
//    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Book add(@FormParam("id")int id,@FormParam("tytul") String tytul, @FormParam("autor") String autor,
//                    @FormParam("jakosc") String jakosc, @FormParam("stron")int stron, @FormParam("cena")int cena, @FormParam("url") String url){
//        Book book = new Book(id, tytul,  autor, jakosc, stron, cena, url);
//        BookDAO.addBook(book);
//        return book;
//    }
//
//    @PUT
//    @Path("/update/{id}")
//    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//    @Produces(MediaType.APPLICATION_JSON)
//    public String update(@PathParam("id") int id, @FormParam("autor") String autor){
//
//        BookDAO.setAutor(id, autor);
//        return "update";
//    }
//
//    @DELETE
//    @Path("/delete/{id}")
//    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//    @Produces(MediaType.APPLICATION_JSON)
//    public String delete(@PathParam("id") int id){
//        BookDAO.deleteBook(id);
//        return "delete";
//    }


}

