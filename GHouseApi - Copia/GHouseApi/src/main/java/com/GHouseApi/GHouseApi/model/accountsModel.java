package com.GHouseApi.GHouseApi.model;

import com.GHouseApi.GHouseApi.enums.accountsEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "contas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class accountsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;

    private String descricao;

    private String foto;

    private accountsEnum status;

    private LocalDate dataVencimento;

    private String numeroCodigoDeBarras;

    private UUID idFamilias;
}
