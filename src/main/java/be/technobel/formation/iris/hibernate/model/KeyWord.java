package be.technobel.formation.iris.hibernate.model;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="iris_keyword")
@Getter
@Setter
@ToString
public class KeyWord implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="keyword_id")
    private Long id;
    @Column
    private String word;
   // @Column
   // private Book book;
}
