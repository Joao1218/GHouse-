package com.GHouseApi.GHouseApi.dto;

import java.time.LocalDate;

public record accountsDTO(String nome, String descricao, String foto, String status, LocalDate dataVencimento, String codigoBarra) {
}
