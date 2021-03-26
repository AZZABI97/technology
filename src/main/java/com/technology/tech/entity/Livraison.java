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
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Livraison extends AbstractPersistable<Long> {



    @Column
    private Date date;

    @Column
    private String description;

    @OneToOne
    private ModeLivraison mode;
}
