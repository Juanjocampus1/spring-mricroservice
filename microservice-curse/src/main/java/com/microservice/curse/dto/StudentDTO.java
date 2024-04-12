package com.microservice.curse.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StudentDTO {

        private String name;
        private String lastName;
        private String email;
        private Long courseId;
}
