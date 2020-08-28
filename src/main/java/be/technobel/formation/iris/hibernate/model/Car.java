package be.technobel.formation.iris.hibernate.model;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "iris_car")
@Getter
@Setter
@ToString
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name="mark_id", nullable=false)
    private Mark mark;
    @Column
    private String model;
    @Column
    private LocalDate dataAcquisition;


}
