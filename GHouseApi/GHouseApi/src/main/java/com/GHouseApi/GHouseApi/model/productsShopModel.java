package com.GHouseApi.GHouseApi.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "produtos_compra")
public class productsShopModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private UUID idCompra;
    private UUID idProduto;
    private Integer quantidade;
    private Double precoUnitario;
}
