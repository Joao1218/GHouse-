package com.GHouseApi.GHouseApi.model;

import com.GHouseApi.GHouseApi.enums.productsEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "produtos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class productsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;
    private String descricao;
    private productsEnum categoria;
    private Double preco;
    private UUID idFamilia;
}
