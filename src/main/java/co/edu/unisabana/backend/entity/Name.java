package co.edu.unisabana.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "names")
@Getter
@Setter
@NoArgsConstructor
public class Name {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Name(String name) {
        this.name = name;
    }
}
