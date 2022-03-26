package com.petClinic.javorek.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PetType extends BaseEntity {

    @Id
    private Long Id;

    @Column
    private String name;

    @Column
    private Long petTypeId;

}
