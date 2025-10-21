package com.GHouseApi.GHouseApi.dto;

import com.GHouseApi.GHouseApi.enums.paymentsEnum;

import java.time.LocalDate;
import java.util.UUID;

public record paymentsDTO(String fotoComprovante, LocalDate dataPagamento, paymentsEnum status) {
}
