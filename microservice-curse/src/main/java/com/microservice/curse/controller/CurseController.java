package com.microservice.curse.controller;

import com.microservice.curse.entities.Curse;
import com.microservice.curse.service.ICurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/curse")
public class CurseController {

    @Autowired
    private ICurseService curseService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Curse curse){
        curseService.save(curse);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(curseService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Curse> findById(@PathVariable Long id) {

        if (id == null){
            return ResponseEntity.badRequest().build();
        }
        else {
            return ResponseEntity.ok(curseService.findById(id));
        }

    }

    @GetMapping("/search-student/{idCurse}")
    public ResponseEntity<?> findStudentsByIdCurse(@PathVariable Long idCurse){
        return ResponseEntity.ok(curseService.findStudentsByIdCurse(idCurse));
    }
}
