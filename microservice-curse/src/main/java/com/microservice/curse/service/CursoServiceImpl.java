package com.microservice.curse.service;

import com.microservice.curse.client.StudentClient;
import com.microservice.curse.dto.StudentDTO;
import com.microservice.curse.entities.Curse;
import com.microservice.curse.http.response.StudentsByCurseResponse;
import com.microservice.curse.persistece.ICurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements ICurseService {

    @Autowired
    private ICurseRepository curseRepository;

    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Curse> findAll() {
        return (List<Curse>) curseRepository.findAll();
    }

    @Override
    public Curse findById(Long id) {
        return curseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Curse curse) {
        curseRepository.save(curse);
    }

    @Override
    public StudentsByCurseResponse findStudentsByIdCurse(Long idCurse) {

        Curse curse = curseRepository.findById(idCurse).orElse(new Curse());

        List<StudentDTO> studentsDTOList = studentClient.findAllStudentsByCurse(idCurse);

        return StudentsByCurseResponse.builder()
                .curseName(curse.getName())
                .teacher(curse.getTeacher())
                .studentsDTOList(studentsDTOList)
                .build();
    }
}
