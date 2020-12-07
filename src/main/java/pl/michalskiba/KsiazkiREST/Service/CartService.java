package pl.michalskiba.KsiazkiREST.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.michalskiba.KsiazkiREST.Model.Book;
import pl.michalskiba.KsiazkiREST.Model.Cart;
import pl.michalskiba.KsiazkiREST.Model.Status;
import pl.michalskiba.KsiazkiREST.Repository.BookRepository;
import pl.michalskiba.KsiazkiREST.Repository.CartRepository;

import java.math.BigDecimal;
import java.util.*;

@Service
public class CartService {

    private final CartRepository cartRepository;

    private BookRepository bookRepository;

    private final BookService bookService;

    private Map<Book, Integer> books = new HashMap<>();

    @Autowired
    public CartService(CartRepository cartRepository, BookRepository bookRepository, BookService bookService) {
        this.cartRepository = cartRepository;
        this.bookRepository = bookRepository;
        this.bookService = bookService;

    }

    public Boolean findCart() {
        return cartRepository.existsCartBy();
    }

    public List<Cart> findAll(){
        return cartRepository.findAll();
    }


//    public void checkout() throws NotEnoughbooksInStockException {
//        Book book;
//        for (Map.Entry<Book, Integer> entry : books.entrySet()) {
//            // Refresh quantity for every book before checking
//            book = bookRepository.findOne(entry.getKey().getId());
//            if (book.getStron() < entry.getValue())
//                throw new NotEnoughbooksInStockException(book);
//            entry.getKey().(book.getQuantity() - entry.getValue());
//        }
//        bookRepository.save(books.keySet());
//        bookRepository.flush();
//        books.clear();
//    }

    public BigDecimal getTotal() {
        return books.entrySet().stream()
                .map(entry -> entry.getKey().getCena().multiply(BigDecimal.valueOf(entry.getValue())))
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }


//    public addBook(Long id) {
//        Optional<Book> book = bookRepository.findById(id);
//        Cart cart = new Cart();
//        if (!findCart()){
//            cart.getLinesItems().add(book);
//        } else {
//            for (Cart carts: findAll()) {
//                if(carts.getStatus() == Status.NOWE){
//                    carts.getLinesItems().add(book);
//                }else if (carts.getStatus() == Status.ZAPISANE){
//                    carts.getLinesItems().add(book);
//                }
//            }
//        }
//    }


    public void removebook(Book book) {
        if (books.containsKey(book)) {
            if (books.get(book) > 1)
                books.replace(book, books.get(book) - 1);
            else if (books.get(book) == 1) {
                books.remove(book);
            }
        }
    }

    public Object getProductsInCart() {
        return Collections.unmodifiableMap(books);
    }

    public Cart save(Cart stock) {

        stock.getId();
        stock.setIdCart(UUID.randomUUID());
        stock.setStatus(Status.NOWE);
        return cartRepository.save(stock);
    }


}