package pl.michalskiba.KsiazkiREST.Model;

import lombok.*;
import org.springframework.stereotype.Indexed;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@XmlRootElement
@Indexed
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tytul;
    private String autor;
    private String jakosc;
    private int stron;
    private BigDecimal cena;
    private String url;
    private String url2;

}

