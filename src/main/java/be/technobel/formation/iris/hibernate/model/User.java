package be.technobel.formation.iris.hibernate.model;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "iris_user")
@Getter
@Setter
@ToString
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private Address address;

    @OneToMany(mappedBy = "user")
    Set<UserBook> borrow;
}
