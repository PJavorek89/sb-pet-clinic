package com.petClinic.javorek.petclinic.model;

public class PetType extends BaseEntity {

    private String name;
    private Long Id;

    @Override
    public Long getId() {
        return Id;
    }

    @Override
    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
