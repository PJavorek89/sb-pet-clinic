package com.petClinic.javorek.petclinic.services;

import com.petClinic.javorek.petclinic.model.Owner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);


}
