package com.technology.tech.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.lang.Nullable;


import javax.persistence.*;
import java.util.List;


@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client extends AbstractPersistable<Long> {



    @Column(name = "Nom")
    private String nom;

    @Column(name = "Prenom")
    private String prenom;

    @Column(name = "Sexe")
    private String sexe;

    @Column(name = "Adresse")
    private String adresse;

    @Column(name = "Telephone")
    private String tel;

    @Column(name = "CIN")
    private String cin;

    @Column(name = "Remarque")
    private String remarque;

    @OneToOne
    private User user;

    @ManyToOne
    private Ville ville;

    @OneToMany
    private List<Commande> commandes;
}
