package com.petClinic.javorek.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pet extends BaseEntity{

    @Id
    private Long Id;

    @Column(name = "pet_type")
    private PetType petType;

    @Column(name = "owner")
    private Owner owner;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    //@Column(name = "visits")
    @Transient
    private Set<Visit> visits;

}
