package com.microservice.curse.persistece;

import com.microservice.curse.entities.Curse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICurseRepository extends CrudRepository<Curse, Long> {
}
