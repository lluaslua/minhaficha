package io.github.minhaficha.infrestructure.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "magia")
public class Magia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nivel", length = 2)
    private int nivel;

    @Column(name = "nome", length = 30)
    private String nome;

    @Column(name = "dados", length = 60)
    private String dados;

    @Column(name = "descricao", length = 500)
    private String descricao;

}
