package com.spring.springpetclinic.bootstrap;

import com.spring.springpetclinic.model.Owner;
import com.spring.springpetclinic.model.Vet;
import com.spring.springpetclinic.services.OwnerService;
import com.spring.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Nick");
        owner1.setLastName("Nick");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Nick");

        ownerService.save(owner2);

        System.out.println("Loaded owners..");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Vet");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Sally");
        vet2.setLastName("Vet");

        vetService.save(vet2);

        System.out.println("Loaded vets..");

    }
}
