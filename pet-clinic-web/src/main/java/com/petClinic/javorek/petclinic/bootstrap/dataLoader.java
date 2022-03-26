package com.petClinic.javorek.petclinic.bootstrap;

import com.petClinic.javorek.petclinic.model.Owner;
import com.petClinic.javorek.petclinic.model.PetType;
import com.petClinic.javorek.petclinic.model.Vet;
import com.petClinic.javorek.petclinic.services.OwnerService;
import com.petClinic.javorek.petclinic.services.PetTypeService;
import com.petClinic.javorek.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class dataLoader implements CommandLineRunner {


    @Autowired
    private final OwnerService ownerService;
    @Autowired
    private final VetService vetService;
    @Autowired
    private final PetTypeService petTypeService;

    public dataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");

        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");

        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = Owner.builder()
                            .id(1L)
                            .firstName("Michael")
                            .lastName("Weston")
                            .build();
        ownerService.save(owner1);

        Owner owner2 = Owner.builder()
                .id(2L)
                .firstName("Fiona")
                .lastName("Glenane")
                .build();
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = Vet.builder()
                .Id(1L)
                .firstName("Sam")
                .lastName("Axe")
                .build();

        vetService.save(vet1);

        Vet vet2 = Vet.builder()
                .Id(2L)
                .firstName("Jessie")
                .lastName("Porter")
                .build();

        vetService.save(vet2);

        System.out.println("Loaded vet...");


    }
}
