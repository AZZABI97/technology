package com.technology.tech.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.lang.Nullable;


import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Commande extends AbstractPersistable<Long> {



    @Column
    private Date date;

    @Column
    private Float total;

    @Column
    private String desc;

    /*@OneToOne
    private Facture fact;*/
}
