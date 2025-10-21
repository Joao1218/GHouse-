package com.GHouseApi.GHouseApi.dto;

import java.util.UUID;

public record productsShoppDTO(Integer quantidade, Double precoUnitario, Double subTotal, UUID idProduto) {
}
