package com.study.aircraft.registration.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.study.aircraft.registration.model.Aircraft;
import com.study.aircraft.registration.service.ServiceAircraft;

@RestController
@RequestMapping("/aeronaves")
@CrossOrigin("*")
public class ControllerAircraft {

    private final ServiceAircraft service;

    public ControllerAircraft(ServiceAircraft service) {
        this.service = service;
    }

    @GetMapping
    public List<Aircraft> list() {
        return service.list();
    }

    @PostMapping
    public Aircraft save(@RequestBody Aircraft aircraft) {
        return service.save(aircraft);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public Aircraft toUpdate(@PathVariable Long id,
                              @RequestBody Aircraft aircraft) {
        return service.toUpdate(id, aircraft);
    }
}
