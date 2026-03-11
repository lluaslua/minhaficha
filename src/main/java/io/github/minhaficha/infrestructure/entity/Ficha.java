package io.github.minhaficha.infrestructure.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ficha")
public class Ficha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 120)
    private String nome;

    @Column(name = "classe", length = 30)
    private String classe;

    @Column(name = "Raca", length = 30)
    private String raca;

    @Column(name = "nivel", length = 2)
    private int nivel;

    @Column(name = "deslocamento", length = 3)
    private int deslocamento;

    @Column(name = "forca", length = 2)
    private int forca;

    @Column(name = "destreza", length = 2)
    private int destreza;

    @Column(name = "constituicao", length = 2)
    private int constituicao;

    @Column(name = "inteligencia", length = 2)
    private int inteligencia;

    @Column(name = "sabedoria", length = 2)
    private int sabedoria;

    @Column(name = "carisma", length = 2)
    private int carisma;

    @Column(name = "vida maxima", length = 4)
    private int vidaMaxima;

    @Column(name = "vida atual", length = 4)
    private int vidaAtual;

    @Column(name = "classe de armadura", length = 2)
    private int classeArmadura;

    @Column(name = "pecas de cobre", length = 100)
    private int pecasCobre;

    @Column(name = "pecas de prata", length = 100)
    private int pecasPrata;

    @Column(name = "pecas de ouro", length = 100)
    private int pecasOuro;

    @Column(name = "pecas de platina", length = 100)
    private int pecasPlatina;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_personagem", referencedColumnName = "id")
    private List<Magia> magias;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_personagem", referencedColumnName = "id")
    private List<Item> itens;



}
