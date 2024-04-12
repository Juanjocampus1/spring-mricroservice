package com.microservice.curse.service;

import com.microservice.curse.entities.Curse;
import com.microservice.curse.http.response.StudentsByCurseResponse;

import java.util.List;

public interface ICurseService{
    List<Curse> findAll();

    Curse findById(Long id);

    void save(Curse curse);

    StudentsByCurseResponse findStudentsByIdCurse(Long idCurse);
}
