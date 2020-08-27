package be.technobel.formation.iris.hibernate.model;
import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="iris_editor")
@Getter
@Setter
@ToString
public class Editor implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="editor_id")
    private Long id;
    @Column
    private String label;
    @Column
    private Address address;

    public Editor() {
    }
}
