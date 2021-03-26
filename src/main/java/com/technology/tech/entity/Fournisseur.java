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
public class Fournisseur extends AbstractPersistable<Long> {



    @Column
    private String nom;

    @Column
    private String mail;

    @Column
    private String tel;

    @Column
    private String fax;

    @Column
    private String adresse;

    @Column
    private String description;

    @OneToMany
    private List<Article> articles;
}
