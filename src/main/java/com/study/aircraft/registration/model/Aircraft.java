package com.study.aircraft.registration.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Aircraft")
@Entity
public class Aircraft{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "Aircraft name")
    private String name;

    @Column(name = "Model")
    private String model;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "Year")
    private Integer year;

}
