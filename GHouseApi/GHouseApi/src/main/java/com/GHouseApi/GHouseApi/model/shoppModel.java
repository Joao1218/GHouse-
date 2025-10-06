package com.GHouseApi.GHouseApi.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "compras")
public class shoppModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private UUID idUser;
    private UUID idFamilia;
    private LocalDate dataCompra;
    private Double valorTotal;
}
