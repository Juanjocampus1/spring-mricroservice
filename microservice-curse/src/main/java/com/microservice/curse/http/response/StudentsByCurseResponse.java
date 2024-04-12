package com.microservice.curse.http.response;

import com.microservice.curse.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentsByCurseResponse {

    private String curseName;
    private String teacher;
    private List<StudentDTO> studentsDTOList;

}
