package com.petClinic.javorek.petclinic.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by jt on 7/29/18.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visit extends BaseEntity {

    @Id
    private Long Id;

    @Column
    private LocalDate date;

    @Column
    private String description;

    @Column
    private Pet pet;

}