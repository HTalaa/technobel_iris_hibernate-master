package be.technobel.formation.iris.hibernate.model;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="iris_address")
@Getter
@Setter
@ToString
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;
    @Column
    private String street;
    @Column
    private String city;
    @Column
    private  int number;

    public Address() {
    }
}
