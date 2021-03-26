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
    private String adr;

    @Column
    private String desc;

    /*@OneToMany
    private List<Article> articles;*/
}
