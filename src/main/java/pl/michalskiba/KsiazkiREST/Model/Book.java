package pl.michalskiba.KsiazkiREST.Model;

import lombok.*;
import org.springframework.stereotype.Indexed;

import javax.persistence.*;
import javax.validation.constraints.Min;
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
    @Min(value = 0)
    private int stron;
    @Min(value = 0)
    private BigDecimal cena;
    private String url;
    private String url2;

    public BigDecimal getCena() {
        return cena;
    }

    public Long getId() {
        return id;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public String getJakosc() {
        return jakosc;
    }

    public int getStron() {
        return stron;
    }

    public String getUrl() {
        return url;
    }

    public String getUrl2() {
        return url2;
    }
}

