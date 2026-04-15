package com.study.aircraft.registration.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.study.aircraft.registration.model.Aircraft;
import com.study.aircraft.registration.repository.RepositoryAircraft;

@Service
public class ServiceAircraft{

    private final RepositoryAircraft repository;

    public ServiceAircraft(RepositoryAircraft repository) {
        this.repository = repository;

    }

    public List<Aircraft> list() {
        return repository.findAll();
    }

    public Aircraft save(Aircraft aircraft) {
        return repository.save(aircraft);
    }

    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Aircraft not found");
        }
        repository.deleteById(id);
    }

    public Aircraft toUpdate(Long id, Aircraft newAircraft) {
        Aircraft aircraft = repository.findById(id).orElseThrow(()
                -> new RuntimeException("Aircraft not found"));
        aircraft.setName(newAircraft.getName());
        aircraft.setModel(newAircraft.getModel());
        aircraft.setManufacturer(newAircraft.getManufacturer());
        aircraft.setYear(newAircraft.getYear());

        // salva atualizado
        return repository.save(aircraft);
    }
}