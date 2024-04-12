package com.microservice.curse.client;

import com.microservice.curse.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "localhost:8080/api/student/")
public interface StudentClient {

    @GetMapping("/search-By-Curse/{idCurse}")
    List<StudentDTO> findAllStudentsByCurse(@PathVariable Long idCurse);

}
