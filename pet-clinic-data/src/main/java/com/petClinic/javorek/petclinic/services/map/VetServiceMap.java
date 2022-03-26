package com.petClinic.javorek.petclinic.services.map;

import com.petClinic.javorek.petclinic.model.Owner;
import com.petClinic.javorek.petclinic.model.Vet;
import com.petClinic.javorek.petclinic.services.CrudService;
import com.petClinic.javorek.petclinic.services.VetService;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
            super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
