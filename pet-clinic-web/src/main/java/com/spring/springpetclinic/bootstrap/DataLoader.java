package com.spring.springpetclinic.bootstrap;

import com.spring.springpetclinic.model.Owner;
import com.spring.springpetclinic.model.Vet;
import com.spring.springpetclinic.services.OwnerService;
import com.spring.springpetclinic.services.VetService;
import com.spring.springpetclinic.services.map.OwnerServiceMap;
import com.spring.springpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(){
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Nick");
        owner1.setLastName("Nick");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Nick");

        ownerService.save(owner2);

        System.out.println("Loaded owners..");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Vet");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Sally");
        vet2.setLastName("Vet");

        vetService.save(vet2);

        System.out.println("Loaded vets..");

    }
}
