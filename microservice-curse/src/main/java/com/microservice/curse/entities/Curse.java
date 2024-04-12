package com.microservice.curse.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@Table(name = "curses")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Curse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String teacher;
}
