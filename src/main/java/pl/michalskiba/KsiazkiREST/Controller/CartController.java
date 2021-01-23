package pl.michalskiba.KsiazkiREST.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pl.michalskiba.KsiazkiREST.Model.Book;
import pl.michalskiba.KsiazkiREST.Model.Cart;
import pl.michalskiba.KsiazkiREST.Model.Status;
import pl.michalskiba.KsiazkiREST.Repository.CartRepository;
import pl.michalskiba.KsiazkiREST.Service.BookService;
import pl.michalskiba.KsiazkiREST.Service.CartService;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/cart1")
public class CartController {

    private final CartService cartService;
    private final BookService bookService;
    private final CartRepository cartRepository;

    @Autowired
    public CartController(CartService cartService, BookService bookService, CartRepository cartRepository) {
        this.cartService = cartService;
        this.bookService = bookService;
        this.cartRepository = cartRepository;
    }

    @GetMapping
    public ResponseEntity<List<Cart>> findAll(){
        return ResponseEntity.ok(cartService.findAll());
    }

    @GetMapping("/total")
    public ResponseEntity<BigDecimal> total(){
        return ResponseEntity.ok(cartService.getTotal());
    }

    @GetMapping("/exist")
    public  ResponseEntity<Boolean> exist(){
        return ResponseEntity.ok(cartService.findCart());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Cart> findById(@PathVariable Long id){
        return ResponseEntity.ok(cartService.cartById(id));
    }

    @PostMapping("/add")
//    @PreAuthorize("hasRole('MODERATOR')")
    public ResponseEntity<Cart> create(@Valid @RequestBody Cart cart) 	throws URISyntaxException {
        Cart createdCart = cartService.save(cart);
        if (createdCart == null) {
            return ResponseEntity.notFound().build();
        }
        else {
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(createdCart.getId())
                    .toUri();
            return ResponseEntity.created(uri)
                    .body(createdCart);
        }
    }

//    @GetMapping("/shoppingCart")
//    public ModelAndView shoppingCart() {
//        ModelAndView modelAndView = new ModelAndView("/shoppingCart");
//        modelAndView.addObject("products", cartService.getProductsInCart());
//        modelAndView.addObject("total", cartService.getTotal().toString());
//        return modelAndView;
//    }

    @PutMapping("/shoppingCart/addProduct/{Id}")
    public ResponseEntity<Cart> addProductToCart(@PathVariable("Id") Long id) {
        List<Cart> cart = (cartRepository.findCartByStatus(Status.NOWE));
        Long crid = null;
        for (Cart cr: cart) {
            crid = cr.getId();
            break;
        }
        Book books = (bookService.findById(id).get());
        return ResponseEntity.ok(cartService.addBook(books, crid));
    }

//    @GetMapping("/shoppingCart/removeProduct/{productId}")
//    public ModelAndView removeProductFromCart(@PathVariable("productId") Long productId) {
//        bookService.findById(productId).ifPresent(cartService::removebook);
//        return shoppingCart();
//    }

//    @GetMapping("/shoppingCart/checkout")
//    public ModelAndView checkout() {
//        try {
//            cartService.checkout();
//        } catch (NotEnoughProductsInStockException e) {
//            return shoppingCart().addObject("outOfStockMessage", e.getMessage());
//        }
//        return shoppingCart();
//    }
}