package com.petClinic.javorek.petclinic.services;

import com.petClinic.javorek.petclinic.model.Pet;
import com.petClinic.javorek.petclinic.model.Vet;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public interface VetService extends CrudService<Vet, Long>{


}
