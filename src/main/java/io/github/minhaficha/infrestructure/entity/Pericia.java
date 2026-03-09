package io.github.minhaficha.infrestructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pericia")
public class Pericia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
