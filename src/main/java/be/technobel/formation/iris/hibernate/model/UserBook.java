package be.technobel.formation.iris.hibernate.model;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "iris_userbook")
@Getter
@Setter
@ToString
public class UserBook implements Serializable {
    private Long book_id;
    private Long user_id;
    @Column
    private LocalDate startAt;
    @Column
    private LocalDate endAt;
}
