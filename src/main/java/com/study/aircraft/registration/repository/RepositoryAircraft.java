package com.study.aircraft.registration.repository;

import com.study.aircraft.registration.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryAircraft extends JpaRepository<Aircraft, Long> {


}
