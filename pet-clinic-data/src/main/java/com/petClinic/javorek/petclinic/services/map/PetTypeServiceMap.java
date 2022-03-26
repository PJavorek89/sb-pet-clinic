package com.petClinic.javorek.petclinic.services.map;

import com.petClinic.javorek.petclinic.model.PetType;
import com.petClinic.javorek.petclinic.services.PetTypeService;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object.getId(), object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
