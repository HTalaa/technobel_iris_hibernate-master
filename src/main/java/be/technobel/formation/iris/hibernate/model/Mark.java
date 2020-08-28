package be.technobel.formation.iris.hibernate.model;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "iris_mark")
@Getter
@Setter
@ToString
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mark_id")
    private int id;
    @Column
    private String name;
}
