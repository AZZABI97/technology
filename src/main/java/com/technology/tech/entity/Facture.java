package com.technology.tech.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.lang.Nullable;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Facture")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture extends AbstractPersistable<Long> {



    @Column
    private Date date;

    @Column
    private Float prixht;

    @Column
    private Float tva;

    @Column
    private Float total;

    @Column
    private Float totalht;

    @Column
    private Float totalttc;
}
