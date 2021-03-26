package com.technology.tech.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.lang.Nullable;


import javax.persistence.*;


@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Article extends AbstractPersistable<Long> {



    @Column
    private String nom;

    @Column
    private double prix;

    @Column
    private Integer qtestock;

    @Column
    private Integer ttva;

    @Column
    private Integer tremise;

    @Column
    private String description;

    @ManyToOne
    private Marque marque;

    @ManyToOne
    private Categorie categorie;

    /*@OneToMany
    private List<Commande> commandes;*/
}
