package be.technobel.formation.iris.hibernate.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "iris_book")
@Getter
@Setter
@ToString
public class Book implements Serializable {

    @Id
    @Column
    private Long isbn;
    @Column
    private String title;
    @Column
    private int number_page;
    @Column
    private Editor editor;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Book_Author"
            //,
           // joinColumns = { @JoinColumn(name = "book_id") },
            //inverseJoinColumns = { @JoinColumn(name = "author_id") }
    )
    Set<Author> authors = new HashSet<>();
    public Book() {
    }
}
