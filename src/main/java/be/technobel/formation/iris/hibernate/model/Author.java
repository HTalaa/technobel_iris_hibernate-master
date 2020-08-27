package be.technobel.formation.iris.hibernate.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name= "iris_author")
@Getter
@Setter
@ToString
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="author_id")
    private Long id;
    @Column
    private String last_name;
    @Column
    private String first_name;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Book_Author"
            //,
            // joinColumns = { @JoinColumn(name = "book_id") },
            //inverseJoinColumns = { @JoinColumn(name = "author_id") }
    )
    Set<Book> books = new HashSet<>();
    public Author() {
    }
}
