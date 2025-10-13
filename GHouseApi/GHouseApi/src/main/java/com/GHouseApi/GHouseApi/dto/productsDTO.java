package com.GHouseApi.GHouseApi.dto;

import com.GHouseApi.GHouseApi.enums.productsEnum;

public record productsDTO(String nome, String descricao, productsEnum categoria, Double preco) {
}
