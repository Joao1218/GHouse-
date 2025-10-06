package com.GHouseApi.GHouseApi.model;

import com.GHouseApi.GHouseApi.enums.userEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class userModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "usuarios_permissoes", nullable = false, length = 100)
    private userEnum usuario_permissoes;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String password;

    @ManyToMany
    private Set<familyModel> familias = new HashSet<>();
}
