package com.GHouseApi.GHouseApi.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "familias")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class familyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private UUID id;

    @Column(name = "name", nullable = false)
    private String nome;

    @ManyToMany(mappedBy = "familias")
    private Set<userModel> usuarios = new HashSet<>();
}
