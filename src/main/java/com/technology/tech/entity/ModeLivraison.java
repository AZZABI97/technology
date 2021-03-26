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
public class ModeLivraison extends AbstractPersistable<Long> {

    @Column
    private String mode;

    @Column
    private String description;
}
