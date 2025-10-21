package com.GHouseApi.GHouseApi.dto;

import com.GHouseApi.GHouseApi.enums.accountsEnum;

import java.time.LocalDate;

public record accountsDTO(String nome, String descricao, String foto, accountsEnum status, LocalDate dataVencimento, String codigoBarra) {
}
